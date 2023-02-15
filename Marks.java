import java.util.*;

class MarksOutOfBounds extends Exception{
    public String error() {
        return "Marks Out of Bounds";
    }
}

public class Marks{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks obtained");
        int m = sc.nextInt();
        sc.close();
        try{
        if(m>=0 && m<=100){
            System.out.println("Marks Entered are "+ m);
        }
        else{
            throw new MarksOutOfBounds();
        }
    }
    catch(MarksOutOfBounds e){
            System.out.println(e.error());
    }
    }
}
