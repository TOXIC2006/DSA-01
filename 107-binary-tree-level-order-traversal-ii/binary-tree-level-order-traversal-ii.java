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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
         if( root==null){
            return ans;
         }
         Queue<TreeNode> q= new LinkedList<>();
         q.add(root);
          while(!q.isEmpty()){
             int size= q.size();
             List<Integer> list= new ArrayList<>();
             while(size!=0){
                 TreeNode tree= q.remove();
                  list.add(tree.val);
                  if(tree.left!=null){
                     q.add(tree.left);
                  }if(tree.right!=null){
                         q.add(tree.right);
                  }
                  size--;
             }
            ans.add(list);
          }
          Collections.reverse(ans);
           return ans;
    }
}