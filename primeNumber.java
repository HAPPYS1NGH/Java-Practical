import java.util.Scanner;

public class primeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to print Prime Numbers");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if(checkPrime(i)!=0){
           System.out.println(checkPrime(i)); 
            }
        }
        sc.close();
    }
    public static int checkPrime(int num){
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if(num % i == 0){
                return 0 ;
            }
        }
        return num;
    }
}
