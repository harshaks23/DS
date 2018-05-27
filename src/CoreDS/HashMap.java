package CoreDS;

import java.util.ArrayList;

public class HashMap<p,q> {
    int size, default_size;
    ArrayList<Node<p,q>> hash= new ArrayList<>() ;

class Node<p,q>
{
    p key;
    q value;
    Node<p,q> next;
    Node(p key,q value)
    {
        this.key=key;
        this.value=value;
    }
}
HashMap(){
    size=0;
    default_size=10;
    for (int i=0;i<default_size;i++)
    {
        hash.add(null);
    }
}

    public int generate_hash(p i)
    {
        return i.hashCode()%default_size;
    }
    public void Modify_hash_map()
    {
        ArrayList<Node<p,q>> temp= hash;

        hash = new ArrayList<Node<p,q>>();
        default_size=2*default_size;
        for (int i=0;i<default_size;)
        {
            hash.add(null);
        }
        for (Node<p,q> each:temp) {

            while (each!=null)
            {
            put(each.key,each.value);
            each=each.next;
            }
        }


    }
public q get(p old_key)
{ int k=generate_hash(old_key);
if(hash.get(k)==null)
{
    System.out.println("Key not present");
    return null;
}
else {
    ArrayList<Node<p,q>> temp= hash;


    for (Node<p,q> each:temp) {

        while (each!=null)
        {

            if (each.key.equals(old_key)){
                return each.value;
            }
            else
                each=each.next;
        }

    }

    return null;
}
}


public  void remove(p rem_key)
{
    int k=generate_hash(rem_key);
    Node<p,q> rem= hash.get(k);
    Node<p,q> pre = null;
/**
    System.out.println("hash value"+ k +" key"+rem_key +"fdsa "+rem.key);
    while (rem!=null)
    {
        System.out.println("hash value"+ generate_hash(rem.key)+" key "+ rem.key+" value "+rem.value +"res "+rem_key+" "+ (rem_key==rem.key)+" "+(rem_key.equals(rem.key)));

        if (rem.key.equals(rem_key))
        {
            System.out.println("this one");
        }
        rem=rem.next;

    }**/
    rem= hash.get(k);
    while (rem!=null)
    {
    if (rem.key.equals(rem_key))
    {
        if (pre==null)
        {
            System.out.println("enter");
            hash.set(k,rem.next);
            return;
        }
        else
            {
            pre.next = rem.next;
return;

            }
    }

        pre=rem;
        rem=rem.next;

    }

    System.out.println("key not present" +rem_key +" "+generate_hash(rem_key)+ " hashcje "+ hash.get(generate_hash(rem_key)) );
}

public void print_all()
{
    for (Node<p,q> n:hash
         ) {

        while (n!=null)
        {
            System.out.println("hash value"+ generate_hash(n.key)+" key "+ n.key+" value "+n.value);
            n=n.next;
        }

    }
}
    public void put(p newkey, q new_val)

    {


        if (newkey==null) return;
        int hash_val= generate_hash(newkey);

Node<p,q> node = hash.get(hash_val);
//find whether it is null and just add
if(node==null)
{
    hash.add(hash_val,new Node<>(newkey,new_val));
    size++;
    if (size/default_size>0.7)
        Modify_hash_map();
    return;
}
//find whether there is an key and just update it
while (node!=null)
{
    if (node.key.equals(newkey))
    { node.value=new_val;
    return;
}
node=node.next;
}
//if no element is present then add it to the start

        node=hash.get(hash_val);
        Node<p,q> temp= new Node<>(newkey,new_val);
        temp.next=node;
        hash.set(hash_val,temp);




    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,1);
        hashMap.put(2,2);
        hashMap.put("test",2);
        hashMap.print_all();
        System.out.println("-----------");
        hashMap.remove(1);
        hashMap.put(11,3);
        hashMap.put(24,4);
        hashMap.put(3,3);hashMap.put(14,4);hashMap.put(4,4);
        hashMap.remove("test");
        hashMap.print_all();
        System.out.println("-----------");

       hashMap.put(3,23);hashMap.remove(14);hashMap.put(1,3421111);
        hashMap.print_all();
        System.out.println("-----------");

    }

}

