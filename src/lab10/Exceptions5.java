package lab10;

public class Exceptions5 {

    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (NullPointerException npe) {

        }

    }

    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for” + key";
    }


    public static void main(String[] args) {
        new Exceptions5().printMessage(null);
    }

}
