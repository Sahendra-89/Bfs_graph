import java.util.*;
public class Microsoft {
    static class Node{
        Node[] childern = new Node[26];
        boolean eow;
        public Node(){
            for( int i =0; i<= 26; i++){
                childern[i] = null;
            }

        }
    }
    public static Node root = new Node();
    public static void insert(String word ){
        int leve =0;
        int len= word.length();
        int idx = 0;
        Node curr = root;
        for( int level =  level<len; level++){
            idx = word.charAt(level) -'a';
            if(curr.children[idx] == null){
                curr.childern[idx];

            }
            curr = curr.Children[idx];
        }
        return curr.eow =true;
    }
    public static int contNode(Node root){
        if(root == null){
            return 0;
        }
        int count  =0;
        for(int i =0;  i<26; i++){
            if(root.children[i]!= null){
                counbt+= countNBode(root.children[i]);

            }
            return count +1;

            public static void  main(String args[]){
                String str = "ababa";
                for( int i =0; i<str.length(); i++){
                    String Suffix = str.substring(i);
                    insert(Suffix);
                }
                System.out.println(CountNode(root));

            }
        }
    }
    
}
