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
    public List<Integer> inorderTraversal(TreeNode root) {
      List <Integer> ans=new ArrayList<>();
      traverse(root,ans);
      return ans;  
    }
    static void traverse(TreeNode node,List result){
        if(node == null){
            return ;
        }
        traverse(node.left,result);
        result.add(node.val);
        traverse(node.right,result);
    }
}