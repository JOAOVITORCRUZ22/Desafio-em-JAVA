import java.util.Scanner;

public class Desafio005 {
    
    public Desafio005() {
        // Construtor vazio
    }
    
    public void Executar() {
        Scanner sc = new Scanner(System.in);



      System.out.println(" Digite o valor de reais que você na tem carteira: ");
      double valorEmReais = sc.nextDouble();

      double dolar = 5.00;
      double quantidadeEmDolares = valorEmReais / dolar;

      System.out.println("Você pode comprar US$ " + quantidadeEmDolares + " dolares");



 
        }


    public static void main(String[] args) {
        Desafio005 desafio = new Desafio005();
        desafio.Executar();
    }
}
