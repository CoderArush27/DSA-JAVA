public class ChocolateProblem {
    public static void main(String[] args) {
        int x = 8;
        int y = 3;

        while(x!=y &&  y!=0 && x!=0){
            if(x>y){
            x = x-y;
            }
            else{
                y = y-x;
            }
        }
        if(x==0 || y==0 || x==y){
            System.out.println(x+y);
        }
    }
}
