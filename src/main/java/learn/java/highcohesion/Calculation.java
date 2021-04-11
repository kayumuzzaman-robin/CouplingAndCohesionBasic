package learn.java.highcohesion;

// class Calculation is fixed to only calculation, not to display
public class Calculation {

    public int sum( int x, int y){
        return x + y;
    }

    public int sub( int x, int y){
        return x - y;
    }
}
