import java.util.Scanner;

public class Carro {
    private double custoFabrica;
    private double custoFinal;

    Carro(double custoFabrica) {
        this.setCustoFabrica(custoFabrica);
    }

    public double getCustoFabrica() {
        return this.custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double getCustoFinal() {
        return this.custoFinal;
    }

    public void setCustoFinal(double custoFinal) {
        this.custoFinal = custoFinal;
    }

    public void calculaCustoFinal() {
        double custoFinal = this.getCustoFabrica() + (this.getCustoFabrica() * 0.45) + (this.getCustoFabrica() * 0.12);
        this.setCustoFinal(custoFinal);
        System.out.printf("%.2f", this.getCustoFinal());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double custoFabrica = scan.nextDouble();

        Carro car = new Carro(custoFabrica);

        car.calculaCustoFinal();

        scan.close();
    }
}