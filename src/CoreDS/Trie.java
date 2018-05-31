package CoreDS;

public class Trie  {
      class  TrieNode
    {
        TrieNode[] childs = new TrieNode[26];
        boolean isEndOfWord;
        TrieNode()
        {
            isEndOfWord=false;
            for (int i=0;i<26;i++)
            {
                childs[i]=null;
            }
        }
    }
TrieNode root;
    public void insert(String key)
    {
       TrieNode temp=root;
       for (int level=0;level<key.length();level++)
       {
           int i=key.charAt(level)-'a';
           if (temp==null)
               temp= new TrieNode();
           temp=temp.childs[i];
       }

       temp.isEndOfWord=true;

    }

    public  boolean  search(String key)
    {
TrieNode temp=root;
        for (int level=0;level<key.length();level++)
        {
            int i=key.charAt(level)-'a';
            if (temp.childs[i]==null)
                return false;
            temp=temp.childs[i];
        }
        return (temp!=null && temp.isEndOfWord);

    }
public void delete(String word)
{
    delete(root, word,0);
}
public  boolean has_Child(TrieNode node)
{
    for (TrieNode each:
         node.childs) {
        if (each!=null)
        {
            return  false;
        }
    }
}

public boolean delete(TrieNode node, String word,int index)
{
    if (index==word.length())
    {
        if (node.isEndOfWord==false)
            return false;
        node.isEndOfWord=false;

        return has_Child(node);
    }
TrieNode tem= node.childs[word.charAt(index)-'a'];
if (tem==null)
    return false;
boolean should_delete=delete(tem,word,index+1);
if (should_delete)
{
    tem.childs[word.charAt(index)-'a']=null;
    return 
}

}
    public static void main(String[] args) {


    }

}
