package CoreDS;

public class Dijkstra {
int V=9;

    int minDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed distance array
    void printSolution(int dist[])
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" tt "+dist[i]);
    }

    public void create(int[][] graph,int src)
    {


        int dist[] = new int[V];
        Boolean [] check = new Boolean[V];
            for (int i=0;i<V;i++)
            {
                check[i]=false;
                dist[i]=Integer.MAX_VALUE;
            }

            dist[src]=0;
            for (int i=0;i<V-1;i++)
            {
                int u= minDistance(dist,check);
                check[u]=true;
                for (int v=0;v<V;v++)
                {
                    if (check[v]==false && graph[u][v]!=0   && dist[u]+graph[u][v]<dist[v])
                    {
                        dist[v]=dist[u]+graph[u][v];

                    }
                }
            }

printSolution(dist);
    }

    public static void main(String[] args) {
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        Dijkstra dijkstra= new Dijkstra();
        dijkstra.create(graph,0);


    }
}
