public class CheckSortedArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,60,50};
        boolean isSorted = true;

        for ( int i = 0; i < numbers.length-1; i++) {
            if ( numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not sorted");
        }
    }
}
