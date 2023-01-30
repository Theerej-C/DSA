public class BinarySearchUsingRecrussion {
    public static int binSearch(int[] ar, int start, int end, int i) {
        if (end < start) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (ar[mid] == i) {
            return mid;
        } else if (ar[mid] < i) {
            return binSearch(ar, mid + 1, end, i);
        } else {
            return binSearch(ar, start, mid - 1, i);
        }
    }

    public static void main(String[] args) {
        int[] ar = { 2, 4, 5, 6, 7, 8, 9 };
        System.out.println(binSearch(ar, 0, ar.length - 1, 9));

    }
}
