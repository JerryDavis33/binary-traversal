/**
 * 
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode temp;
        List<Integer> list = new LinkedList();
        Stack<TreeNode> s = new Stack();
        
        if(root == null) return list;
        
        temp = root;
        
        
        while(temp !=null || s.size() > 0){
            
            //traversing left most node
            while(temp !=null){
                s.push(temp);
                temp = temp.left;                
                
            }
            
            //pop node off stack add to list and traverse right subtree if there is one
            //if not just pop off and check next node in stack
            
            temp = s.pop();
            
            list.add(temp.val);
            
            temp = temp.right;
     
            }
            
            
           return list; 
        }
        
        
        
    }
