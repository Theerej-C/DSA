package DSA;

public class BinaryTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        // BinaryTree tree = new BinaryTree();
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(8);

        b.left = c;
        b.right = d;

        System.out.println(b.right.data);
    }
}
