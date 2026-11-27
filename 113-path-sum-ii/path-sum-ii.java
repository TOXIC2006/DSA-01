class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(root, targetSum, ans, path, 0);
        return ans;
    }

    private void helper(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> path, int sum) {
        if (root == null) {
            return;
        }

        path.add(root.val);
        sum += root.val;

        if (root.left == null && root.right == null && sum == targetSum) {
            ans.add(new ArrayList<>(path));
        }

        helper(root.left, targetSum, ans, path, sum);
        helper(root.right, targetSum, ans, path, sum);

        path.remove(path.size() - 1);
    }
}