import java.util.Scanner;

public class Temperatura {
    private float fahrenheit;

    Temperatura(float fahrenheit) {
        this.setTemperatura(fahrenheit);
    }

    public float getTemperatura() {
        return this.fahrenheit;
    }

    public void setTemperatura(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void converteCelsius() {
        float celsius = (5.0f / 9) * (this.getTemperatura() - 32);
        System.out.printf("Temperatura em F: %.1f\n", this.getTemperatura());
        System.out.printf("Temperatura em C: %.1f", celsius);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float fahrenheit = scan.nextFloat();

        Temperatura temp = new Temperatura(fahrenheit);
        temp.converteCelsius();

        scan.close();
    }
}