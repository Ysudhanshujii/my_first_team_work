class Solution {
    public void reverse(int[] arr, int n) {
        int start = 0;
        int end = n - 1;

        // Swap elements from start and end until they meet
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
