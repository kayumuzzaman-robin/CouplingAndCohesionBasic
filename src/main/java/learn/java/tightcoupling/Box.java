package learn.java.tightcoupling;

public class Box {
    // this public data member will make this class tightly coupling
    public int volume;
    Box(int length, int width, int height)
    {
        this.volume = length * width * height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "volume=" + volume +
                '}';
    }
}
