import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int num = sc.nextInt();
        int a=0,b=1 , c=1;
        System.out.print(a+"\t");
        for(int i =0;i<num-1;i++){
            System.out.print(c+"\t");
            c=a+b;
            a=b;
            b=c;
        }

        sc.close();
    }
}
