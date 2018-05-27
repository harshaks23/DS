package CoreDS;

public class StackUsingArrays<T> {
T[] main_stack = (T[])new Object[10];
int size=0;

public void push(T n)
{
    if(size==main_stack.length)
    {
        System.out.println("Stack Overflow");
    }else
        {
            main_stack[size++]=n;

        }
}

public void pop()
{
    if(size==0)
    {
        System.out.println("Empty Stack");
    }else {
        System.out.println("The poped element from Stack is" +main_stack[--size]);
    }
}
    public void peek()
    {
        if(size==0)
        {
            System.out.println("Empty Stack");
        }else {
            System.out.println("The peek element from Stack is" +main_stack[size-1]);
        }
    }
    @Override
    public String toString() {
        if (size==0){return "The Stack is Empty";}
        else {
            StringBuilder stringBuilder= new StringBuilder();
            for (int i=0;i<size;i++)
            {
                stringBuilder.append(main_stack[i]+" ");
            }
            return stringBuilder.toString();
        }
    }

    static public void main(String[] args)
    {
        StackUsingArrays stackUsingArrays = new StackUsingArrays();
        stackUsingArrays.push(2);
        stackUsingArrays.push(4);
        stackUsingArrays.push(5);
        stackUsingArrays.push(8);
        stackUsingArrays.push(1);
        stackUsingArrays.push(2);
        stackUsingArrays.push(4);
        stackUsingArrays.push(5);
        stackUsingArrays.push(8);
        stackUsingArrays.push(1);
        stackUsingArrays.push(2);

        System.out.println(stackUsingArrays.toString());
        stackUsingArrays.push(4);
        stackUsingArrays.push(5);
        stackUsingArrays.push(8);
        stackUsingArrays.push(1);

        System.out.println(stackUsingArrays.toString());
        stackUsingArrays.pop();
        System.out.println(stackUsingArrays.toString());
        stackUsingArrays.peek();




        StackUsingArrays<String> stackUsingArrays2 = new StackUsingArrays();
        stackUsingArrays2.push("a");
        stackUsingArrays2.push("b");
        stackUsingArrays2.push("c");
        stackUsingArrays2.push("d");
        stackUsingArrays2.push("f");
        stackUsingArrays2.push("g");
        stackUsingArrays2.push("h");
        stackUsingArrays2.push("a");
        stackUsingArrays2.push("b");
        stackUsingArrays2.push("c");
        stackUsingArrays2.push("d");
        System.out.println(stackUsingArrays2.toString());
        stackUsingArrays2.push("f");
        stackUsingArrays2.push("g");
        stackUsingArrays2.push("h");
stackUsingArrays2.pop();
        System.out.println(stackUsingArrays2.toString());

    }
}
