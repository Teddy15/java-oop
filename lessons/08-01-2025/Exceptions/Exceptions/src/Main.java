import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Checked vs Unchecked exceptions
        // Exception - primary class for checked exceptions
        // RuntimeException - primary class for unchecked exceptions

        // Unchecked
        try {
            int x = 0;
            int y = 10;
            System.out.print(y / x);
        } catch(MyException e2) {
            System.out.println("In Catch");
            e2.printStackTrace();
        } catch(ArithmeticException e3) {
            System.out.println("In Arithmetic catch");
        }

        // Checked
        try {
            FileReader fr = new FileReader("C:\\Projects\\a.txt");
            BufferedReader br = new BufferedReader(fr);
            for (int i = 0; i < 2; i++) {
                System.out.println(br.readLine());
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            throw new MyException(ex.getMessage());
        }
    }
}