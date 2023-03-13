public class PeakIndexinaMountainArray {


    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if((mid>0&&mid<arr.length-1)&&(arr[mid-1]<arr[mid]&&arr[mid+1]<arr[mid])){
                return mid;
            }
            else if((mid>0&&mid<arr.length-1)&&arr[mid]<arr[mid-1]){
                end = mid;
            }
            else{
                start = mid-1;
            }

        }
        return start;
    }
    public static void main(String[] args) {
        int[] ar = {1,2,5,10,3,2,5};
        System.out.println(peakIndexInMountainArray(ar));
    }
}
