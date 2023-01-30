
public class SinglyLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public boolean addNode(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return true;
        } else {
            tail.next = newNode;
            tail = newNode;
            return true;
        }
    }

    public void display() {
        Node curNode = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (curNode != null) {
                System.out.print(curNode.data + " ");
                curNode = curNode.next;
            }
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();

        // Add nodes to the list
        System.out.println(sList.addNode(1));
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        // Displays the nodes present in the list
        sList.display();
    }
}
