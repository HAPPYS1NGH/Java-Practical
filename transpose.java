import java.util.*;

public class transpose {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int ar[][] = new int [3] [3];
        System.out.println("Enter the numbers for Matrix");
        for (int index = 0; index < 3; index++) {
            for (int j  = 0; j < 3; j++) {
                ar[index][j]= sc.nextInt();
            }
        }
        System.out.println("The Matrix is");       
        for (int index = 0; index < 3; index++) {
            for (int j  = 0; j < 3; j++) {
                System.out.print(ar[index][j]);
            }
            System.out.println();
        }
        System.out.println("The Transpose of Matrix is");       
        for (int index = 0; index < 3; index++) {
            for (int j  = 0; j < 3; j++) {
                System.out.print(ar[j][index]);
            }
            System.out.println();
        }
        sc.close();
    }
}
