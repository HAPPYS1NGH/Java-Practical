import java.io.*;

public class sortNames {
    public static void main(String args[]) {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the Names");
            String names[] = new String[5];
            for (int i = 0; i < names.length; i++) {
                names[i] = b.readLine();
            }
            System.out.println("The Names are");
            for (int i = 0; i < names.length; i++) {
               System.out.print(names[i] + "\t"); 
            }

            for (int i = 0; i < names.length - 1; i++) {
                for (int j = i; j < names.length; j++) {
                    if(names[i].compareToIgnoreCase(names[j]) > 0){
                        String temp = names[i];
                        names[i]=names[j];
                        names[j]= temp;
                    }
                 }
             }
             System.out.println("The Sorted Names are");
             for (int i = 0; i < names.length ; i++) {
                    System.out.print(names[i] + "\t");
             }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
