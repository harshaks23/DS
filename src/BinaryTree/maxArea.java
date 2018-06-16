package BinaryTree;

public class maxArea {
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {

            int max=0;
            for(int i=0;i<grid.length;i++)
            {
                for(int j=0;j<grid[i].length;j++)
                {

                    if(grid[i][j]==1) {
                        int res= helper(grid, i, j);
                        max=(res>max)?res:max;
                    }
                }
            }

            return max;

        }



        public int helper(int[][] grid,int  i,int j)
        {
            if(i<0 || i>=grid.length || j< 0 || j>=grid[i].length || grid[i][j]!=1)
            {
                return 0;
            }

            grid[i][j]=2;
            return  1+helper(grid,i-1,j)+helper(grid,i+1,j)+    helper(grid,i,j-1)+  helper(grid,i,j+1);
        }

    }

}
