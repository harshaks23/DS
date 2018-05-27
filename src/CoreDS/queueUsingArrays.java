package CoreDS;

public class queueUsingArrays  {

int[] arr= new int[10];
int front,last,size=0;
public void enqueu(int no)
{
    if(size!=10){
    arr[size++]=no;
    front=0;
    last=size-1;}
    else {
        System.out.println("queue is full");
    }
}

public void enqueue(int no)
{


}


    public static void main(String[] args)
    {

        queueUsingArrays ob= new queueUsingArrays();


    }
}
