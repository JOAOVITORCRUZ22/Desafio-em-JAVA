import java.util.Scanner;

public class Desafio008 {
    
    public Desafio008() {
        // Construtor vazio
    }
    
    public void Executar() {
        Scanner sc = new Scanner(System.in);



      System.out.println(" Digite o salário: ");
      double salario = sc.nextDouble();

      double salarioComAumento = salario * 1.15;


    System.out.println("O salário com aumento é: " + salarioComAumento + " R$");


        }


    public static void main(String[] args) {
        Desafio008 desafio = new Desafio008();
        desafio.Executar();
    }
}
