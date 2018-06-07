
package main;

import computer.Computer;
import course.Course;
import student.Student;

public class Main {

    public static void main(String[] args) {
       Student Student1 = new Student ("Milos" , "Vasiljevic" , 1988);
         //Milos.setFirstName("Milos");
        //Milos.setLastName("Vasiljevic");
        //Milos.YearOfBirth(30);
        Student1.info();
        Course Course1 = new Course("Software QA course(tester)", 36);
        Course1.ShowData();
        Computer HP840 = new Computer(2.4, 16.0, 500);
        HP840.ShowComponents();
        
        System.out.println();
        Student Student2 = new Student();
        Student2.setFirstName("Jelena");
        Student2.setLastName("Lucic");
        Student2.setYearOfBirth(1989);
        Student2.getCourse().setName("Graphic design");
        Student2.getCourse().setNumberOfClasses(50);
        Student2.getComputer().setProcessTact(4.0);
        Student2.getComputer().setMemory(16);
        Student2.getComputer().setHardDrive(2000);
        
        Student2.info();
        
        
                
        
        
    }
    
}
