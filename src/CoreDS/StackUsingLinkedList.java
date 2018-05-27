package CoreDS;

public class StackUsingLinkedList <T> {
    static  class Node<T>{
        T data;
        Node<T> next;

       public Node(T d)
        {
            this.data=d;
        }
        @Override
        public String toString() {
            return data.toString();
        }
    }
Node<T> main_stack=null;
    int size=0;
    public void push(T no)
    {

        {

            Node<T> temp=  new Node<T>(no);
            if (main_stack==null)
            {
                main_stack=temp;

            }
            else

                {
                    temp.next=main_stack;
                    main_stack=temp;

                }


            }
    }
    public void pop()
    {
        if(main_stack==null)
        {
         System.out.println("Empty stack");

        }
        else {
            System.out.println("Poped element is "+main_stack.data);
main_stack=main_stack.next;

        }

    }
    @Override
    public String toString() {
        if (main_stack==null){return "The Stack is Empty";}
        else {
            StringBuilder stringBuilder= new StringBuilder();
            Node<T> temp= main_stack;
            while (temp!=null)
            {
                stringBuilder.insert(0,temp+" ");
            }
            return stringBuilder.toString();
        }
    }
    public void peek()
    {
        if(main_stack==null)
        {
            System.out.println("Empty Stack");
        }else {
            System.out.println("The peek element from Stack is" +main_stack.data);
        }
    }

    public static void main(String[] strings)
    {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(4);
        stackUsingLinkedList.push(5);
        stackUsingLinkedList.push(8);
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(4);
        stackUsingLinkedList.push(5);
        stackUsingLinkedList.push(8);
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(2);

        System.out.println(stackUsingLinkedList.toString());
        stackUsingLinkedList.push(4);
        stackUsingLinkedList.push(5);
        stackUsingLinkedList.push(8);
        stackUsingLinkedList.push(1);

        System.out.println(stackUsingLinkedList.toString());
        stackUsingLinkedList.pop();
        System.out.println(stackUsingLinkedList.toString());
        stackUsingLinkedList.peek();




        StackUsingLinkedList<String> stackUsingArrays2 = new StackUsingLinkedList();
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
