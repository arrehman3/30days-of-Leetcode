public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reversed = 0;
        for(int i =0;i<32;i++){
            int bit = n&1;
            reversed<<=1;
            reversed=reversed|bit;
            n>>>=1;
        }
        return reversed ;   
    }
}
