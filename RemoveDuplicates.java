public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) arr[j++] = arr[i];
        }
        return j;
    }

    public static void main(String[] args) {
        // Test here
    }
}