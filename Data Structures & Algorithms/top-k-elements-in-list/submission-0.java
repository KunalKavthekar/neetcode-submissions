class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> instanceCounter = new HashMap<>();
        for(int num : nums) {
            instanceCounter.put(num, instanceCounter.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> instanceCounter.get(a) - instanceCounter.get(b)
        );

        for(int num : instanceCounter.keySet()) {
            minHeap.add(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;

    }
}
