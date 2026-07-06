class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;   // possible majority element
        int count = 0;       // balance counter

        // Step 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;   // choose new candidate
            }
            if (num == candidate) {
                count = count + 1; // same as candidate => increase count
            } else {
                count = count - 1; // different => decrease count
            }
        }
        return candidate;
    }
}
