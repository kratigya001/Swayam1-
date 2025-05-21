/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // column => {row0 =>{.....}, row1 => {...} ....}
        TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> mpp = new TreeMap<>();
        Queue<Node> q  = new LinkedList<>();
        if(root != null) q.add(new Node(root,0,0));
        while(!q.isEmpty()){
            Node temp = q.poll();
            int col = temp.col;
            int row = temp.row;
            TreeNode node = temp.node;
            if(!mpp.containsKey(col)){
                mpp.put(col, new TreeMap<Integer,ArrayList<Integer>>());
            }   
            if(!mpp.get(col).containsKey(row)){
                mpp.get(col).put(row, new ArrayList<Integer>());
            }     
            mpp.get(col).get(row).add(node.val);
            if(node.left != null) q.add(new Node(node.left,row+1,col-1));
            if(node.right != null) q.add(new Node(node.right,row+1,col+1));
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer,ArrayList<Integer>> t : mpp.values()){
            ArrayList<Integer> temp = new ArrayList<>();
            for(ArrayList<Integer> list : t.values()){
                Collections.sort(list);
                temp.addAll(list);
            }
            ans.add(temp);
        }
        return ans;
    }
}
class Node{
    TreeNode node;
    int col;
    int row;
    Node(TreeNode node, int row, int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}