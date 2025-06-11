import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("coeficiente a: ");
        double a = sc.nextDouble();
        System.out.println("coeficiente b: ");
        double b = sc.nextDouble();
        System.out.println("coeficiente c: ");
        double c = sc.nextDouble();
        Calcular calculo = new Calcular(a, b, c);

        sc.close();
    }
}