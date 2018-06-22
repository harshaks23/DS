package BinaryTree;
//Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
//Use catlan no
public class UniqueBinaryTree {
    class Solution {
        int ret[];
        public int numTrees(int n) {

            ret=new int[n+1];
            ret[0]=1;
            ret[1]=1;
            for(int i=2;i<=n;i++ )
            {
                for(int j=0;j<i;j++)
                {
                    ret[i]+=(ret[j]*ret[i-1-j]);
                }

            }
            return ret[n];
        }
    }
}
