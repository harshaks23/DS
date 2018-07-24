package CoreDS;

public class test_ {


    public static void main(String[] args) {

test_   ob= new test_();
ob.result(3,5,200);
    }

    public boolean contains_(int n,int no)
    {
        while(n!=0)
        {
            int m = n%10;
            if(m==no)
            {
                return true;
            }
            n=n/10;
        }
        return  false;

    }

    public  void result(int no,int start ,int end)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=start;i<=end;i++)
        {

            if(contains_(i,no))
            {
                stringBuilder.append(i+" ");
            }



        }
        System.out.println(stringBuilder.toString());
    }
}
