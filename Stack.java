
import java.util.ArrayList;

public class Stack<T> {
    ArrayList<T> ar = new ArrayList<>();
    private int top = -1;

    public void addElement(T data) {
        ar.add(data);
        top++;
    }

    public void removeElement() {
        ar.remove(top);
        top--;
    }

    public void size() {
        int size = top + 1;
        System.out.println("The Size of the Stack is: " + size);
    }

    public T peek() {
        return ar.get(top);
    }

    public boolean isempty() {
        return top == -1;
    }

    public void display() {
        if (isempty()) {
            System.out.println("The Stack is empty");
        } else {
            System.out.println("The Stack Elements are: ");
            for (T t : ar) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.addElement(4);
        st.addElement(5);
        st.addElement(6);
        System.out.println(st.peek());
        st.size();
        st.removeElement();
        st.display();
        st.removeElement();
        st.display();
        st.removeElement();
        st.display();
        st.size();
    }
}
