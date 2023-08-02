public class Hardquestion {
    static class Node{
        Node[] childern = new Node[26];
        boolean eow = false;
        int freq;
        public Node(){
            for(int i = 0; i<children.legth; i++){
                childern[i] =null;
            }
            freq= 1;
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr= root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) -'a';
            if(curr.children[idx]== null){
                curr.childern[idx] =new Node();
            }
            curr.eow =true;
        }
        public static void findPrefix(Node.root  String ans)
    }
    public static void main(String args[]){

    }
    
}
