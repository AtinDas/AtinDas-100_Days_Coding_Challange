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
    public int sumEvenGrandparent(TreeNode root) {
      return dfs(root, 1, 1); // Parent and grandparent are odd at first
  }

  private int dfs(TreeNode root, int p, int gp) {
    if (root == null)
      return 0;
    return dfs(root.left, root.val, p) +
           dfs(root.right, root.val, p) +
           (gp % 2 == 0 ? root.val : 0);  
    }
}