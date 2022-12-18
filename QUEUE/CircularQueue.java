
public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front; 

        Queue(int n){
            arr=new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
    
    
    public static boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }

    public void Enque(int data){          //push
        if(isFull()){
            System.out.println("QUEUE IS FULL");
            return;
        }
        
        if(front==-1){
            front =0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }

    public int Dequeue(){
        if(isEmpty()){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }
        int result = arr[front];  
        

        //last element
        if(rear==front){
            front=rear=-1;
        }
        else{
            front = (front+1)%size;
        }
        return result;
    }

    public int peek(){
        if(rear==-1){
            System.out.println("QUEUE IS EMPTY");
            return -1;
        }
        return arr[front];
    }
}
    public static void main(String[] args) {
        Queue s = new Queue(5);
        s.Enque(10);
        s.Enque(20);
        s.Enque(50);
        s.Enque(60);
        s.Enque(900);
        System.out.println(s.Dequeue());
        s.Enque(70);
        System.out.println(s.Dequeue());
        s.Enque(100);

        s.Enque(150);
    }
}
