public class Student {

    private String name;
    private static int numOfStudents;
    private double [] grades;
    private double averageGrades;
  
// constructor
    public Student (){
        numOfStudents ++;
    }

    // method for setting name
    public void setName (String name) {
        this.name = name;
    }
    //method for getting name
    public String getName() {
        return name;
    }
    //method for setting grades
    public void setGrades (double [] grades){

        for (int i = 0; i < grades.length; i++) {
            grades[i] = grades [i];
        }
    }
    //method for accessing grde
    public double [] getGrades () {
        return grades;
    }
    //method for getting number of students
    public int getNumberOfStudents () {
        return numOfStudents;
    }
    //method for calculating area
    public double average (double [] grades) {
        double sum = 0;
        for (int i = 0; i < grades.length; i ++) {
            sum += grades [i];
        }

       averageGrades = sum/grades.length; 
        return averageGrades;
    }
    //method for printing
    public void printStudentDetails (){
      
        System.out.println ( " Student name is "+ name + " average grades is "+ averageGrades + " and the current number of students is "+ numOfStudents);
    }
}