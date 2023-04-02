import java.util.Scanner;

public class print_subarrays {
    public static void printSubarrays(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + ",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }
        printSubarrays(arr);
    }
}
