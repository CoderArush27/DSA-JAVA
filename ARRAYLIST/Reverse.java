import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        for(int i=0,j=list.size()-1;i<=j;i++,j--){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
        System.out.println(list);
    }
}
