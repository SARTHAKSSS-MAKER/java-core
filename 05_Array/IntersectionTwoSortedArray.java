public class IntersectionTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,4,5};
        int[] intersection = new int[3];
        int k = 0;

        for ( int i = 0; i < arr1.length; i++ ) {
            for ( int j = 0; j < arr2.length; j++ ) {
                if ( arr1[i] == arr2[j] ) {
                    intersection[k] = arr1[i];
                    k++;
                    break;
                }
            }
        }
        for ( int i = 0; i < k ; i++ ) {
            System.out.println(intersection[i]);
        }
    }
}