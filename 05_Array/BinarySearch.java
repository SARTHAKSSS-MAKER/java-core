import java.util.Scanner;
public class BinarySearch {
    public static void main(String[]  args) {

        Scanner input = new
        Scanner(System.in);
        int[] numbers = {10,20,30,40,50,60,70,80,90};
        System.out.println("Enter number to search");
        int target = input.nextInt();

        int start = 0;
        int end = numbers.length-1;
        boolean found = false;

        while ( start <= end) {
            int mid = (start+end)/2;
            if ( numbers[mid] == target) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            }
                else if (target > numbers[mid]) {
                    start = mid + 1;
                }
                 else {
                    end = mid - 1;
                 }
        }
        if (!found) {
            System.out.println("Element not found");
            input.close();
        }
    }
}
