//a constructor is a member function with a name as that of the class and is used to intialize the intance variables or member functions
class Student{
    String name;
    int roll_no;
    int UID;
    int marks[];
    //non parameterized
    Student(){
    name = "arush";
    roll_no = 1493;
    UID = 11;       
    System.out.println("NON PARAMETRIZED CONSTRUCTOR IS CALLED");
    }
    //display function
    void display(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
        System.out.println(this.UID);
    }
    //parameterized constructor
    Student(String name,int roll_no,int UID){
        this.name = name;
        this.roll_no = roll_no;
        this.UID = UID;
        System.out.println("PARAMETRIZED CONSTRUCTOR IS CALLED");
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("addy",1000,7);
        s2.display();
        s1.display();
     
    }
}
