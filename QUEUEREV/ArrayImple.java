
public class ArrayImple {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void enque(int data){
            if(rear == size-1){
                System.out.println("QUEUE IS FULL");
                return;
            }
            rear = rear+1;
            arr[rear]=data;
        }
        public static void dequeue(){
            if(isEmpty()){
                System.out.println("QUEUE IS EMPTY");
                return;
            }
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
        }
        public static int peek(){
            if(isEmpty())
            return -1;

            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.enque(60);

        for(int i=0;i<5;i++){
            System.out.print(q.peek()+" ");
            q.dequeue();
        }
    }
}
