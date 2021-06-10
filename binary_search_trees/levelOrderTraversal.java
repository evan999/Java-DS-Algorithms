mport java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

static void levelOrder(Node root){
      //Write your code here
      
      // create a node queue
      // if node print value
      // if left node not null add child node to the queue
      // if right node not null add child node to the queue
      // get next node in queue
      // repeat line 17
      // until the queue is empty
      
      Queue<Node> queue = new LinkedList<>();
      
      Node trav = root;
      
    //   if (root != null) {
    //      // System.out.print(root.data + " ");
    //   }
    
      do{
        if (root != null) {
            System.out.print(root.data + " ");
        }  
        
        if (trav.left != null) {
            queue.add(root.left);
            trav = trav.left;
        }
        
        if (trav.right != null) {
            queue.add(root.right);
            trav = trav.right;
        }
        
        queue.poll(); 
        
        //System.out.print(queue.poll() + " ");
      } while (queue.size() > 0);
      
          //System.out.print(queue.poll() + " ");
      
      
      
    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}