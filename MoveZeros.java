public class MoveZeros {
    public static void moveZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int t = arr[i]; arr[i] = arr[j]; arr[j++] = t;
            }
        }
    }

    public static void main(String[] args) {
        // Test here
    }
}