// import java.util.Scanner;

public class Stack {
    int  top , arr[] , size;
    Stack(int length){
        arr = new int [length];
        size =length;
        top=-1;
    }
    public int pop() {
        if(top== -1){
            System.out.println("Stack UnderFlow");   
            return -999;
        }
        int ele = arr[top];
        top--;
        System.out.println("Element popped is "+ ele);   
        return ele;
    }

    public void push(int num){
        if(size== arr.length -1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = num;
        System.out.println("The Element is pushed is "+ arr[top]);
    }

    public void print(){
        for (int j = 0; j <= top; j++) {
            System.out.print(arr[j]+"\t");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // char choice ='y';
        // while(choice =='y'){
        //     System.out.println("Enter the operation to perform");
            
        // }
        Stack s1 = new Stack(10);
        s1.push(99);
        s1.push(16);
        s1.print();
        s1.push(11);
        s1.push(14);
        s1.push(61);
        s1.print();
        s1.pop();
        s1.pop();
        s1.print();
        s1.push(90);
        s1.print();
    }
}
