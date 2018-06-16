package BinaryTree;

public class Perimeterofisland {

    class Solution {
        public int islandPerimeter(int[][] grid) {


            int count=0;

            for(int i=0;i<grid.length;i++)
            {
                for(int j=0;j<grid[i].length;j++)
                {

                    if(grid[i][j]==1)
                    {

                        return helper(grid, i, j);

                    }
                }
            }

            return count;
        }




        public int helper(int[][] grid,int  i,int j)
        {
            if(i<0 || i>=grid.length || j< 0 || j>=grid[i].length || grid[i][j]==0)
            {
                return 1;
            }

            if(grid[i][j]==2)
                return 0;


            grid[i][j]=2;
            return  helper(grid,i-1,j)+helper(grid,i+1,j)+    helper(grid,i,j-1)+  helper(grid,i,j+1);
        }




    }
}
