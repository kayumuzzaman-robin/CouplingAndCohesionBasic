package learn.java.tightcoupling;

/**
 * Hello world!
 */
public class Volume {
    public static void main(String[] args) {
        Box box = new Box(2,2,2);
        System.out.println(box.toString());
        // by using .volume, we directly changing Box class. this makes tightly coupled.
        box.volume = -10;
        System.out.println(box.toString());
    }
}
