import java.util.Scanner;

public class Desafio027 {
    public Desafio027() {

    }

    public void Executar() {
        double a, b, so, sub, div, mult;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        a = sc.nextDouble();

        System.out.println("Informe o segundo numero:");
        b = sc.nextDouble();

        so = a + b;
        sub = a - b;
        div = a / b;
        mult = a * b;

        System.out.println("Resultado da soma:" + so);
        System.out.println("Resultado da subtração:" + sub);
        System.out.printf("Resultado da divisão:%.2f%n", div);
        System.out.println("Resultado da multiplicação:" + mult);

    }

    public static void main(String[] args) {
        Desafio027 desafio027;
        desafio027 = new Desafio027();
        desafio027.Executar();

    }
}