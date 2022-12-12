class Animal{
    Animal(){
        System.out.println("ANIMAL IS CALLED");
    }
}
class Runs extends Animal{
    Runs(){
        super();
        System.out.println("RUN IS CALLED");
    }
}
class Horse extends Runs{
    Horse(){
        //super();
        System.out.println("HORSE IS CALLED");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}
