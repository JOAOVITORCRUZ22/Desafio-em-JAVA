import java.util.Scanner;
public class Desafio034 {

    public Desafio034() {

    }

    public void Executar() {
          int soma = 0;


        for (int i = 1; i <= 1000; i++) {
            soma = soma + i;

        }
        System.out.println("O valor da soma dos numeros de 1 a 1000 é: " + soma);

    }

    public static void main(String[] args) {
        Desafio034 desafio034;
        desafio034 = new Desafio034();
        desafio034.Executar();
    }
}