package Impor_Algorithm;

public class kmp_single_string {

    public static void main(String[] args) {

        kmp_single_string k = new kmp_single_string();
        k.kmp("abcdfeageaggmakdl", "AAACAAAAAC" );

    }

    public void kmp(String str, String pattern)
    {
        int [] pat = pattern_(pattern);

        int i=0;
        int j=0;

        while (i<str.length() && j< pattern.length())
        {
            if (str.charAt(i)==pattern.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                if (j==0)
                {
                    i++;
                }
                else {
                    j=pat[j-1];

                }
            }

        }
        if(j==pattern.length())
        {
            System.out.println("pattern found");
        }

        //
// for multipple time to findt  the string
/*
*
* while(i<str.length())
* {
*
* if (str.charAt(i)==pattern.charAt(j))
            {
                i++;
                j++;

                 if(j==pattern.length())
            {
             System.out.println("Found pattern "
                                   + "at index " + (i - j));
            }
            }


            else
            {

            if(i<str.length())
            {

                if (j==0)
                {
                    i++;
                }
                else {
                    j=pat[j-1];

                }

            }
            }
*
*
*
* */
    }

    public int[] pattern_(String str)
    {
        int[] temp= new int[str.length()];
        int i=0;
        int j=1;
        temp[0]=0;
        while (j<str.length())
        {
            if (str.charAt(i)==str.charAt(j))
            {
                temp[j]=i+1;
                i++;
                j++;
            }
            else
            {
                if (i==0)
                {
                    temp[j]=0;
                    j++;

                }
                else
                {
                    i=temp[i-1];
                }
            }

        }
        return temp;
    }
}
