public class binary_search {
    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(number[mid] == key) {
                return mid;
            }
            if(number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 7, 6};
        System.out.println(binarySearch(arr, 6));
    }
}
