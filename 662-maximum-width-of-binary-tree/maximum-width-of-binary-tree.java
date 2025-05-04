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
    public int widthOfBinaryTree(TreeNode root) {
      //  if(root ==null ) return root;
        Queue<Pair<TreeNode ,Integer>>q=new LinkedList<>();
        q.add(new Pair<>(root,0));
        int width=0;
        while(!q.isEmpty()){
            int size=q.size();
            int startindex=q.peek().getValue();
            int endindex=0;
            for(int i=0;i<size;i++){
                Pair<TreeNode,Integer >entry= q.poll();
                TreeNode node=entry.getKey();
                int index=entry.getValue();
                endindex=index;
            
            if(node.left !=null ) q.add(new Pair<>(node.left,2*index));
            if(node.right!=null ) q.add(new Pair<>(node.right,2*index+1));
            }

          width=Math.max(endindex-startindex+1,width);
        }
    
        return width;
    }
}



        
    