package binary.tree;

import java.util.Stack;

public class IterativeInOrder {
    private TreeNode root;
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
    
    public void createTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
    }
    
    public void inOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                System.out.println(temp.data+" ");
                temp = temp.right;
            }
        }
    }
    
    public static void main(String[] args){
        IterativeInOrder it = new IterativeInOrder();
        it.createTree();
        it.inOrder();
    }
}
