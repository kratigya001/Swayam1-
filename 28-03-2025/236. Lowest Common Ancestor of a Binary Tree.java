package Swayam1-.28-03-2025;

public class 236. Lowest Common Ancestor of a Binary Tree {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root ==null || root==p || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor( root.left,p ,q);
        TreeNode right=lowestCommonAncestor(root.right, p,q);
        if(left==null) return right;
        else if(right==null) return left;
        else{
            return root;
        }
        
    }
}
    
}
