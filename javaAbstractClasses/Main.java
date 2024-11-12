package javaAbstractClasses;

// we can not create a instanece of class for abstract classes
public class Main {
    public static void main(String[] args) {
        Year1 obj = new Year1();
        obj.aiTools();
        obj.dbms();


        // Year2 obj2 = new Year2(); error: abstract classes cannot create instance of class
    }
}

