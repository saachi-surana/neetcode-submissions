class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length == 0) return 0;
        // Arrays.sort(nums);
        // int max = 1;
        // int curr = 1;
        // for(int i = 1; i < nums.length; i++) {
        //     if(nums[i] == nums[i - 1] + 1) {
        //         curr++;
        //     } else if (nums[i] == nums[i - 1]){
        //         continue;
        //     } else {
        //         max = Math.max(max, curr);
        //         curr = 1;
        //     }
        // }
        // return Math.max(max, curr);

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int curr = 1;
        int max = 0;
        for(int num : set) {
            if(!set.contains(num - 1)) {
                curr = 1;;
                while(set.contains(num + curr)) {
                    curr++;
                }
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}
