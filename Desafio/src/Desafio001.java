import java.util.Scanner;

public class Desafio001 {
    
    public Desafio001() {
        // Construtor vazio
    }
    
    public void Executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero:");
        double numero = sc.nextDouble(); 

        double dobro = numero * 2;
        double triplo = numero * 3;
        double raizQuadrada = Math.sqrt(numero);

        System.out.println("O dobro de " + numero + " é: "  + dobro);  
        System.out.println("O triplo de " + numero + " é: "  + triplo); 
        System.out.println("A raiz quadrada de " + numero + " é: "  + raizQuadrada);
    }

    public static void main(String[] args) {
        Desafio001 desafio = new Desafio001();
        desafio.Executar();
    }
}
