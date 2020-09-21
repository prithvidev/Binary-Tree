
package binary.tree;

import java.util.Stack;


public class IterativePreOrder {
    private TreeNode root;
    public class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    private TreeNode(int data){
        this.data=data;
    }
}
    public void createtree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
    }
    public void preOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println(temp.data+" ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }
    public static void main(String[] args){
        IterativePreOrder it = new IterativePreOrder();
        it.createtree();
        it.preOrder();
    }
}
