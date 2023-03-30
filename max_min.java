// Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.
public class max_min {

    public static int findSum(int A[]) {
        // code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= min) {
                min = A[i];
            }
            if (A[i] >= max) {
                max = A[i];
            }
        }
        return min + max;
    }

    public static void main(String[] args) {
        int A[] = { -2, 1, -4, 5, 3 };
        System.out.println(findSum(A));
    }
}
