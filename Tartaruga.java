import java.util.Scanner;

// Classe
public class Tartaruga {
    // Atributos
    private float tamanhoAtual;
    private float taxaCrescimento;

    // Construtor
    Tartaruga(float tamanhoAtual, float taxaCrescimento) {
        this.setTamanhoAtual(tamanhoAtual);
        this.setTaxaCrescimento(taxaCrescimento);
    }

    // Métodos get/set
    public float getTamanhoAtual() {
        return this.tamanhoAtual;
    }

    public void setTamanhoAtual(float tamanhoAtual) {
        this.tamanhoAtual = tamanhoAtual;
    }

    public float getTaxaCrescimento() {
        return this.taxaCrescimento;
    }

    public void setTaxaCrescimento(float taxaCrescimento) {
        this.taxaCrescimento = taxaCrescimento;
    }

    // Método de saída
    public void calculaAnos(Tartaruga turtle) {
        float anos = 0.0f;
        anos = this.getTamanhoAtual() - turtle.getTamanhoAtual();
        anos /= turtle.getTaxaCrescimento() - this.getTaxaCrescimento();
        System.out.printf("%.2f", anos);
    }

    // Método main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // tartaruga 1
        float ta1 = scan.nextFloat();
        float tc1 = scan.nextFloat();

        // tartaruga 2
        float ta2 = scan.nextFloat();
        float tc2 = scan.nextFloat();

        // objetos
        Tartaruga turtle1 = new Tartaruga(ta1, tc1);
        Tartaruga turtle2 = new Tartaruga(ta2, tc2);

        turtle1.calculaAnos(turtle2);

        scan.close();
    }

}