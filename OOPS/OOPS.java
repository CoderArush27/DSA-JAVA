class Pen{
    public String color;
    int tip;

    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}
class BankAccount{
    public String name;
    private String password;
    protected double accNo;

    void setPass(String password){
        this.password = password;
    }
}

class Student{
    String name;
    int age;
    String pass;
    int marks[];

    Student(){
        this.name = "arush";
        this.age = 21;
        this.pass = "Arush@6148";
        this.marks = new int[3];

        marks[0]=100;
        marks[1]=90;
        marks[2]=85;
    }

    Student(Student s1){
       this.name = s1.name;
       this.age  = s1.age;
       this.marks = s1.marks;
    }
}
class Vehicles{
    String company;
    String model;
    int mYear;
    int power;
    double price;
    Vehicles(){
        System.out.println("Vehicles is called");
    }
    protected void changePrice(double price){
        this.price = price;
    }
    void modelName(String model){
        this.model = model;
    }
}
class Bmw extends Vehicles{
    String color;
    Bmw(){
        System.out.println("bmw is called");
    }
    // void modelName(String model){
    //     System.out.println("BMW");
    // }
}
class Series5 extends Bmw{
    Series5(){
        super.color = "black";
        System.out.println("series 5 is called");
    }
}
public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        System.out.println(p1.color);

        p1.setColor("green");
        System.out.println(p1.color);

        Pen p2 = new Pen();
        p2.setColor("red");
        System.out.println(p2.color);

        BankAccount b = new BankAccount();
        b.setPass("arush123");

        Student s1 = new Student();
        System.out.println(s1.name +" "+ s1.age + " "+ s1.pass);

        Student s2 = new Student(s1);
        // s2.marks = s1.marks;
        s2.pass = "zxsn";
        System.out.println(s2.name +" "+ s2.age + " "+ s2.pass);    
        s2.marks[2]=70;
        for(int i=0;i<3;i++){
            System.out.print(s2.marks[i]+" ");
        }
        System.out.println();
       // Vehicles v = new Vehicles();
        Bmw p = new Bmw();
        p.company = "BMW";
        p.mYear = 2023;
        p.model = "SERIES 8";
        p.power = 8000;
        p.price = 400000000;
        p.changePrice(9000000);
        p.modelName("SERIES 9");
        System.out.println(p.company + " "+ p.mYear + " "+ p.model + " "+ p.power+" "+p.price);

        Series5 s = new Series5();
        System.out.println(s.color);
        
    }
}