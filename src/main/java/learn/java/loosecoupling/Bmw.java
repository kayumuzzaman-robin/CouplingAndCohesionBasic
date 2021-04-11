package learn.java.loosecoupling;

public class Bmw implements Vehicle{
    @Override
    public void move() {
        System.out.println("Bmw is moving");
    }

    @Override
    public void name() {
        System.out.println("The name of the vehicle is Bmw");
    }

    @Override
    public String toString() {
        return "Bmw{}";
    }
}
