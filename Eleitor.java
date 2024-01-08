import java.util.Scanner;

public class Eleitor {
    private int idade;

    Eleitor(int idade) {
        this.setIdade(idade);
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void classeEleitoral() {
        if (this.getIdade() < 16) {
            System.out.println("nao votante");
        } else if (this.getIdade() >= 18 && this.getIdade() <= 65) {
            System.out.println("eleitor obrigatorio");
        } else {
            System.out.println("eleitor facultativo");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade = scan.nextInt();

        Eleitor eleitor = new Eleitor(idade);

        eleitor.classeEleitoral();

        scan.close();
    }
}