package BinaryTree;

public class starwallsandgates {
    class Solution {
        public void wallsAndGates(int[][] rooms) {
            for (int i = 0; i < rooms.length; i++) {
                for (int j = 0; j < rooms[0].length; j++) {
                    if (rooms[i][j] == 0) {
                        dfs( rooms,i, j, 0);
                    }
                }
            }
        }

        public void dfs(int[][] rooms,int x,int y,  int dist) {
            if (x < 0 || x >= rooms.length || y < 0 || y >= rooms[0].length || rooms[x][y] < dist|| rooms[x][y]==-1) {
                return;
            }
            rooms[x][y] = dist;
            dfs(rooms,x-1,y,dist+1);

            dfs(rooms,x+1,y,dist+1);

            dfs(rooms,x,y-1,dist+1);

            dfs(rooms,x,y+1,dist+1);
        }
    }
}
