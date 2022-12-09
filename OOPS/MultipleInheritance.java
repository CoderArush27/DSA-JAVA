import java.util.*;
interface engine{
    public String e="abc";
    void type();
}
interface transmission{
    int trans = 5;
    void ttype();
}
class Car implements engine,transmission{
    public void type(){
        String e = "V6";
        System.out.println("ITS DIESEL ENGINE "+e);
    }
    public void ttype(){
        System.out.println("ITS TRANSMISSION = "+trans);
    }
}
class BMW implements engine{
    public void type(){
        System.out.println("BMWS V6 ENGINE "+e);
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
    
    Car c = new Car();
    BMW b = new BMW();
    c.type();
    c.ttype();
    b.type();
}
}