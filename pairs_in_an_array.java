/**
 * pairs_in_an_array
 */
public class pairs_in_an_array {

    public static void printPairs(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8, 3, 9};
        printPairs(arr);
    }
}