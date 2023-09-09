import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio033 {
    public Desafio033() {

    }

    public void Executar() {
        Scanner sc = new Scanner(System.in);

        List<String> nomesPessoas = new ArrayList<>();
        List<Integer> idadesPessoas = new ArrayList<>();

        // Preencher a lista de nomes com os nomes das 10 pessoas
        nomesPessoas.add("João");
        nomesPessoas.add("Maria");
        nomesPessoas.add("Gabriel");
        nomesPessoas.add("Lilian");
        nomesPessoas.add("Marcos");
        nomesPessoas.add("Ryan");
        nomesPessoas.add("Felipe");
        nomesPessoas.add("Diego");
        nomesPessoas.add("José");
        nomesPessoas.add("Pedro");

        // Preencher a lista de idades com as idades das 10 pessoas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade de " + nomesPessoas.get(i) + ": ");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpa o buffer
        
            idadesPessoas.add(idade);
        }
        

        int countMaioresDe18 = 0;

        for (int idade : idadesPessoas) {
            if (idade > 18) {
                countMaioresDe18++;
            }
        }

        System.out.println("Pessoas com mais de 18 anos: " + countMaioresDe18);
    }

    public static void main(String[] args) {
        Desafio033 desafio033;
        desafio033 = new Desafio033();
        desafio033.Executar();
    }
}