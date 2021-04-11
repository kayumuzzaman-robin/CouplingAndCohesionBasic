package learn.java.loosecoupling;

public class Audi implements Vehicle{
    private String companyName;

    @Override
    public void move() {
        System.out.println("Audi is moving");
    }

    @Override
    public void name() {
        System.out.println("The name of the vehicle is Audi");
    }

    public Audi(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
