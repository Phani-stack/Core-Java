package javaEncapsulation;

public class Main {
    public static void main(String[] args) {

        Student person = new Student();
        person.setName("John Doe");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

