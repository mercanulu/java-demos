public class Main {
    public static void main(String[] args){
        //Array kullanımları

        String[] students = new String[3];
        students[0] = "Mercan";
        students[1] = "Gizem";
        students[2] = "Engin";

        for(int i=0; i<students.length;i++){
            System.out.println(students[i]);
        }

        System.out.println("--------------------");

        for(String student:students){
            System.out.println(student);
        }


    }
}
