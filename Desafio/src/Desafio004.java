import java.util.Scanner;

public class Desafio004 {
    
    public Desafio004() {
        // Construtor vazio
    }
    
    public void Executar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
       
        }
        }


    public static void main(String[] args) {
        Desafio004 desafio = new Desafio004();
        desafio.Executar();
    }
}
