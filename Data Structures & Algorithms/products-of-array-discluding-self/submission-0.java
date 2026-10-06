class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        int[] finalArr = new int[nums.length];
        leftArr[0] = 1;
        rightArr[nums.length - 1] = 1;
        for(int i = 1; i < nums.length; i++) {
            leftArr[i] = nums[i - 1] * leftArr[i - 1];
        }
        for(int i = nums.length - 2; i >= 0; i--) {
            rightArr[i] = nums[i + 1] * rightArr[i + 1];
        }
        for(int i = 0; i < nums.length; i++) {
            finalArr[i] = leftArr[i] * rightArr[i];
        }
        return finalArr;
    }
}  
