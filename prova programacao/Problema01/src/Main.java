import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a nota do primeiro semestre: ");
        double nota1 = sc.nextDouble();
        System.out.println("digite a nota do segundo semestre: ");
        double nota2 = sc.nextDouble();
        Notas nota = new Notas(nota1, nota2);
        sc.close();
    }
}