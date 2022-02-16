import java.util.ArrayDeque;
import java.util.ArrayList;

public class GFG_InorderTraversalIterative {

    //A Binary Tree node

    class Node {
        int data;
        Node left, right;
       Node(int item)    {
            data = item;
            left = right = null;
        }
    }
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
