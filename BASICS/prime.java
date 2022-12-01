import java.io.*;
import java.util.Scanner;
public class prime {
    public static void prime(int n){
        boolean flag = true;
        // for(int i=2;i<n;i++){
            for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("PRIME NUMBER");
        else
            System.out.println("NOT A PRIME NUMBER");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = sc.nextInt();
        prime(n);
    }
}
