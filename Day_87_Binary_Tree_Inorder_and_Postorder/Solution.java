package Day_87_Binary_Tree_Inorder_and_Postorder;

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(postorder, postorder.length - 1, inorder, 0, inorder.length -1);
    }
    private TreeNode build(int[] postorder, int posIdx, int[] inorder, int inStart, int inEnd){
        if(inStart > inEnd || posIdx < 0) return null;
        TreeNode root = new TreeNode(postorder[posIdx]);
        int i = 0;
        for(i = inStart; i <= inEnd; i ++){
            if(inorder[i] == postorder[posIdx]) break;
        }

        root.right = build(postorder, posIdx - 1, inorder, i + 1, inEnd); 
        root.left = build(postorder, posIdx - 1 - (inEnd - i), inorder, inStart, i - 1);
        return root;
    }
}