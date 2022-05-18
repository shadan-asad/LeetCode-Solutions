import java.util.ArrayList;

public class GFG_InorderSuccessorinBST {
    //User function Template for Java

    //Complete the function below
    //Node is as follows:
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }

    class Solution
    {
        // returns the inorder successor of the Node x in BST (rooted at 'root')
        ArrayList<Node> list = new ArrayList<Node>();
        public Node inorderSuccessor(Node root,Node x)
        {
            //add code here.
            inOrder(root);
            for(int i = 0; i < list.size()-1; i++) {
                if(list.get(i) == x) {
                    return list.get(i+1);
                }
            }
            return null;
        }
        private void inOrder(Node root) {
            if(root.left != null)
                inOrder(root.left);
            list.add(root);
            if(root.right != null)
                inOrder(root.right);
        }
    }
}
