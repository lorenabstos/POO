import java.util.Scanner;

public class Car {
    private int anoFabricacao;
    private double valor;

    Car(int anoFabricacao, double valor) {
        this.setAnoFabricacao(anoFabricacao);
        this.setValor(valor);
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    private void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void calculaImposto() {
        if (this.getAnoFabricacao() < 1990) {
            System.out.println(this.getValor() * 0.01);
        } else {
            System.out.println(this.getValor() * 0.015);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int anoFabricacao = scan.nextInt();
        double valor = scan.nextDouble();

        Car car = new Car(anoFabricacao, valor);

        car.calculaImposto();

        scan.close();
    }
}