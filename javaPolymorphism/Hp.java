package javaPolymorphism;

public class Hp implements Laptop{
    public void camera(){
        System.out.println("Camera Works");
    }

    public void mic(){
        System.out.println("Microphone Works");
    }

    @Override
    public void keys(){
        System.out.println("Keys Works 1.0");
    }

}
