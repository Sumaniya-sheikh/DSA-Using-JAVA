public class sortedSquare {

    public static int[] sortedSquares(int[] arr) {

        int n = arr.length;

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        int[] result = new int[n];

        while (left <= right) {

            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if (leftSq > rightSq) {
                result[pos] = leftSq;
                left++;
            } else {
                result[pos] = rightSq;
                right--;
            }

            pos--;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {-7, -3, 2, 3, 11};

        int[] result = sortedSquares(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}