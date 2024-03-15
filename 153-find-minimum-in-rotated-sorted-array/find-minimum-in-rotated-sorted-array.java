public class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 0) {
            return -1; 
        } else if (nums.length == 1 || nums[0] < nums[nums.length - 1]) {
            return nums[0]; 
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return nums[left];
    }
}
