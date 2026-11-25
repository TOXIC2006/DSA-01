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
    public TreeNode invertTree(TreeNode root) {
      // 4  2 7   1 3  6 9
      helper(root);
      return root;
      
    }
    void helper(TreeNode root){
        if(root==null){
            return;
        }
        swap(root,root.left,root.right);
        helper(root.left);
        helper(root.right);
    }
    void swap( TreeNode m,TreeNode l, TreeNode r){
        TreeNode temp=l;
          m.left=r;
          m.right=temp;
 
    }
}