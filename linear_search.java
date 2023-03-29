/**
 * linear_search
 */
public class linear_search {

    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {4, 8, 6, 9 ,10 ,5, 28};
        System.out.println(linearSearch(numbers, 10));
    }
}