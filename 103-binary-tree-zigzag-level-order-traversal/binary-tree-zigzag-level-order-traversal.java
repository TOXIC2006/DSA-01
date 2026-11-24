class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) 
        return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> list = new LinkedList<>();

            while (size != 0) {
                TreeNode node = q.remove();
                
                if (leftToRight) {
                    list.addLast(node.val);
                } else {
                    list.addFirst(node.val); 
                }

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
                size--;
            }
            ans.add(list);
            leftToRight = !leftToRight; 
        }
        return ans;
    }
}