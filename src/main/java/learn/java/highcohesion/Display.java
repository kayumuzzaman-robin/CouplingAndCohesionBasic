package learn.java.highcohesion;

public class Display {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        int subResult = calculation.sub(12, 10);
        System.out.println("subResult: " + subResult);
    }
}
