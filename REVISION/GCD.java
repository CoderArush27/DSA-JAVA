/*IN ORDER TO FIND GCD THERE ARE TWO WAYS TO DO SO
 ONE BY SIMPLY DECIDING THE SMALL NUMBER AND FINDING ITS FACTOR
 SECOND BY DIVIDING MAX % MIN */
 import java.util.*;
 public class GCD {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int a = s.nextInt();
         int b = s.nextInt();
 
         int i=2;
         int max = Integer.MIN_VALUE;
         int min = Math.min(a, b);
         while(i<=min){
             if(a%i==0 && b%i==0){
                 if(i>max){
                 max = i;
                 }
             }
             i++;
         }
         System.out.println(max);
     }
 }
 