class Solution {
    public int maxArea(int[] heights) {
        int maxCap =0;
        int start =0;
        int end = heights.length-1;
        while(start < end){ // start <= end not because when collapse it doesny stores water
            int height = Math.min(heights[start] , heights[end]);
            int width = end - start;
            int currCap = height * width;
            maxCap = Math.max(currCap , maxCap);
            if(heights[start] < heights[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxCap;
    }
}
