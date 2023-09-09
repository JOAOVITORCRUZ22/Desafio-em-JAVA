import java.util.Scanner;

public class Desafio029 {
    public Desafio029() {

    }

    public void Executar() {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de meses: ");
        double mes = sc.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        double valorPres = sc.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        double tj = sc.nextDouble();

        // Taxa de juros ao mês
        double newPres = valorPres * tj * mes;

        System.out.println("O novo valor da prestação é: " + newPres);
    }

    public static void main(String[] args) {
        Desafio029 desafio029;
        desafio029 = new Desafio029();
        desafio029.Executar();

    }

}