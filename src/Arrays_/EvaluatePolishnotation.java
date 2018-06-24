package Arrays_;

import java.util.Stack;

public class EvaluatePolishnotation {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> s = new Stack<>();

            for ( String i : tokens)
            {
                if(i.equals("*"))
                {
                    s.add((s.pop()*s.pop()));
                }else
                if(i.equals("/"))
                {
                    int x=s.pop();
                    s.add(s.pop()/x);
                }else
                if(i.equals("-"))
                {
                    int y= s.pop();
                    s.add(s.pop()-y);

                }else
                if(i.equals("+"))
                {
                    s.add(s.pop()+s.pop());
                }

                else
                {
                    s.add(Integer.valueOf(i));
                }
            }
            return s.pop();
        }
    }
}
