package learn.java.loosecoupling;

public class Main {
    public static void main(String[] args) {
        // this is loose coupling because classes are not dependent on Vehicle class.
        // audi & bmw objects has their own different implementations
        // if we use the reference variable Audi, instead of Vehicle, tight coupling will occurred
        Vehicle audi = new Audi("AUDI");
        audi.move();
        audi.name();
        System.out.println(audi.toString());

        System.out.println();

        Vehicle bmw = new Bmw();
        bmw.move();
        bmw.name();
        System.out.println(bmw.toString());
    }
}
