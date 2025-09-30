public class LargestElement {
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        System.out.println("Largest: " + largest(arr));
    }
}
