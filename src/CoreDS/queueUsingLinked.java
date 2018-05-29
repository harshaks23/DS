package CoreDS;

public class queueUsingLinked


{

Node head;
int size=0;
    class Node
    {int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }

    }



    public void  enqueue(int data)
    {

        if (head==null)
        {
            head=new Node(data);
            size++;
            return;
        }

        Node temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=new Node(data);
        size++;
        return;



    }

    public int dequeue()
    {
        if (head==null)
            return -1;
        int ret=head.data;
        head=head.next;
        size--;
        return ret;
    }
public void peek()
{
    if (head==null) {
        System.out.println("empty queue ");

    return ;
    }

    Node temp= head;
    while (temp.next!=null)
    {

        temp=temp.next;
    }
    System.out.println("Peek element is "+temp.data+" ");
    return;
}
    public  String toString()
    {
        if (head==null) return "Empty Queue ";
        Node temp=head;

        StringBuilder stringBuilder= new StringBuilder();
        while (temp!=null)
        {
            stringBuilder.append(temp.data+" ");
            temp=temp.next;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        queueUsingLinked x= new queueUsingLinked();
        System.out.println(x);
        x.enqueue(5);

        System.out.println(x+"vdav");
        x.enqueue(53);
        System.out.println(x+"afea");
        x.enqueue(23);
        x.enqueue(52);
        x.enqueue(25);
        x.enqueue(51);
        x.enqueue(56);
        x.enqueue(57);

        System.out.println(x);
        x.dequeue();

        System.out.println(x);
        x.dequeue();
        x.dequeue();
        x.peek();
        x.dequeue();
        x.dequeue();
        System.out.println(x);
        x.dequeue();
        x.dequeue();
        x.dequeue();
        x.dequeue();

        System.out.println(x);
        x.dequeue();
        x.dequeue();
        x.peek();
    }
}
