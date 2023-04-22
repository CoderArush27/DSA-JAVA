public class SayDigits {
    public static String words[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void say(int n){
        if(n<=0)
        return;

        int rem = n%10;
        n = n/10;
        say(n);
        System.out.print(words[rem]+" ");
    }
    public static void main(String[] args) {
        int n = 985;
        say(n);
    }
}
