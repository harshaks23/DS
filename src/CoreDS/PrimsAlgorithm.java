package CoreDS;

public class PrimsAlgorithm {
int V=5;
public  int getMin(int[] keys,boolean[] checkSet)
{
    int min=Integer.MAX_VALUE,index=-1;
    for (int v=0;v<V;v++)
    {
        if (checkSet[v]==false &&keys[v]<min )
        {
            min=keys[v];
            index=v;
        }
    }

    return  index;

}


public void print_mst(int[] keys,int[] parent)
{
    System.out.println("Edge     Weight");
    for (int i=0;i<V;i++)
    {
        System.out.println(i+" - "+ parent[i]+"     "+keys[i]);
    }
}
    public  void  generate(int[][] graph)
    {
        int[] keys = new int[V];
        int[] parent = new int[V];
        boolean[] check = new boolean[V];

        for (int i=0;i<V;i++)
        {

            keys[i]=Integer.MAX_VALUE;
            check[i]=false;
        }


        keys[0]=0;
        parent[0]=-1;


        for (int i=0;i<V-1;i++)
        {
        int u=getMin(keys,check);
        check[i]= true;

        for (int v=0;v<V;v++)
        {
            if (graph[u][v]!=0 && check[v]==false  && graph[u][v]<keys[v])
            {
                parent[v]=u;
                keys[v]=graph[u][v];
            }
        }
print_mst(keys, parent);

        }


    }


    public static void main(String[] args) {
        int graph[][] = new int[][] {{0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0},
        };

        PrimsAlgorithm primsAlgorithm = new PrimsAlgorithm();
        primsAlgorithm.generate(graph);
    }
}
