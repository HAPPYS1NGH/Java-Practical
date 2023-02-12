import java.util.Scanner;

public class StringOperations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        int len = s.length();
        String changeCase="";
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                ch+=32;
            }
            else if(ch>=97 && ch<=122){
                ch-=32;
            }
            changeCase+=ch;
        }
        String firstexchange= s.charAt(len-1)+s.substring(1,len-1) +s.charAt(0);
        String trimLast = s.substring(0, len -1);
        System.out.println("The Upper Case String is "+ s.toUpperCase());
        System.out.println("The Lower Case String is "+ s.toLowerCase());
        System.out.println("The String with opposite Case "+changeCase);
        System.out.println("Interchanging first character with last character "+ firstexchange);
        System.out.println("Trim last character "+trimLast);
        System.out.println("Length of String is " + len);
        System.out.println("The character at 3rd position is "+ s.charAt(3)
        );
        System.out.println("The substring from  5th position is "+ s.substring(4)
        );
        System.out.println("The index of 3rd character is "+ s.indexOf(s.charAt(2)));
        System.out.println("Enter another string for equality");
        String a=sc.nextLine();
        equality(s, a);
        sc.close();
    }
    static void equality(String s1 , String s2){
        if(s1.equals(s2)){
            System.out.println("The Strings "+s1 + " and "+ s2 +" are equal");
        }
        else{
            System.out.println("The Strings "+s1 + " and "+ s2 +" are not equal");
        }
    }
}
