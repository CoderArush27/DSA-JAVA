import java.util.Stack;

public class MaximumAreaofHistogram {
    public static int maxArea(int arr[]){
        int max = Integer.MIN_VALUE;
        //nextSmallerRight
        Stack<Integer> s = new Stack<>();
        int a[] = new int[arr.length];
        int b[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){ 
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
        //nextSmallerLeft
        Stack<Integer> k = new Stack<>();
        for(int i=0;i<arr.length;i++){  //code for indexes
            while(!k.empty() && arr[k.peek()]>=arr[i]){
                k.pop();
            }
            if(k.empty())
            b[i]=-1;

            else
            b[i]=k.peek();

        k.push(i);
        }

        for(int i=0;i<arr.length;i++){
            int width = a[i]-b[i]-1;
            int area = width*arr[i];
            max = Math.max(max, area);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        System.out.println(maxArea(arr));

    }
}
