import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of stack");
        int stackLength= sc.nextInt();
        Stack s1 = new Stack(stackLength);
        char choice ='y';
        while(choice !='q'){
            System.out.println("Enter the operation to perform");
            System.out.println("Enter 1 for Push an Element");
            System.out.println("Enter 2 for Pop an Element");
            System.out.println("Enter 3 for Display the Elements in Stack");
            System.out.println("Enter q for Exit");
            choice=sc.next().charAt(0);
            switch (choice) {
                case '1':
                System.out.println("Enter th element to push");
                int ele=sc.nextInt();
                    s1.push(ele);
                    break;
                case '2':
                        // int poppedElement = s1.pop();
                        s1.pop();
                        break;
                        case '3':
                    s1.print();
                    break;
                    case 'q':
                    break;
                default:
                System.out.println("Wrong Choice ! Check the Instructions.");
                    break;
            }
        }
        sc.close();
        // s1.push(99);
        // s1.push(16);
        // s1.print();
        // s1.push(11);
        // s1.push(14);
        // s1.push(61);
        // s1.print();
        // s1.pop();
        // s1.pop();
        // s1.print();
        // s1.push(90);
        // s1.print();
    }
}
