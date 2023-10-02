import java.util.*;
public class StockSpan{
    public static void stockspan(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1;i<stocks.length;i++){
            int cp = stocks[i]; //current price
            while(!s.isEmpty() && cp>=stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
            int ph = s.peek();
            span[i]=i-ph;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockspan(stocks,span);

        for(int x:span){
            System.out.print(x+" ");
        }
    }
}