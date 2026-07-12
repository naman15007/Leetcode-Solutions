class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrows = matrix.length;
        int totalcolm = matrix[0].length;
        int n = totalrows * totalcolm;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int rowindex = mid / totalcolm;
            int colmindex = mid % totalcolm;
            if(matrix[rowindex][colmindex]==target){
                return true;
            }

            else if(matrix[rowindex][colmindex] > target){
                end = mid - 1;
            }

            else{
               start = mid + 1;
            }
        }
        return false;
    }
}