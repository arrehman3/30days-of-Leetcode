class Solution {
    public boolean isPalindrome(int x) {
        String n=Integer.toString(x);
        int len = n.length();
        if(len==1){
            return true;
        }
        else{
            for(int i=0;i<len;i++){
                if(n.charAt(i)!=n.charAt(len-i-1)){
                    return false;
              }  
            }
            return true;
        }
        
    }
}