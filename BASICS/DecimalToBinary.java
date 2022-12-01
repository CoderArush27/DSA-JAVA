import java.util.*;
public class DecimalToBinary {
    public static int DecToBin(int dec){
        int pow = 0;
        int bin = 0;
        while(dec>0){
            int rem = dec % 2;
            bin = bin + (rem * (int) Math.pow(10,pow));
            dec = dec/2;
            pow++;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    int dec = s.nextInt();
    int bin = DecToBin(dec);
    System.out.println("BINARY OF "+ dec +"="+bin);
    }
}
