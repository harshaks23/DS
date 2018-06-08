package CoreDS;

public class Trie_again {

    class Trie_again_Node {
Trie_again_Node [] childs= new Trie_again_Node[26];
Boolean isend;
Trie_again_Node()
{
    isend=false;
    for (Trie_again_Node each:childs )
        each=null;
}
    }

    Trie_again_Node root;
    Trie_again()
    {
        root= new Trie_again_Node();
    }

    public void insert(String
                        str)
    {
        Trie_again_Node Temp=root;

        for (Character c:str.toCharArray()
             ) {

            int i= c-'a';

            if (Temp.childs[i]==null)
            {
                Temp.childs[i]= new Trie_again_Node();
                Temp=Temp.childs[i];

            }else
            {
                Temp=Temp.childs[i];

            }

        }


        Temp.isend=true;
    }

public boolean search(String key)
{
    Trie_again_Node temp = root;


    for (int i=0;i<key.length();i++)
    {
        int j= key.charAt(i)-'a';
        if (temp.childs[j]==null)
            return false;
        else
            temp=temp.childs[j];
    }
    return temp!=null && temp.isend;
}


public void delete(String str)
{
    System.out.println(delete_(str,root,0));
}


public boolean hasChild(Trie_again_Node ch)
{
    for (Trie_again_Node each:ch.childs
         ) {

        if (each!=null)
            return true;
    }
    return false;
}

public boolean delete_(String str,Trie_again_Node node,int start)
{
    if (start==str.length())
    {
        if (node==null) return false;
        if (node.isend==false)
            return false;
        node.isend=false;
        return !hasChild(node);
    }
    int i=str.charAt(start)-'a';
    if (node==null) return false;
    Trie_again_Node temp = node.childs[i];
    if (temp==null)
        return false;
    boolean should_delete= delete_(str,temp,start+1);
    if (should_delete)
    {
        node.childs[i]=null;
        return  !hasChild(node);
    }
    return  false;


}
    public static void main(String[] args) {

        Trie_again trie = new Trie_again();
        trie.insert("ksh");
        trie.insert("ksab");
        System.out.println(trie.search("ksh")+"dsac");
        System.out.println(trie.search("ks"));
        trie.delete("ks");
        trie.delete("ksh");

        System.out.println(trie.search("ksh"));
    }
}