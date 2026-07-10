class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;//last valid ele in nums1
        int j = n-1; // last ele in nums2
        int k = m+n-1; // last final position to insert biggest value

        while(i >= 0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}