public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};

        for ( int i = 0; i <= arr.length; i++ ) {
            boolean found = false;
            for ( int j = 0; j < arr.length; j++ ) {
                if (i == arr[j]) {
                    found = true;
                    break;
                }
            }
                if (!found) {
                    System.out.println(i);
                    break;
                
            }
        }
    }
}
