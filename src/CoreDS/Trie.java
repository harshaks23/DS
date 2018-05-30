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

    public static void main(String[] args) {


    }

}
