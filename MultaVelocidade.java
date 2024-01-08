import java.util.Scanner;

public class MultaVelocidade {
    private int velocidadeMaxima;
    private int velocidadeAtual;

    MultaVelocidade(int velocidadeMaxima, int velocidadeAtual) {
        this.setVelocidadeMaxima(velocidadeMaxima);
        this.setVelocidadeAtual(velocidadeAtual);
    }

    public int getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void calcularMulta() {
        int valorMulta = 0;
        int diferencaVelocidade = this.getVelocidadeAtual() - this.getVelocidadeMaxima();

        if (diferencaVelocidade > 0) {
            if (diferencaVelocidade <= 10) {
                valorMulta = 50;
            } else if (diferencaVelocidade <= 30) {
                valorMulta = 100;
            } else {
                valorMulta = 200;
            }
        }
        System.out.println(valorMulta);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int VMAX = scan.nextInt();
        int VMOTORA = scan.nextInt();

        MultaVelocidade obj = new MultaVelocidade(VMAX, VMOTORA);

        obj.calcularMulta();

        scan.close();
    }
}