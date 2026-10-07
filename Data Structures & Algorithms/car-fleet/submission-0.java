class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[] times = new double[position.length];
        Integer[] order = new Integer[position.length];

        for(int i = 0; i < position.length; i++) {
            order[i] = i;
        }

        Arrays.sort(order, (a, b) -> position[b] - position[a]);

        ArrayDeque<Double> stack = new ArrayDeque<>();
        for(int i : order) {
            double time = (double) (target - position[i]) / speed[i];
            if(stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}
