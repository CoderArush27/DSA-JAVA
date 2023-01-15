public class BreakStatement {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
            if(j==3){
                break;
            }
            System.out.println(i+" "+j+" ");
        }
    }
}
}
