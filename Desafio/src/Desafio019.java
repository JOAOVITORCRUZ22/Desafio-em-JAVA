
import java.util.Scanner;

public class Desafio019 {

    public Desafio019() {

    }

    public void Executar() {
     
        String VERDE = "\u001B[32m";
        String VERMELHO = "\u001B[31m";
        Scanner sc = new Scanner(System.in);
            

        System.out.println("Digite a idade do usuário: ");
        int idade = sc.nextInt();
         
        if (idade >= 18) {
            System.out.println(VERDE +"Permissão concedida");
        } else {
            System.out.println(VERMELHO + "Sem permissão");

        }

         }

    

    public static void main(String[] args) {
        Desafio019 desafio019;
        desafio019 = new Desafio019();
        desafio019.Executar();

    }
}