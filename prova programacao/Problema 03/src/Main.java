import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int n2 = sc.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int n3 = sc.nextInt();
        MenorNum cal = new MenorNum(n1, n2, n3);
        sc.close();
    }
}