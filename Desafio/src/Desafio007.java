import java.util.Scanner;

public class Desafio007 {
    public Desafio007() {

    }

    public void Executar() {
        double pre, pred;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preço do produto:");
        pre = sc.nextInt();

        pred = pre * 0.95;

        System.out.println("\n Preço do produto com 5% de desconto:" + pred);

    }

    public static void main(String[] args) {

        Desafio007 desafio007;
        desafio007 = new Desafio007();
        desafio007.Executar();
    }
}
