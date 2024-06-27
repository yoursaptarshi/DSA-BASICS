public class queue{
    private int front,rear,maxCapacity;
    private int[] queueArray;

    queue(int size){
        this.front = 0;
        this.rear=0;
        this.maxCapacity = size;
        queueArray = new int[maxCapacity];
    }

    public void enqueue(int element){
        if(rear >= maxCapacity -1){
            System.out.println("Queue is full, can not enter elements");
            return;
        }
        queueArray[rear] = element;
        rear++;

    }


    public void dequeue(){
        for(int i=0;i<rear;i++){
            queueArray[i]=queueArray[i+1];
        }
        rear--;
    }

    public void display(){
        System.out.print("The queue is \t");
        if(front == rear){
            System.out.print("Empty");
            return;
        }
        for(int i=front;i<rear;i++){
            System.out.print("|"+queueArray[i]);
        }
        System.out.print("|");
    }

    public static void main(String[] args) {
        queue que = new queue(5);

        que.enqueue(0);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.dequeue();
        que.display();
    }
}