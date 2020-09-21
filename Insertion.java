public static Node insert(Node root,int data) {
        Node newNode = new Node(data);
        if(root == null){
            return newNode;
        }
        Node parent = null;
        Node current = root;
        Boolean isLeft = false;
        while(current != null){
            if(current.data < data){
                parent = current;
                current = current.right;
                isLeft = false;
            }
            else{
                parent = current;
                current = current.left;
                isLeft = true;
            }
        }
         if(isLeft){
                parent.left = newNode;
            }
            else{
                parent.right = newNode;
            }
        return root;
    }