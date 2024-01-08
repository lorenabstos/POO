import java.util.Scanner;

public class DiaDaSemana {
    private int dia;

    DiaDaSemana(int dia) {
        this.setDia(dia);
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void imprimeDia() {
        if (this.getDia() == 1) {
            System.out.println("Segunda");
        } else if (this.getDia() == 2) {
            System.out.println("Terca");
        } else if (this.getDia() == 3) {
            System.out.println("Quarta");
        } else if (this.getDia() == 4) {
            System.out.println("Quinta");
        } else if (this.getDia() == 5) {
            System.out.println("Sexta");
        } else if (this.getDia() == 6) {
            System.out.println("Sabado");
        } else if (this.getDia() == 7) {
            System.out.println("Domingo");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numDia = scan.nextInt();

        DiaDaSemana dia = new DiaDaSemana(numDia);
        dia.imprimeDia();

        scan.close();
    }
}