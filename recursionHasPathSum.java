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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        
        //checking if leaf node and if path is equal to 0
        if(root.left == null && root.right == null && sum - root.val == 0) return true;
        
        //recursive call to left subtree and right subtree to find path that equals sum if 
        //it exist
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
