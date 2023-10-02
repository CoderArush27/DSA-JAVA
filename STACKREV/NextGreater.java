import java.util.*;
public class NextGreater {
    public static void nextGreat(int arr[],int ng[]){
        Stack<Integer> s = new Stack<>();
        for(int i=ng.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty())
            ng[i]=-1;

            else
            ng[i]=s.peek();

            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={6,8,0,1,3};
        int ng[] = new int[a.length];

        nextGreat(a, ng);
        for(int x:ng){
            System.out.print(x+" ");
        }
    }
}
