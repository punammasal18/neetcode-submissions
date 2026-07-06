class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int missing =-1 , repeated=-1;
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                repeated = nums[i];
            }else{
                set.add(nums[i]);
            }
        }

        int num = n+1;
        for(int k=1;k<=num;k++){
            if(!set.contains(k)){
                missing = k;
                break;
            }
        }
        return missing;
    }
}