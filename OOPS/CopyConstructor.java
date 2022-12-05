
class pen{
    String color;
    int quantity;
    int arr[];
    pen(){
        arr = new int[2];
        this.color = "red";
        this.quantity = 25;
    }
    //shallow copy constructor
    // pen(pen p1){
    //     arr = new int[2];
    //     this.color = p1.color;
    //     this.quantity = p1.quantity;
    //     this.arr = p1.arr;
    // }

    //deep copy contructor
    pen(pen p1){
        arr = new int[2];
        this.color = p1.color;
        this.quantity = p1.quantity;
        for(int i=0;i<arr.length;i++){
            this.arr[i] = p1.arr[i];
        }
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.arr[0]=20;
        p1.arr[1]=60;
        pen p2 = new pen(p1);
        p1.arr[1]=80;
        for(int i=0;i<p2.arr.length;i++){
            System.out.println(p2.arr[i]);
        }
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("FOR OBJECT P1");
        System.out.println(p1.color);
        System.out.println(p1.quantity); 
    
        System.out.println("FOR OBJECT P2");
        System.out.println(p2.color);
        System.out.println(p2.quantity); 
    }
}
