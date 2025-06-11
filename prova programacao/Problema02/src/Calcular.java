public class Calcular {
    public double c1;
    public double c2;
    public double c3;

    public Calcular(double a, double b, double c){
        this.c1 = a;
        this.c2 = b;
        this.c3 = c;
        double delta = b * b - 4 * a * c;
        if(delta < 0){
            System.out.println("A equação não possui raízes reais.");
        }else{
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("x1 = %.4f%n", x1);
            System.out.printf("x2 = %.4f%n", x2);
        }
    }
}
