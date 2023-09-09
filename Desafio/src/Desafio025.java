import java.util.Scanner;

public class Desafio025 {
    
    public Desafio025() {
        // Construtor vazio
    }
    
    public void Executar() {
        Scanner sc = new Scanner(System.in);



      System.out.println(" Digite o primeiro número: ");
      double num1 = sc.nextDouble();
      System.out.println(" Digite o segundo número: ");
      double num2 = sc.nextDouble();
     
      Calculadora calculadora = new Calculadora(); 

      double quadradoDiferenca = calculadora.calcularQuadradoDiferenca(num1, num2);

      
    System.out.println(" O quadrado da diferenca entre " + num1 + " e " + num2 + " é " + quadradoDiferenca );

     

        }

     
      
    public static void main(String[] args) {

        Desafio025 desafio = new Desafio025();
        desafio.Executar();
    }

    class Calculadora {
        public Calculadora() {
            // Construtor vazio
        }
        
        public double calcularQuadradoDiferenca(double num1, double num2) {
            double diferenca = num1 - num2;
            double quadradoDiferenca = Math.pow(diferenca, 2);
            return quadradoDiferenca;
        }
    }

}
