import java.util.Scanner;

public class checkVowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check for vowel");
        char check = sc.next().charAt(0);
        if(check=='a' ||check=='e' ||check=='i' ||check=='o' ||check=='u' ||check=='A' ||check=='E' ||check=='I' ||check=='O' ||check=='U' ){
            System.out.println("The "+ check +" is a Vowel");
        }
        else{
            System.out.println("The "+ check +" is not a Vowel");
        }
        sc.close();
    }
}
