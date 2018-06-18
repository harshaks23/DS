package BinaryTree;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 *
 * Count the number of distinct islands. An island is considered to be the same as another if and only if one island can be translated (and not rotated or reflected) to equal the other.
 *
 * Example 1:
 * 11000
 * 11000
 * 00011
 * 00011
 * Given the above grid map, return 1.
 * Example 2:
 * 11011
 * 10000
 * 00001
 * 11011
 * Given the above grid map, return 3.
 */
public class numOfDistnictIslands {
    class Solution {
        public int numDistinctIslands(int[][] grid) {
            Set<String> set= new HashSet<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        StringBuffer sb = new StringBuffer();
                        dfs( grid,i, j,sb, "o");
                        set.add(sb.toString());
                    }
                }
            }
            return set.size();
        }
        public void dfs(int[][] rooms,int x,int y,StringBuffer sb,  String O) {

            if (x < 0 || x >= rooms.length || y < 0 || y >= rooms[0].length || rooms[x][y]!=1) {
                return;
            }
            sb.append(O);
            rooms[x][y] = 2;
            dfs(rooms,x-1,y,sb,"l");

            dfs(rooms,x+1,y,sb,"r");

            dfs(rooms,x,y-1,sb,"d");

            dfs(rooms,x,y+1,sb,"u");
            sb.append("e");
        }

    }
}
