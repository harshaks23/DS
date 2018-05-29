package CoreDS;

import java.util.Stack;

public class QueueUsing1Stack {

Stack<Integer> stack = new Stack<Integer>();

public void  enqueue(int no)
{
    stack.push(no);
}


public void dequeue()
{
    if (stack.size()==1){
        System.out.println("the poped element is "+ stack.pop());
        return;}

        int x= stack.pop();
    dequeue();
    stack.push(x);

}

public  String toString()
{
    return stack.toString();
}
    public static void main(String[] args) {


    QueueUsing1Stack queueUsing1Stack = new QueueUsing1Stack();
    queueUsing1Stack.enqueue(1);
        queueUsing1Stack.enqueue(2);
        queueUsing1Stack.enqueue(3);
        queueUsing1Stack.enqueue(4);
        System.out.println(queueUsing1Stack);
        queueUsing1Stack.dequeue();
        System.out.println(queueUsing1Stack);
    }

}
