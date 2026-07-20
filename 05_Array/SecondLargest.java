public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10,50,30,80,20};
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for ( int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }
            else if ( numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("Second largest = " + secondLargest );
    }
}
