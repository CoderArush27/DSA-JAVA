class Student{
    String name;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    void getName(){
        System.out.println("NAME OF THE STUDENT = "+this.name);
    }
    static void setSchool(String name){
        schoolName = name;
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
      
        System.out.println(s.schoolName);
        s1.setSchool("RIS");
        s.setSchool("MCS");
        System.out.println(s1.schoolName);
    }
}
