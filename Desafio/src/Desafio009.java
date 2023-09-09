import java.util.Scanner;

public class Desafio009 {
    
    public Desafio009() {
        // Construtor vazio
    }
    
    public void Executar() {
        Scanner sc = new Scanner(System.in);



      System.out.println(" Digite a temperatura em Grau C° (Celsius): ");
      double temperaturaEmCelsius = sc.nextDouble();

      double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;


      System.out.println("A temperatura em Fahrenheit é: " + temperaturaEmFahrenheit);


        }


    public static void main(String[] args) {
        Desafio009 desafio = new Desafio009();
        desafio.Executar();
    }
}
