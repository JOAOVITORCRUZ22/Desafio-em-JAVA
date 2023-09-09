import java.util.Scanner;

public class Desafio002 {
    
    public Desafio002() {
        // Construtor vazio
    }
    
    public void Executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();  // Alterado de sc.nextInt() para sc.nextDouble()

        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();  // Alterado de sc.nextInt() para sc.nextDouble()

        double media = (nota1 + nota2) / 2;

        System.out.println("A média das notas é: " + media);  
    }

    public static void main(String[] args) {
        Desafio002 desafio = new Desafio002();
        desafio.Executar();
    }
}
