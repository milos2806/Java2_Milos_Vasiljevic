 
package student;

import computer.Computer;
import course.Course;


public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course = new Course("QA", 36);
    private Computer computer = new Computer(2.4, 16, 500);
    

    public Student() {

        this.firstName = "Ime";
        this.lastName = "Prezime";
        this.yearOfBirth = 123456789;
    }
 
    public Student(String firstName, String lastName, int yearOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;

    }

    public String getFirstName() {

        return this.firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName () {

        return this.lastName ;
    }

    public void setLastName (String newLastName ) {
        this.lastName  = newLastName ;
    }

    public int getYearOfBirth() {

        return this.yearOfBirth;
    }

    public void setYearOfBirth(int newYearOfBirth) {
        this.yearOfBirth = newYearOfBirth;
    }
    
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course newCourse) {
        this.course = newCourse;
    }
    
    public Computer getComputer(){
        return this.computer;
    }
    
    public void setComputer(Computer newComputer){
        this.computer = newComputer;
    }

    public void info() {

        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Year Of Birth: " + getYearOfBirth());
        System.out.println("Course name: " + getCourse().getName());
        System.out.println("Course number of classes: " + getCourse().getNumberOfClasses());
        System.out.println("Process tact: " + getComputer().getProcessTact());
        System.out.println("Memory: " + getComputer().getMemory() );
        System.out.println("Hard driver: " + getComputer().getHardDrive());
        
        
    }        

    
    
}
