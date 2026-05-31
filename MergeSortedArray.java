class MergeSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int i = 0, j = 0;
        int pos = 0;

        int[] result = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[pos] = nums1[i];
                i++;
            } else {
                result[pos] = nums2[j];
                j++;
            }
            pos++;
        }

        while (i < m) {
            result[pos] = nums1[i];
            i++;
            pos++;
        }

        while (j < n) {
            result[pos] = nums2[j];
            j++;
            pos++;
        }

        int total = m + n;

        if (total % 2 == 1) {
            return result[total / 2];
        }

        return (result[total / 2 - 1] + result[total / 2]) / 2.0;
    }
}