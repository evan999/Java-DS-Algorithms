/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    List<Integer> nodes = new ArrayList<>();

    boolean checkBST(Node root) {
        inOrderTraverse(root);
        for (int node = 1; node < nodes.size() - 1; node++) {
            int previous = nodes.get(node-1);
            int current = nodes.get(node);
            if (previous > current || previous == current) {
                return false;
            }
        }
        return true;
    }

    void inOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraverse(root.left);
        nodes.add(root.data);
        inOrderTraverse(root.right);
    }