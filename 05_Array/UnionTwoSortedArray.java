public class UnionTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,4,5};
        int[] union = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            union[k] = arr1[i];
            k++;
        }
        for (int i = 0; i< arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (arr2[i] == union[j]) {
                    found = true;
                    break;
                }
            }
        
         if(!found) {
         union[k] = arr2[i];
         k++;
                    }
    }
    for (int i = 0; i < k; i++) {
        System.out.println(union[i]);
    }
}
}
