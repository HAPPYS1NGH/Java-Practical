import java.util.*;

public class sort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers to sort");
        int ar[ ] =new int [10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
       for(int i =0 ; i<ar.length -1 ; i++){
        for (int j = i; j < ar.length; j++) {
            if(ar[j]<ar[i]){
                int temp = ar[j];
                ar[j] = ar[i];
                ar[i] =temp;
            }
        }
       }
       System.out.println("THE SORTED ELEMENTS ARE:");
       for (int i = 0; i < ar.length; i++) {
        System.out.println(ar[i]);
    }
        sc.close();

    }
    
}