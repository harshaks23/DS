package Main_Algorithms;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Shortest_path_V2 {
final int V=9;


int min_distance(int dist[] ,Boolean sptSet[])
{
    int min =Integer.MAX_VALUE,min_index=-1;
    for(int i=0;i<V;i++)
    {
        if (sptSet[i]==false &&  dist[i]<=min)
        {
            min=dist[i];
            min_index=i;

        }

    }

    return min_index;
}


void print(int dist[] ,int n)
{
    System.out.println("Vertex distance from source");
    for (int i=0;i<V;i++)
    {
        System.out.println(i+"tt"+dist[i]);
    }
}

public  void dijkstra(int[][] graph ,int src)
{
    int[] dist= new int[V];
    Boolean final_set[] = new Boolean[V];
    for (int i=0;i<V;i++)
    {
        dist[i]=Integer.MAX_VALUE;
        final_set[i]=false;

    }
    dist[src]=0;
    for (int i=0;i<V-1;i++)
    {

        int min_ind= min_distance(dist,final_set);
        final_set[min_ind]=true;
        for (int v=0;v<V;v++)
        {
            if (!final_set[v] && graph[i][v]!=0 && dist[i]!=Integer.MAX_VALUE && dist[i]+graph[i][v]<dist[v] )

            {
                dist[v]=dist[i]+graph[i][v];

            }
        }







    }print(dist,V);

}
    public static void main(String[] args) {
        int graph [] [] =new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        Shortest_path_V2 shortest_path_v2= new Shortest_path_V2();
        shortest_path_v2.dijkstra(graph,0);
    }
}
