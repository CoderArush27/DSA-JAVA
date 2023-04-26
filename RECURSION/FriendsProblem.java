//friends problem is that in which we have to calculate the number of ways in whcih group of friends can be apired up or remain single and only ont thigh is allowed
//
public class FriendsProblem {
    public static int waysOfPairing(int n){
        if(n==1 || n==2)
            return n;

        return waysOfPairing(n-1)+(n-1)*waysOfPairing(n-2);
    }
    public static void main(String[] args) {
        int a = 4;
        System.out.println(waysOfPairing(a));
    }
}
