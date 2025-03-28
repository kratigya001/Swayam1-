package Swayam1-.28-03-2025;

public class 662. Maximum Width of Binary Tree {
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
    //same as array-  (lastindex-firstindex+1);
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode,Integer>>q=new LinkedList<>();
        q.add(new Pair<>(root,0));
        int maxwidt=0;
        while(!q.isEmpty()){
            int size=q.size();
            int startindex=q.peek().getValue();
            int endindex=0;
            for(int i=0;i<size;i++){
                Pair<TreeNode,Integer>entry=q.poll();
                TreeNode node=entry.getKey();
                int position=entry.getValue();
                 endindex=position;

            
               if(node.left!=null) q.add(new Pair<>(node.left,2*position));
                if(node.right!=null) q.add(new Pair<>(node.right, 2*position+1));

            }
               maxwidt=Math.max(endindex-startindex+1, maxwidt);
        }
        return maxwidt;
    }
}
            

        

        
    
    
}
