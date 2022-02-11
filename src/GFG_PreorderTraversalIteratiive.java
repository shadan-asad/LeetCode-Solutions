import java.util.ArrayList;
import java.util.Stack;

public class GFG_PreorderTraversalIteratiive {
    // A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
    class Tree
    {
        // Return a list containing the inorder traversal of the given tree
        ArrayList<Integer> preOrder(Node root)
        {
            // Code
            ArrayList<Integer> list = new ArrayList<Integer>();
            Stack<Node> st = new Stack<Node>();
            Node temp = root;

            while(root != null) {
                list.add(root.data);
                if(root.right != null) {
                    st.push(root.right);
                }
                if(root.left != null) {
                    root = root.left;
                }else if(!st.isEmpty()) {
                    root = st.pop();
                }else {
                    break;
                }
            }
            return list;
        }


    }
}
