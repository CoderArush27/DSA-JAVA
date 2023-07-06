//in this are have implemented interfaces
interface Vehicles{
    void model();
    void name();
    void company();
}
interface SUV{
    abstract void power();
    abstract void wheelBase();
}

class Creta implements Vehicles{
    public void model(){
        System.out.println("2023");
    }
    public void name(){
        System.out.println("Knight Series");
    }
    public void company(){
        System.out.println("HYUNDAI");
    }
    public void power(){
        System.out.println("2000");
    }
    public void wheelBase(){
        System.out.println("60inch");
    }
    
}
public class MultipleInheri{
    public static void main(String[] args) {
        
    
    Creta c = new Creta();
    c.name();
    c.company();
    c.model();
    c.power();
    c.wheelBase();
}
}