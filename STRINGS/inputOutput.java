import java.util.*;


public class inputOutput {
    public static void main(String[] args) {
    //there are two methods of creating a string namely string literal[string constant pool] and new keyword[in heap non pool]
    Scanner s = new Scanner(System.in);
    String s1 = s.next();
    String s2 = s.nextLine();
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1.length());
    System.out.println(s2.length());
    System.out.println(s2.charAt(10));
    
}
}