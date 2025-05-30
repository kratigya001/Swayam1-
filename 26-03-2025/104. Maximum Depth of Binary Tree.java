package Swayam batch;

public class 104. Maximum Depth of Binary Tree {
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));        
        }
    }
    
}
