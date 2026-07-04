import java.util.Arrays;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b) ->a[0]-b[0] );
        List<int[]> list = new ArrayList<>();
        int start = intervals[0][0]; //[1,3] //1
        int end = intervals[0][1]; // 3
        for(int i = 1 ; i < intervals.length ; i++ ){
            int st = intervals[i][0]; //2
            int en = intervals[i][1]; //6
            if(st <= end){ // 2 // 3
            end = Math.max(end,en);
            }else{
                list.add(new int[] {start,end});
                start = st;
                end = en;
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}