//BY METHOD OVERLOADING WE MEAN SAME FUNCTION BUT DIFFERENT NUMBER OF PARAMETERS OF TYPE OF PARAMETERS
class Calculate{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}
public class MethodOverloading
{

    public static void main(String[] args) {
        Calculate cc = new Calculate();
        System.out.println(cc.sum(10, 20));
        System.out.println(cc.sum((float)70.5, (float)30.5));
        System.out.println(cc.sum(10,30, 50));
    }
}