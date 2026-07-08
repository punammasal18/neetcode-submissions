class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int n = nums.length;
        
        int k = 1; // answer array start index  
        for(int i=1 ; i<n ; i++){
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}