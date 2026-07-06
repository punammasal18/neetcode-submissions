class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int count =0 , num = n/2 , repeated =-1;

        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                count++;
                if(count > num){
                    repeated = nums[i];
                }
            }
            else{
                set.add(nums[i]);
            }
        }
        return repeated;
    }
}