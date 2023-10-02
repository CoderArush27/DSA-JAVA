
public class arrays1 {
    String name;
    int id;

    arrays1(String name,int id){
        this.name = name;
        this.id = id;
    }
    public static void main(String[] args) {
       arrays1 a[] = new arrays1[3];
       a[0] = new arrays1("arush", 1493);
       a[1] = new arrays1("addy", 1498);
       a[2] = new arrays1("acvbhj", 1499);
        for(int i=0;i<3;i++){
            System.out.println(a[i].name+" "+a[i].id);
        }
    }
}
