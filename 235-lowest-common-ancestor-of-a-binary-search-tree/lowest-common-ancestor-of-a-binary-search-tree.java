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
        TreeNode ans[]= new TreeNode[1];
        helper(root, p,q,ans);
        return ans[0];
    }
    static  void helper(TreeNode root, TreeNode p, TreeNode q, TreeNode [] ans){
         if( root==null){
             return;
         }
           if(root.val>p.val && root.val<q.val ){
                 ans[0]=root;
                 return;
           }
           if(root.val>p.val && root.val>q.val){
             helper( root.left,p,q,ans);
           }else if(root.val<p.val && root.val<q.val){
             helper( root.right,p,q,ans);
           }else{
            ans[0]=root;
            return;
           }
    }
}