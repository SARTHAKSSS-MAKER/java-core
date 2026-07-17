import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
         Scanner input = new 
         Scanner(System.in);

         int[] numbers = new int[5];
         System.out.println("Enter 5 numbers:");

         for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
         }

        int sum = 0;
        for ( int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}
