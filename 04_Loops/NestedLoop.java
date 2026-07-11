public class NestedLoop {
    
    public static void main(String[] args) {

        for (int classroom=1; classroom<=3; classroom++){
            System.out.println("Classroom" + classroom);

            for (int student=1; student<=5; student++){
                System.out.println("Student" + student);
            }
            System.out.println();
        }
    }
}
