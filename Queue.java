public class Queue {
    int queue[],front ,rear , size;
    Queue(int length){
        queue =new int[length];
        size=length;
        front=0;
        rear =-1;
    }
    public boolean isFull() {
        if(rear == size && front==0)
        return true;
        else
        return false;
    }
    public boolean isEmpty() {
        if (front==-1 && rear==-1) {
            return true;
        }
        else
        return false;
    }

    public void enQueue(int num) {
        if(isFull()){
            System.out.println("Queue Overflow");
        }
        else{
            rear++;
            queue[rear]=num;
            System.out.println("Element added is "+ queue[rear]);
        }
    }
    public void deQueue() {
        if(isEmpty()){
            System.out.println("Queue UnderFlow");
        }
        else{
            System.out.println("Element Pooped is"+queue[front]);
            front++;
        }
    }
    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "\t");
        }
    }
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.enQueue(11);
        q1.enQueue(12);
        q1.enQueue(19);
        q1.enQueue(13);
        q1.display();
        q1.deQueue();
        q1.display();


    }
}
