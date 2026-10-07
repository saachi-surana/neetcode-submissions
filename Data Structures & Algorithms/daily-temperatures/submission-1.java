class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 0) return new int[]{};
        if(temperatures.length == 1) return new int[]{temperatures[0]};
        int[] result = new int[temperatures.length];
        int total = 1;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < temperatures.length - 1; i++) {
            stack.push(i);
            while(temperatures[i + 1] > temperatures[stack.peek()]) {
                result[stack.peek()] = (i + 1 - stack.peek());
                total++;
                stack.pop();
                if(stack.isEmpty()) break;
            }
            
        }
        if(stack.isEmpty()) {
            for(int j = total - 1; j < temperatures.length; j++) {
                result[j] = 0;
            }
        }
        return result;
    }
}
