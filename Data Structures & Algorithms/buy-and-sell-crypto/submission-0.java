class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE; // assume big val easy to find min value

        for(int price : prices){
            if(price < minprice){
                minprice = price;
            }else{
                maxprofit = Math.max(maxprofit , price - minprice);
            }
        }
        return maxprofit;
    }
}
