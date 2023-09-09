import java.util.Scanner;

public class Desafio010 {
    
    public Desafio010() {
        // Construtor vazio
    }
    
    public void Executar() {
        Scanner sc = new Scanner(System.in);



      System.out.println(" Digite a quantidade de KM percorridos pelo carro alugado: ");
      double kmPercorridos = sc.nextDouble();
      System.out.println(" Digite a quantidade de dias que o carro foi alugado: ");
      double diasAlugado = sc.nextDouble();

      double precoAPagar= (diasAlugado * 60) + (kmPercorridos * 0.15);

      
    System.out.println(" O preço a pagar é : " + precoAPagar + " R$");

     

        }


    public static void main(String[] args) {
        Desafio010 desafio = new Desafio010();
        desafio.Executar();
    }
}
