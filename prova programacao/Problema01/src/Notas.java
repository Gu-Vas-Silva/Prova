public class Notas {
    public double nota1;
    public double nota2;

    public Notas(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
        double media = (nota1 + nota2)/2;
        System.out.println("Nota final: " + media);
        if(media < 60){
            System.out.println("REPROVADO");
        }
    }
}
