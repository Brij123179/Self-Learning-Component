public class LeftRotateD {
    public static void rotateD(int[] arr, int d) {
        d %= arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    private static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int t = arr[l]; arr[l++] = arr[r]; arr[r--] = t;
        }
    }

    public static void main(String[] args) {
        // Test here
    }
}