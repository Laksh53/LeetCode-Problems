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
    ArrayList<Integer> result=new ArrayList<>();
    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
        
    
    }
    public int getMinimumDifference(TreeNode root) {
        int diff=Integer.MAX_VALUE;
        inorder(root);
        int temp;
        for(int i=1;i<result.size();i++)
        {
            temp=result.get(i)-result.get(i-1);
            diff=Math.min(diff,temp);
        }
        return Math.abs(diff);
        
    }
}