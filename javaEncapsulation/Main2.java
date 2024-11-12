package javaEncapsulation;

public class Main2 {
    public static void main(String[] args) {
        AccDetails ad = new AccDetails();
        ad.getId();
        ad.getPassword();
        
        ad.setpassword(2027);

        System.out.println(ad.getId());
        System.out.println(ad.getPassword());
    }
}
