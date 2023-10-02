public class Poly {
    private static int add(int a,int b){
        return a+b;
    }
    
    private static int add(int a,int b,int c){
        return a+b+c;
    }

    private static float add(float a,float b){
        return a+b;
    }
    private static double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(2,300));
        System.out.println(add(2.888,300.22));
        System.out.println(add(2.5,3.25));
    }
}
0z