import java.util.*;
public class Basic {
    void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Basic s = new Basic();
        int arr[]={1,2,3,4,5};
        s.print(arr);
    }
}
