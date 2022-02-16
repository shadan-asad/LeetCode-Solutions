import java.util.ArrayDeque;
import java.util.ArrayList;

public class GFG_InorderTraversalIterative {
    // { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    class GfG {

        static Node buildTree(String str){

            if(str.length()==0 || str.charAt(0)=='N'){
                return null;
            }

            String ip[] = str.split(" ");
            // Create the root of the tree
            Node root = new Node(Integer.parseInt(ip[0]));
            // Push the root to the queue

            Queue<Node> queue = new LinkedList<>();

            queue.add(root);
            // Starting from the second element

            int i = 1;
            while(queue.size()>0 && i < ip.length) {

                // Get and remove the front of the queue
                Node currNode = queue.peek();
                queue.remove();

                // Get the current node's value from the string
                String currVal = ip[i];

                // If the left child is not null
                if(!currVal.equals("N")) {

                    // Create the left child for the current node
                    currNode.left = new Node(Integer.parseInt(currVal));
                    // Push it to the queue
                    queue.add(currNode.left);
                }

                // For the right child
                i++;
                if(i >= ip.length)
                    break;

                currVal = ip[i];

                // If the right child is not null
                if(!currVal.equals("N")) {

                    // Create the right child for the current node
                    currNode.right = new Node(Integer.parseInt(currVal));

                    // Push it to the queue
                    queue.add(currNode.right);
                }
                i++;
            }

            return root;
        }

        public static void main (String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t=Integer.parseInt(br.readLine());

            while(t > 0){
                String s = br.readLine();
                Node root = buildTree(s);
                Solution g = new Solution();
                ArrayList<Integer> res = g.inOrder(root);
                for (int i = 0; i < res.size (); i++)
                    System.out.print (res.get (i) + " ");
                System.out.print("\n");
                t--;
            }
        }
    }
// } Driver Code Ends


//User function Template for Java

    /* A Binary Tree node

    class Node {
        int data;
        Node left, right;
       Node(int item)    {
            data = item;
            left = right = null;
        }
    } */
    class Solution
    {
        // Return a list containing the inorder traversal of the given tree
        ArrayList<Integer> inOrder(Node root)
        {
            // Code
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayDeque<Node> st = new ArrayDeque<Node>();
            while(root != null) {
                if(root.left != null) {
                    st.push(root);
                    Node temp = root.left;
                    root.left = null;
                    root = temp;
                } else {
                    list.add(root.data);
                    root = root.right;
                }
                if(root == null && !st.isEmpty())
                    root = st.pop();
            }
            return list;
        }
    }
}
