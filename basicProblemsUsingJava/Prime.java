package basicProblemsUsingJava;

public class Prime {
    public static void main(String[] args) {
        int num = 29;
        boolean flag = true;
        if (num == 2)
            System.out.println("Prime number");
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("Not a prime number");
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Prime number");
        }
    }
}
