import java.util.Scanner;

public class Jogo {
    private int numero;
    private int tentativa;

    Jogo(int numero, int tentativa) {
        this.setNumero(numero);
        this.setTentativa(tentativa);
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTentativa() {
        return this.tentativa;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }

    public void comparaNumero() {
        if (this.getNumero() > this.getTentativa()) {
            System.out.println("menor");
        } else if (this.getNumero() == this.getTentativa()) {
            System.out.println("igual");
        } else {
            System.out.println("maior");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ND = scan.nextInt();
        int NT = scan.nextInt();

        Jogo jogo = new Jogo(ND, NT);

        jogo.comparaNumero();

        scan.close();
    }
}