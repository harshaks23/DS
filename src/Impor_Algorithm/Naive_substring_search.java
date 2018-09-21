package Impor_Algorithm;

public class Naive_substring_search {

    public static void search(String txt, String Pat)
    {
        if (Pat.length()==0)
            System.out.println("Not possible");
        int m=txt.length();
        int n = Pat.length();
        for (int i=0;i<=m-n;i++)
        {
            int j;
            for (j=0;j<n;j++)
            {
                //System.out.println(txt.charAt(i+j)+ " "+Pat.charAt(j)+ " i "+ i+txt+" "+ j);
                if (txt.charAt(i+j)!=Pat.charAt(j))
                    break;
            }
            //System.out.println("exyt");
            if (j==n)
                System.out.println( "Present at "  + i);

        }


    }

    public static void main(String[] args)
    {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";
        search(txt, pat);
    }
}
