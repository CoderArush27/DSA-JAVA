public class ImpleArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size = n;
            rear = -1;
        }
    
    
    public static boolean isEmpty(){
        return rear==-1;
    }

    public void Enque(int data){          //push
        if(rear == size-1){
            System.out.println("QUEUE IS FULL");
            return;
        }
        rear=rear+1;
        arr[rear]=data;

    }

    public int Dequeue(){
        if(isEmpty()){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }
        int front = arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return front;
    }

    public int peek(){
        if(rear==-1){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }
        return arr[0];
    }
}
    public static void main(String[] args) {
        Queue s = new Queue(5);
        s.Enque(10);
        s.Enque(20);
        s.Enque(50);
        s.Enque(60);

        
        while(!(s.isEmpty())){
            System.out.println(s.peek());
            s.Dequeue();
        }
    }
}
