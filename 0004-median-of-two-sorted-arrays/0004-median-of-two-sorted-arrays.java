class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length)
            arr[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];

        while (i < nums1.length) arr[k++] = nums1[i++];
        while (j < nums2.length) arr[k++] = nums2[j++];

        int n = arr.length;
        return n % 2 == 0 ? (arr[n/2 - 1] + arr[n/2]) / 2.0 : arr[n/2];
    }
}
    