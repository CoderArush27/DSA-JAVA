//WHEN PARENT AND CHILD CLASS HAVE SAEM FUNCTION NAME BUT WITH DIFFERENT DEFINATIONS
class Animal{
    void sound(){
        System.out.println("ANIMAL MAKE WIERD NOISES");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("DOG BARKS");
    }
}
class Lion extends Dog{
    void sound(){
        System.out.println("LION ROARS kyuke lion hia vo");
    }
}
public class MethodOverridding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();

        Dog a2 = new Dog();
        a2.sound();

        Lion a3 = new Lion();
        a3.sound();
    }
}
