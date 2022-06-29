public class GFG_HeightofBinaryTree {
    class Solution {
        //Function to find the height of a binary tree.
        int height(Node node)
        {
            // code here
            if(node == null)
                return 0;
            int a = height(node.left);
            int b = height(node.right);
            if(a > b)
                return a+1;
            return b+1;
        }
    }
}
