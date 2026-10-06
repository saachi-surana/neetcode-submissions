class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] finalArr = new int[nums.length];
        finalArr[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            finalArr[i] = nums[i - 1] * finalArr[i - 1];
        }

        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            finalArr[i] = finalArr[i] * right;
            right = right * nums[i];
        }
        return finalArr;
    }
}  
