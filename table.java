import java.util.*;

public class table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for Table");
        int num = sc.nextInt();
        for (int index = 1; index <= 10; index++) {
            System.out.println(num + " * " + index + " = " + num*index);
        }
        sc.close();
    }
}
