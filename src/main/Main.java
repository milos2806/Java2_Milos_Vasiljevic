
package main;

import course.Course;
import student.Student;

public class Main {

    public static void main(String[] args) {
       Student Milos = new Student ("Nevena" , "Ignjatovic" , 29);
         //Milos.setFirstName("Milos");
        //Milos.setLastName("Vasiljevic");
        //Milos.YearOfBirth(30);
        
        Milos.printStudentData();
        
        
        Course Course1 = new Course("QA-Course", 36);
        Course1.ShowData();
        
    }
    
}
