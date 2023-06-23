
public class Queue {
    private Clothing[] a;
    private int size;
    private int nIteams;
    private int front;
    private int rear;

    public Queue(int maxSize){
        this.size = maxSize;
        a = new Clothing[size];
        front = 0;
        nIteams = 0;
        rear = -1;
    }


    public void add(Clothing cloth){
        rear = ++rear % size;
        a[rear] = cloth;
        nIteams ++;
    }


    public Clothing remove(){
        nIteams --;
        front = front % size;
        return a[front++];
    }


    public Clothing peek(){
        return a[front];
    }

    public void display(){
        System.out.print("[");
        int item = front;
        for (int i = 0; i < nIteams; i++) {
            System.out.print(a[item++ % size]);
            if(i != nIteams-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }


    public boolean isFull(){
        return (nIteams == size);
    }


    public boolean isEmpty(){
        return (nIteams == 0);
    }


    public int size(){
        return nIteams;
    }
}