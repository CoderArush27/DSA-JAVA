import java.io.*;
import java.util.Scanner;
public class BinaryToDec{
    public static int BinToDec(int bin){
        int pow = 0;
        int dec = 0;
        while(bin>0){
            int LD = bin % 10;
            dec = dec + (LD*(int)Math.pow(2, pow));
            pow++;
            bin = bin/10;
        }
        return dec;
    }
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int bin = s.nextInt();
    int dec = BinToDec(bin);
    System.out.println("decimal of "+ bin +"="+dec);
}
}