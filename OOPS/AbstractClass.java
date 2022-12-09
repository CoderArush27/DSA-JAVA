abstract class animal{
    abstract void walk();
    animal(){
        System.out.println("ITS AN ANIMAL");
    }
}
class horse extends animal{
    void walk(){
        System.out.println("WALKS ON 4 LEGS");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        horse h = new horse();
        h.walk();
    }
}
