
package student;


public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;

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

    public void printStudentData() {

        System.out.println("Person's FirstName is: " + getFirstName());
        System.out.println("Person's LastName is: " + getLastName());
        System.out.println("Person's Year Of Birth is: " + getYearOfBirth());
}
    
    
}
