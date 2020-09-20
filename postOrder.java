package binary.tree;


public class BinaryTree {
    
    private TreeNode root;
    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        
        public TreeNode(int data){
            this.data = data;
        }
}
    public void createTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        
        root = first; //root--> first
        first.left = second;
        first.right = third; //second <-- first --> third
        second.left = fourth;
    }    
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
       BinaryTree bt = new BinaryTree();
       bt.createTree();
       bt.postOrder(bt.root);
    }
    
}
