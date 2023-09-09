
import java.util.Scanner;

public class Desafio016 {

    public Desafio016() {

    }

    public void Executar() {
     
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um numero par.");
        }
        else {
            System.out.println(numero + "é um numero impar.");
        }




         }

    

    public static void main(String[] args) {
        Desafio016 desafio016;
        desafio016 = new Desafio016();
        desafio016.Executar();

    }
}