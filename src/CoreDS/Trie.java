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

      Trie()
      {
          root= new TrieNode();
      }
    public void insert(String key)
    {
       TrieNode temp=root;
       for (int level=0;level<key.length();level++)
       {
           int i=key.charAt(level)-'a';
           TrieNode now= temp.childs[i];
           if (now==null)
                temp.childs[i]=new TrieNode();
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
    System.out.println( delete(root, word,0));
}
public  boolean has_Child(TrieNode node)
{
    for (TrieNode each:
         node.childs) {
        if (each!=null)
        {
            return  true;
        }
    }
    return false;
}

public boolean delete(TrieNode node, String word,int index)
{
    if (index==word.length())
    {
        if (node.isEndOfWord==false)
            return false;
        node.isEndOfWord=false;

        return !has_Child(node);
    }
TrieNode tem= node.childs[word.charAt(index)-'a'];
if (tem==null)
    return false;
boolean should_delete=delete(tem,word,index+1);
if (should_delete)
{
    tem.childs[word.charAt(index)-'a']=null;

    return !has_Child(node);

}
return false;
}
    public static void main(String[] args)
    {

Trie trie = new Trie();
trie.insert("ksh");
trie.insert("ksab");
System.out.println(trie.search("ksh"));
System.out.println(trie.search("ks"));
trie.delete("ks");
trie.delete("ksh");

System.out.println(trie.search("ksh"));


    }

}
