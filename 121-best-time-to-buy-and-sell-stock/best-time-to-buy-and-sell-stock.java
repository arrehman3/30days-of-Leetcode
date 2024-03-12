class Solution {
    public int maxProfit(int[] prices) {
        int minSale=Integer.MAX_VALUE;
        int maxSale =0;

        for(int price : prices){
            minSale=Math.min(minSale,price);
            maxSale = Math.max(maxSale,price-minSale);
        }

        return maxSale;
    }
}