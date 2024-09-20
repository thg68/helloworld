public static Node insert(Node root,int data) {
        Node newNode = root;
        if(root == null) {
            newNode = new Node(data);
            return newNode;
        } else {
            if(data <= root.data) {
                newNode = insert(root.left, data);
                root.left = newNode;
            } else {
                newNode = insert(root.right, data);
                root.right = newNode;
            }
                return root;
        }
}