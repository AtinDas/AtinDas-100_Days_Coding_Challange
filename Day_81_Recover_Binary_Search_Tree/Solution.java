package Day_81_Recover_Binary_Search_Tree;

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
    TreeNode first;
    TreeNode sec;
    TreeNode prev;
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        inorder_traversal(root);
        // swap the first and sec value
        int tmp = first.val;
        first.val = sec.val;
        sec.val = tmp;

        return;
    }
    private void inorder_traversal(TreeNode cur){
        if(cur == null) return;
        inorder_traversal(cur.left);

        if(first == null && (prev != null && prev.val > cur.val)) first = prev;
        if(first != null && prev.val > cur.val) sec = cur;

        prev = cur;
        inorder_traversal(cur.right);

    }
}
