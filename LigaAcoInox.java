import java.util.Scanner;

public class LigaAcoInox {
    private double acoPuro;
    private double cromo;
    private double niquel;

    LigaAcoInox(double acoPuro) {
        this.setAcoPuro(acoPuro);
    }

    public double getAcoPuro() {
        return this.acoPuro;
    }

    public void setAcoPuro(double acoPuro) {
        this.acoPuro = acoPuro;
    }

    public double getCromo() {
        return this.cromo;
    }

    public void setCromo(double cromo) {
        this.cromo = cromo;
    }

    public double getNiquel() {
        return this.niquel;
    }

    public void setNiquel(double niquel) {
        this.niquel = niquel;
    }

    public void calculaMateriais() {
        double var = (this.getAcoPuro() * 100.0) / 74.0;
        this.setCromo(var * 0.18);
        this.setNiquel(var * 0.08);
        System.out.printf("%.2f\n%.2f", this.getCromo(), this.getNiquel());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double AP = scan.nextDouble();

        LigaAcoInox lai = new LigaAcoInox(AP);

        lai.calculaMateriais();

        scan.close();
    }
}