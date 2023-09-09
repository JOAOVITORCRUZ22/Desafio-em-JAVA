import java.util.Scanner;

public class Desafio006 {
    
    public Desafio006() {
        // Construtor vazio
    }
    
    public void Executar() {
        Scanner sc = new Scanner(System.in);



      System.out.println(" Digite o valor da largura em metros: ");
      double largura = sc.nextDouble();


     System.out.println(" Digite o valor da altura em metros: ");
      double altura = sc.nextDouble();

     double tamanhoDaArea = largura * altura;

     double areaEmTinta = tamanhoDaArea / 2;

    System.out.println("A area total da parede é: " + tamanhoDaArea + " m²");
    System.out.println("A quantidade de tinta necessária é : " + areaEmTinta + " m²");



 
        }


    public static void main(String[] args) {
        Desafio006 desafio = new Desafio006();
        desafio.Executar();
    }
}
