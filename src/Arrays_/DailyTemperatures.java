package Arrays_;
/*Given a list of daily temperatures, produce a list that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.

For example, given the list temperatures = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0]*/
public class DailyTemperatures {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            //you traverse from back and then try to find any temp greater and if there is no 0 in next that means there is no possiblity that there is any temp greater in future
            int[] ret= new int[temperatures.length];

            for(int i=ret.length-1;i>=0;i--)
            {
                int j=i+1;
                while(j<ret.length && ret[j]>0 && temperatures[j]<=temperatures[i])
                {
                    j+= ret[j];

                }

                if(j<ret.length && temperatures[j]>temperatures[i])
                {
                    ret[i]=j-i;

                }


            }
            return ret;
        }
    }
}
