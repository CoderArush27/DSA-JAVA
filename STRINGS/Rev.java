public class Rev {
    public static void reverse(String s){
        int i = 0;
        int j = s.length()-1;
        char a[]=s.toCharArray();
        while(i<j){
            char temp = a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
            j--;
        }
        for(char x:a)
            System.out.print(x);
        System.out.println();
    }
    public static void main(String[] args) {
        String s = "arush";
        reverse(s);
    }
}
