class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;
        int count = 0;
        int i = 0;
        int j = 1;

        while (j < n) {

            int cs = intervals[i][0];
            int ce = intervals[i][1];

            int ns = intervals[j][0];
            int ne = intervals[j][1];

            if (ce <= ns) { // No overlap
                i = j;
            } else if (ce <= ne) { // Overlap, remove current interval
                count++;
            } else { // ce > ne, remove previous interval
                count++;
                i = j;
            }

            j++;
        }

        return count;
    }
}