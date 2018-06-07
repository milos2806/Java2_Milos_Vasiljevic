
package course;


public class Course {
    private String name ;
    private int  numberOfClasses;
    public String getName;
    
    public Course(String name, int numberOfClasses) {
        this.name =  name;
        this.numberOfClasses =  numberOfClasses;
    }

    public Course() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name){
        this.name =  name;
    }
    
    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }
    
    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
    
    public void ShowData(){
        System.out.println("Name of the course is: " + getName());
        System.out.println("Number of classes is: " + getNumberOfClasses());
    }
}
