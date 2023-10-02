public class basic2 {
    public static void main(String[] args) {
        String s = "arush";
        int i = 0;
        int j = s.length()-1;

        char c[] = s.toCharArray();

        while(i<j){
            char k = c[i];
            c[i++] = c[j];
            c[j--] = k;
        }
        System.out.println(String.valueOf(c));
    }
}
