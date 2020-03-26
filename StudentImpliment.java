import java.util.Scanner;

public class StudentImpliment {
    public static void main (String [] args) {

        // creating a scanner object
        Scanner don = new Scanner(System.in);

        //prompting to enter name
        System.out.print (" Enter Your name : ");
        String name = don.nextLine ();

        // creating a grades array for holding three student's grades
        double [] grades = new double [3];
        System.out.print (" Enter Your 3 grades : ");
       for (int i = 0; i < grades.length; i ++) {
           grades [i] = don.nextDouble();
       }
        // creatin object for first student
       Student student1 = new Student ();
      
      //Sending the data to Student Class
      student1.setName(name);
      student1.setGrades(grades);
      student1.average(grades);

        //printing the results
      student1.printStudentDetails();


        // pronting user to enter name of the second student
        System.out.print (" Enter Your name : ");
         name = don.nextLine ();
        
        //prompting to enter grades
          System.out.print (" Enter Your 3 grades : ");
       for (int i = 0; i < grades.length; i ++) {
           grades [i] = don.nextDouble();
       }

        // creating a new object for the second student
        Student student2 = new Student ();

        // Sending second students data to Student class
      student2.setName(name);
      student2.setGrades(grades);
      student2.average(grades);

        //printing second students details
      student2.printStudentDetails();
      


    }
}