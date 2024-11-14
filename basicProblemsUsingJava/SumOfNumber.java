package basicProblemsUsingJava;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        SumOfNumber sum = new SumOfNumber();
        sum.Method1(9999);
        sum.Method2(9999);
    }

    Scanner scan = new Scanner(System.in);

    public void Method1(int x){

        int result = 0;

        while(x != 0){
            
            int multiple = 10;
            int input = x;

            input = input/10;
            int r = x - input * multiple;
            x = x / 10;
            multiple *= 10;

            result += r;
            
        }

        System.out.println("Sum of digits: " +result);

    }

    public void Method2(int x){

        int result = 0;

        while (x != 0) {
            int digit = x % 10;
            result += digit;
            x = x / 10;
        }

        System.out.println("Sum of digits: " + result);

    }
}

