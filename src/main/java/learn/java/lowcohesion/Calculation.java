package learn.java.lowcohesion;

// class Calculation has calculation & display which occurred low cohesion
public class Calculation {

    public int sum(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public void result(int res){
        System.out.println("result is: " + res);
    }
}

