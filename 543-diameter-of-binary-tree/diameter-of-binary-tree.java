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
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxDiameter = new int[1];
        getHeight(root,maxDiameter);
        return maxDiameter[0];
    }

    private int getHeight(TreeNode root,int[] maxDiameter) {
        if (root == null) return 0;

        int leftHeight = getHeight(root.left,maxDiameter);
        int rightHeight = getHeight(root.right,maxDiameter);
        maxDiameter[0] = Math.max(maxDiameter[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}