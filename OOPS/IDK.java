
class Car{
    String name;
Car(){
    System.out.println("CAR IS CALLED");
}
Car(String name){
    this.name = name;
}

}
class Range extends Car{
    Range(){
        System.out.println("RANGE IS CALLED");
    }
}

public class IDK {
    public static void main(String[] args) {
    Car c = new Range();
}

}