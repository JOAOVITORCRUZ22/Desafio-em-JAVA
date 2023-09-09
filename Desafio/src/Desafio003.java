import java.util.Scanner;

public class Desafio003 {
    
    public Desafio003() {
        // Construtor vazio
    }
    
    public void Executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("O valor em centímetros é: " + centimetros);
        System.out.println("O valor em milímetros é: " + milimetros);
    }

    public static void main(String[] args) {
        Desafio003 desafio = new Desafio003();
        desafio.Executar();
    }
}
