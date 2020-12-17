package lab10;

import java.util.Scanner;

public class Exceptions7_8 {

    public void getKey() throws Exception {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            printDetails(key);
        }
        catch (Exception e){
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            printDetails(key);
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (NullPointerException e){

        }
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        Exceptions7_8 exceptions7 = new Exceptions7_8();
        exceptions7.getKey();
    }

}
