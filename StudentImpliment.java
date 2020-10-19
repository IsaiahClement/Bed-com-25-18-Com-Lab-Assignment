import java.util.Scanner;

public class StudentImpliment {
    public static void main (String [] args) {

             // creating a scanner object
             Scanner input = new Scanner(System.in);

            System.out.println();
            System.out.print (" How many students are you going to enter? : ");
            int k = input.nextInt();
          
        for (int i = 1; i <= k; i++) {

             // creatin object for student
             Student student = new Student ();
             mainput(student, i);

        }
         
    }


        public static void mainput (Student c, int k) {

            // creating a scanner object
             Scanner don = new Scanner(System.in);


             String name;

             //prompting to enter name
             System.out.print (" Enter name of the student"+ k +" : ");
             name = don.next();

            // creating a grades array for holding three student's grades
             double [] grades = new double [3];
             System.out.print (" Enter all 3 student"+ k +"'s grades : ");
             for (int i = 0; i < grades.length; i ++) {
            grades [i] = don.nextDouble();
       }

            //Sending the data to Student Class
             c.setName(name);
             c.setGrades(grades);
          
            //printing the results
             c.printStudentDetails();

        }
           
           


}