boolean checkBST(Node root) {
        List<Integer> inorderList = new ArrayList<>();
        inOrderTraversal(root, inorderList);

        for (int i = 1; i < inorderList.size(); i++) {
        if (inorderList.get(i) <= inorderList.get(i - 1)) {
        return false;
        }
        }

        return true;
        }
private void inOrderTraversal(Node node, List<Integer> list) {
        if (node != null) {
        inOrderTraversal(node.left, list);
        list.add(node.data);
        inOrderTraversal(node.right, list);
        }
        }