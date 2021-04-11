package learn.java.lowcohesion;

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        int res = calculation.sum(1,2);
        calculation.result(res);
    }
}
