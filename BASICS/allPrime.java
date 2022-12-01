import java.io.*;
import java.util.Scanner;
public class allPrime {
    public static boolean prime(int n){
        boolean flag = true;
        // for(int i=2;i<n;i++){
            for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=2;i<=n;i++){
            if(prime(i))
                System.out.println(i);
        }
    }
}
