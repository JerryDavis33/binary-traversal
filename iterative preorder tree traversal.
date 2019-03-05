 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  
    public List<Integer> preorderTraversal(TreeNode root) {
                
        List<Integer> list = new LinkedList();
        if(root == null) return list;
        Stack<TreeNode> nodeStack = new Stack();
        TreeNode tempRoot;
        
       list.add(root.val); 
       if(root.right !=null)nodeStack.push(root.right);
       if(root.left != null) nodeStack.push(root.left);
        
        
        while(!nodeStack.empty()){
           tempRoot = nodeStack.pop();
           list.add(tempRoot.val);
           if(tempRoot.right !=null)nodeStack.push(tempRoot.right);
           if(tempRoot.left != null) nodeStack.push(tempRoot.left); 
                     
            
        }      
        
        return list;
    }
}
