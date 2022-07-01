import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TreeMap;

public class GFG_BottomViewofBinaryTree {
    // { Driver Code Starts
//Initial Template for Java

    class Node
    {
        int data; //data of the node
        int hd; //horizontal distance of the node
        Node left, right; //left and right references

        // Constructor of tree node
        public Node(int key)
        {
            data = key;
            hd = Integer.MAX_VALUE;
            left = right = null;
        }
    }

//User function Template for Java


    class Solution
    {
        //Function to return a list containing the bottom view of the given tree.
        class NL {
            Node node;
            int l;
            NL(Node node, int l) {
                this.node = node;
                this.l = l;
            }
        }
        public ArrayList <Integer> bottomView(Node root)
        {
            // Code here
            ArrayList<Integer> list = new ArrayList <Integer>();
            ArrayDeque<NL> q = new ArrayDeque<>();
            TreeMap<Integer, Node> hm = new TreeMap<>();

            q.add(new NL(root, 0));
            while(!q.isEmpty()) {
                int n = q.size();
                while(n-- > 0) {
                    NL nl = q.poll();
                    hm.put(nl.l, nl.node);

                    if(nl.node.left != null)
                        q.add(new NL(nl.node.left, nl.l-1));
                    if(nl.node.right != null)
                        q.add(new NL(nl.node.right, nl.l+1));
                }
            }
            for(Integer i : hm.keySet()) {
                list.add(hm.get(i).data);
            }
            return list;
        }
    }
}
