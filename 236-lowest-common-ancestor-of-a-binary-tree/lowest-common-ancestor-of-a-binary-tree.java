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
        TreeNode[] ans = new TreeNode[1];
         int toatal=helper(root,p,q,ans);
        return ans[0];
    }
     static  int  helper(TreeNode root, TreeNode p, TreeNode q, TreeNode ans[]){
         if( root==null){
             return 0;
         }
          int l=helper( root.left,p,q,ans);
          int r =helper( root.right, p,q,ans);
          int self=0;
          if(p==root || q==root){
             self=1;
          }
          int total=self+l+r;
          if( total==2 && ans[0]==null){
             ans[0]= root;
          }
          return total;
     }

}