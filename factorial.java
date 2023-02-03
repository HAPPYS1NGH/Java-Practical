import java.util.*;

class factorial {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int a = sc.nextInt();
        int f = fact(a);
        System.out.println("Factorial  of "+ a + " is " + f);
        sc.close();
    }
    static int fact(int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num -1);
    }
}
