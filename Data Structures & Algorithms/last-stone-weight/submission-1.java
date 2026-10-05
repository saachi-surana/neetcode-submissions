class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) {
            maxHeap.offer(stone);
        }
            
            while(!maxHeap.isEmpty()){
                if(maxHeap.size() == 1) {
                    return maxHeap.poll();
                }
                int x = maxHeap.poll();
                int y = maxHeap.poll();
                if(x != y) {
                    maxHeap.offer(Math.abs(x-y));
                }
            }
        return 0;
    }
}
