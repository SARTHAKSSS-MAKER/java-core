import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {

        Scanner input = new
        Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");

        for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Enter number to search");
        int target = input.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Element found at index"  +  i);
                found = true;
                break;
            }
        }
            if (!found) {
                System.out.println("Element not found");
                input.close();
            }
    }
}