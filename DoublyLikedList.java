
public class DoublyLikedList<T> {

    class Node {
        T data;
        Node previous;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    public void addNode(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.previous = null;
            tail.next = null;
            System.out.println("Successfully inserted");
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
            System.out.println("Successfully inserted");
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("No Nodes Are There");

        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLikedList<Integer> dList = new DoublyLikedList<>();
        // Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        // Displays the nodes present in the list
        dList.display();
    }

}
