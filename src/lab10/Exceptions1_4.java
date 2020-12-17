package lab10;

import java.util.Scanner;

public class Exceptions1_4 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
        (new Exceptions1_4()).exceptionDemo();
    }
}
