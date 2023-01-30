
import java.util.ArrayList;

public class Queue<T> {

    ArrayList<T> ar = new ArrayList<>();
    private int front = -1;
    private int tail = -1;

    public void enqueue(T data) {
        if (ar.size() == 0) {
            ar.add(data);
            front++;
            tail++;
        } else {
            ar.add(data);
            tail++;
        }
    }

    public void dequeue() {
        if (ar.size() == 0) {
            System.out.println("Queue is empty");
        } else {
            ar.remove(front);
            tail--;
        }
    }

    public T peekFront() {
        System.out.println("The front element is: " + ar.get(front));
        return ar.get(front);
    }

    public T peekLast() {
        System.out.println("The Tail element is: " + ar.get(tail));
        return ar.get(tail);
    }

    public void display() {
        System.out.println("The Elements of the Queue are: ");
        for (T t : ar) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Queue<Integer> q = new Queue<>();

        q.enqueue(6);
        q.enqueue(9);
        q.enqueue(12);
        q.enqueue(15);
        q.display();
        q.dequeue();
        q.display();
        q.peekFront();
        q.peekLast();
        q.dequeue();
        q.display();
        q.peekFront();
        q.peekLast();
    }
}
