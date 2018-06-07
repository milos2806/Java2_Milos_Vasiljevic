
package computer;


public class Computer {
    private double processTact;
    private double memory;
    private int hardDrive;
    
    public Computer(double processTact, double memory, int hardDrive){
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public Computer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getProcessTact() {
        return this.processTact;
    }
    
    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }
            
    public double getMemory() {
        return this.memory;
    }
    public void setMemory(double memory) {
        this.memory = memory; 
    }
    public int getHardDrive() {
        return this.hardDrive;
    }
    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
    public void ShowComponents(){
        System.out.println("Speed of processor is: " + getProcessTact() + " GHz");
         System.out.println("Capacity of memory is: " + getMemory() + " GB");
          System.out.println("Capacity of Hard Drive is: " + getHardDrive()+ " GB");
    }
    
}
