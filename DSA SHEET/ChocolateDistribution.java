// Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.

import java.util.*;
public class ChocolateDistribution {
    public static int distribution(int chocoPacks[],int students){
        Arrays.sort(chocoPacks);
        int N = chocoPacks.length;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<=N-students;i++){
            int dif = chocoPacks[i+students-1] - chocoPacks[i];
            minDiff = Math.min(dif,minDiff);
        }
        return minDiff;
    } 
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};  
        int m = 7;
        System.out.println(distribution(arr, m));
    }
}
