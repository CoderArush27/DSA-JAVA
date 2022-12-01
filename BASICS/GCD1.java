import java.util.*;
public class GCD1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
    
        int max = Math.max(a, b);
        int min = Math.min(a,b);

        while(max%min !=0){
            int temp = max%min;
            max = min;
            min = temp;
        }
        System.out.println(min);
}
}