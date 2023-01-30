
public class DynamicArray {

    private int[] array;
    private int count;
    private int sizeOfArray;

    /**
     * 
     */
    public DynamicArray() {
        array = new int[1];
        count = 0;
        sizeOfArray = 1;
    }

    public boolean addElement(int a) {

        if (count == sizeOfArray) {
            growArray();
        } else {
            array[count] = a;
            count++;
            return true;
        }
        return false;
    }

    private void growArray() {
        int[] temp = null;
        if (count == sizeOfArray) {
            temp = new int[sizeOfArray * 2];
            for (int i = 0; i < sizeOfArray; i++) {
                temp[i] = array[i];
            }

        }
        array = temp;
        sizeOfArray = sizeOfArray * 2;
    }

    public boolean addElementAt(int index, int a) {

        if (count == sizeOfArray) {
            growArray();
        } else {
            for (int i = count - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = a;
            count++;
        }

        return false;
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        // adding elements to the array
        da.addElement(12);
        da.addElement(22);
        da.addElement(35);
        da.addElement(47);
        da.addElement(85);
        da.addElement(26);
        da.addElement(70);
        da.addElement(81);
        da.addElement(96);
        da.addElement(54);
        System.out.println("Elements of the array:");

        for (int i = 0; i < da.sizeOfArray; i++) {
            System.out.print(da.array[i] + " ");
        }
        System.out.println();

        System.out.println("Size of the array: " + da.sizeOfArray);
        System.out.println("No. of elements in the array: " + da.count);

        da.addElementAt(5, 99);
        System.out.println("\nElements of the array after adding an element at index 5:");

        for (int i = 0; i < da.sizeOfArray; i++) {
            System.out.print(da.array[i] + " ");
        }
        System.out.println();

        System.out.println("Size of the array: " + da.sizeOfArray);
        System.out.println("No. of elements in the array: " + da.count);
    }
}
