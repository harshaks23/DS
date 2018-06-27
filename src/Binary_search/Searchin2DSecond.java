package Binary_search;

public class Searchin2DSecond {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix.length == 0 ) {
                return false;
            }

            int row=0;
            int column=matrix[0].length-1;
            while(row<=matrix.length-1 && column>=0 )
            {
                if(matrix[row][column]==target)
                    return true;
                if(target<matrix[row][column])
                    column--;
                else
                    row++;

            }
            return false;
        }
    }
}
