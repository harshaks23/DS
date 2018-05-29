package CoreDS;

import java.util.Stack;

public class queueUsing2stacks {

    Stack<Integer> stack1 = new Stack<Integer>();
Stack<Integer> stack2= new Stack<>();
    public void  enqueue(int no)
    {
        stack1.push(no);
    }


    public void dequeue()
    {
        if (stack1.isEmpty())
        {
            System.out.println("Empty queue");

        }

        while (!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        System.out.println("poped elementn"+stack2.pop());

        while (!stack2.isEmpty())
        {
            stack1.push(stack1.pop());
        }
    }

    public  String toString()
    {
        return stack1.toString();
    }

    public static void main(String[] args) {
queueUsing2stacks q = new queueUsing2stacks();
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
    }
}
