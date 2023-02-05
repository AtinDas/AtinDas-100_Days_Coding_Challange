package Day_79_Unique_Binary_SearchTreesII;

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
    public List<TreeNode> generateTrees(int n) {
       return generate(1, n);
    }

    public List<TreeNode> generate(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            return result;
        }

        if (start == end) {
            TreeNode node = new TreeNode(start);
            result.add(node);
            return result;
        }

        for (int i = start; i <= end; i++) {

            List<TreeNode> left = generate(start, i - 1);
            List<TreeNode> right = generate(i + 1, end);

            if (left.isEmpty() && right.isEmpty()) {
                TreeNode root = new TreeNode(i);
                result.add(root);
            } else if (left.isEmpty()) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.right = r;
                    result.add(root);
                }
            } else if (right.isEmpty()) {
                for (TreeNode l : left) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;

                    result.add(root);
                }
            } else {
                for (TreeNode l : left) {
                    for (TreeNode r : right) {
                        TreeNode root = new TreeNode(i);
                        root.left = l;
                        root.right = r;

                        result.add(root);
                    }
                }
            }
        }

        return result; 
    }
}
