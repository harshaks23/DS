package BinaryTree;

public class surroundingRegions {
    /**
     *
     Easiest and the fastest solution:

     We dont need to iterate through and can be done in less time
     change all the O to other character using bfs (all from corners)
     Then just iterate the matrix and then replace the other character to O and rest all to X.


     public void solve(char[][] board) {
     if (board.length == 0 || board[0].length == 0) return;
     // first row
     for (int i=0; i<board[0].length; i++)="" if="" (board[0][i]="=" 'o')="" {="" system.out.println("first="" row");="" dfs(board,="" 0,="" i);="" }="" last="" row="" for="" (int="" i="0;" i<board[0].length;="" i++)="" if="" (board[board.length-1][i]="=" 'o')="" {="" system.out.println("last="" row");="" dfs(board,="" board.length-1,="" i);="" }="" first="" col="" for="" (int="" i="1;" i<board.length-1;="" i++)="" if="" (board[i][0]="=" 'o')="" {="" system.out.println("first="" col");="" dfs(board,="" i,="" 0);="" }="" last="" row="" for="" (int="" i="1;" i<board.length-1;="" i++)="" if="" (board[i][board[0].length-1]="=" 'o')="" {="" dfs(board,="" i,="" board[0].length-1);="" system.out.println("last="" col");="" }="" for="" (int="" i="0;" i<="" board.length;="" i++)="" {="" for="" (int="" j="0;" j<="" board[0].length;="" j++)="" {="" if="" (board[i][j]="=" 'p')="" {="" board[i][j]="O" ;="" system.out.println("changed");="" }="" else="" board[i][j]="X" ;="" }="" }="" }="" private="" void="" dfs(char[][]="" board,="" int="" i,="" int="" j)="" {="" if="" (i="">=0 && j>=0 && i<board.length &&="" j<="" board[0].length="" &&="" board[i][j]="=" 'o')="" {="" system.out.println("changing="" now");="" board[i][j]="P" ;="" dfs(board,="" i+1,="" j);="" dfs(board,="" i,="" j+1);="" dfs(board,="" i-1,="" j);="" dfs(board,="" i,="" j-1);="" }="" }="">
     */
    //here i traveerse and change all the O to '1' and then dfs on 1 from corners and change to O after iterate and change rest 1 to X
    class Solution {
        public void solve(char[][] board) {
            if(board==null)
                return ;
            if(board.length<=1|| board[0].length<=1)
                return ;
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board[i].length;j++)
                {
                    if(board[i][j]=='O')
                    {
                        board[i][j]='1';

                    }
                }
            }


            for(int i=0;i<board.length;i++)
            {
                if(board[i][0]=='1')
                {
                    dfs(board,i,0);
                }
            }
            for(int i=0;i<board[0].length;i++)
            {
                if(board[0][i]=='1')
                {
                    dfs(board,0,i);
                }
            }

            for(int i=0;i<board.length;i++)
            {
                if(board[i][board[0].length-1]=='1')
                {
                    dfs(board,i,board[0].length-1);
                }
            }
            for(int i=0;i<board[0].length;i++)
            {
                if(board[board.length-1][i]=='1')
                {
                    dfs(board,board.length-1,i);
                }
            }

            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board[i].length;j++)
                {
                    if(board[i][j]=='1')
                    {
                        board[i][j]='X';

                    }
                }
            }



        }

        public  void dfs(char[][] board,int i ,int j)
        {
            if(i<0 || i>=board.length|| j<0|| j>=board[0].length)
            {
                return ;
            }

            if(board[i][j]=='1')
                board[i][j]='O';
            else{
                return;
            }

                dfs(board,i-1,j);

                dfs(board,i+1,j);

                dfs(board,i,j-1);

                dfs(board,i,j+1);



        }
    }
        }
