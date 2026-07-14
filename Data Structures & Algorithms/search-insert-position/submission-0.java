class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return start; // insertion position
    }
}
