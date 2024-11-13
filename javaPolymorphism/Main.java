package javaPolymorphism;

// Polymorphism in java is two types
// 1.Compile time polymorphism - Archived by method overloading
// 2.Run time polymorphism - Archived by method overriding

public class Main {
    public static void main(String[] args) {

        Laptop hp = new Hp();
        ArthematicOp ao = new ArthematicOp();
        ao.add(2, 3);
        ao.add(2, 3, 7);

        

        hp.camera();
        hp.mic();
        hp.keys();

    }
}
