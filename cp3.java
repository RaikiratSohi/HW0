public class Solution {

// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        //initalize counter variables
        int i = 0;
        int j = 0;
        int result = 0;
        
        //setup a minHeap
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for(i = 0; i < A.size(); i++) {
            heap.offer(A.get(i));
        }
        
        //remove until K-1 index
        for(j = 0; j < B; j++) {
            result = heap.poll();
        }
        
        return result;
    }
}