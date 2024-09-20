public static int height(Node root) {
        // Write your code here.
        if (root == null) {
            return -1;
        }
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l, r) + 1;
}


