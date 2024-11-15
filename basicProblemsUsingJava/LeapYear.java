package basicProblemsUsingJava;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear ly = new LeapYear();
        ly.leapYear(2024);
    }

    public void leapYear(int year){
        if (year % 400 == 0)
        System.out.println (year + " is a Leap Year");

        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println (year + " is a Leap Year");

        else
            System.out.println (year + " is not a Leap Year");
    }
}

