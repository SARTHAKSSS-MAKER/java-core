import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new
        Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
            System.out.println("You entered:");
        

            for (int i = 0; i <numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            input.close();
        }
  
}
