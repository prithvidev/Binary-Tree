package binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversing {
    private TreeNode root;
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(int data){
            this.data = data;
        }
    }
    public void createTable(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
    }
    
    public void levelOrder(){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.println(temp.data+" ");
            if(temp.left != null){
                queue.offer(temp.left);
            }
            if(temp.right != null){
                queue.offer(temp.right);
            }
        }
    }
    public static void main(String[] args){
        LevelOrderTraversing lt = new LevelOrderTraversing();
        lt.createTable();
        lt.levelOrder();
    }
}
