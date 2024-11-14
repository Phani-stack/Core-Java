package basicProblemsUsingJava;

public class ReverseNum {
    public static void main(String[] args) {
        ReverseNum r = new ReverseNum();
        r.method(134);
    }

    public void method(int num){
        int reverse = 0, rem;

        while (num != 0)
        {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        };


        System.out.println ("Reversed Number: " + reverse);
    }
}
