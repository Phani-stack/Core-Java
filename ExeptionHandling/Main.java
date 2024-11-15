package ExeptionHandling;

public class Main {
    public static void main(String[] args) //throws
    {
        int x = 40;
        int y = 0;

        try {
            int r = x/y;
            System.out.println(r);
        }

         catch(ArithmeticException ae){
            System.out.println("Invalid input");
            throw ae;
        }

        finally {
            System.out.println("Exection Done !!");
        }

        System.out.println("Every Thing Done");
    }
}
