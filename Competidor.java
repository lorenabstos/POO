import java.util.Scanner;

public class Competidor {
    private String nome;
    private int pontos;

    Competidor(String nome, int pontos) {
        this.setNome(nome);
        this.setPontos(pontos);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void comparaCompetidorCom(Competidor competidor) {
        if (competidor.getPontos() > this.getPontos()) {
            System.out.println(competidor.getNome());
        } else {
            System.out.println(this.getNome());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // competidor 1
        String nome1 = scan.nextLine();
        int pontos1 = scan.nextInt();

        scan.nextLine();

        // competidor 2
        String nome2 = scan.nextLine();
        int pontos2 = scan.nextInt();

        // objetos
        Competidor competidor1 = new Competidor(nome1, pontos1);
        Competidor competidor2 = new Competidor(nome2, pontos2);

        competidor1.comparaCompetidorCom(competidor2);

        scan.close();
    }
}