import java.util.*;
public class NextSmallerRight {
    public static void nsr(int arr[],int a[]){
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){ //code for indexes
                s.pop();
            }
            if(s.isEmpty()){
            a[i]=-1;
            }
            
            else{
                a[i]=s.peek();
            }
            s.push(i);
        }
    }
    public static void nsl(int arr[],int b[]){
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){  //code for indexes
            while(!s.empty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.empty())
            b[i]=-1;

            else
            b[i]=s.peek();
        s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,6,10,6,8,3};
        int a[] = new int[arr.length];
        int b[] = new int[arr.length];
        nsr(arr, a);
        nsl(arr, b);
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x:b){
            System.out.print(x+" ");
        }
    }
}
