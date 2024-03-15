class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
                return true;
            }
        int n2 = num/2;
        for(int i = 1;i<=n2;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
        
    }
}