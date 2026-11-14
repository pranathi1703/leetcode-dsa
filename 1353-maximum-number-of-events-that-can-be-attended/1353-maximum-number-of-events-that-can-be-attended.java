class Solution {
    public int maxEvents(int[][] events) {
        // Sort by starting day
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        int day = 0;
        int count = 0;
        int n = events.length;

        while (i < n || !pq.isEmpty()) {

            // Phase 1: Jump to the next event if heap is empty
            if (pq.isEmpty()) {
                day = Math.max(day, events[i][0]);
            }

            // Phase 2: Add all available events
            while (i < n && events[i][0] <= day) {
                pq.offer(events[i][1]);
                i++;
            }

            // Phase 3: Remove expired events
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // Phase 4: Attend the event ending earliest
            if (!pq.isEmpty()) {
                pq.poll();
                count++;
                day++;
            }
        }

        return count;
    }
}