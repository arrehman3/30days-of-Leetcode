class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        ArrayList <Integer> list = new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        for(int i=0;i<=n;i++){
            if(!list.contains(i)){
                System.out.println(i);
                return i;
                
            }
            ;
        }
        // System.out.println("Jere");
        return -1;
    }
}