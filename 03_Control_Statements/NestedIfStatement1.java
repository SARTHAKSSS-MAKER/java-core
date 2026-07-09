public class NestedIfStatement1 {
    public static void main(String[] args){

        int age = 20;
        boolean hasLicense = true;

        if(age >= 18){
            if(hasLicense){
                System.out.println("You can drive");            }
        }
        System.out.println("Thank You");
    }
}
