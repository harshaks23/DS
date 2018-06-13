package BinaryTree;

public class numofIsland {

    class Solution {
        public int numIslands(char[][] grid) {


            int count=0;
            for(int i=0;i<grid.length;i++)
            {
                for(int j=0;j<grid[i].length;j++)
                {

                    if(grid[i][j]=='1') {
                        helper(grid, i, j);
                        count++;
                    }                }
            }

            return count;

        }

        public void helper(char[][] grid,int  i,int j)
        {
            if(i>=0 && i<grid.length && j>= 0 && j<grid[i].length && grid[i][j]=='1')
            {

                grid[i][j]='2';
                helper(grid,i-1,j);

                helper(grid,i+1,j);

                helper(grid,i,j-1);

                helper(grid,i,j+1);
            }
            return ;
        }
    }

}
