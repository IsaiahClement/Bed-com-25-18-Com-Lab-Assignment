public class Student {

    private String name ;
    private static int numOfStudents ;
    private double [] grades;
    // private double averageGrades;
  
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

            this.grades = grades; 
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
    public double getAverageGrades () {
        
        double sum = 0;
        for (int i = 0; i < grades.length; i ++) {
            sum += grades [i];
        }
        //calculating averrage grades
       double averageGrades = (int)((sum/grades.length) * 100) /100.0; 
        return averageGrades;
    }

    //method for printing
    public void printStudentDetails (){

        System.out.println();
        System.out.println ( " Student name is "+ getName() + " average grades is "+ getAverageGrades()+" and the current number of students is "+ numOfStudents);
        System.out.println();
        System.out.println();

    
    }

}