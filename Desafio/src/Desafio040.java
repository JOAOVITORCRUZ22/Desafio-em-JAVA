import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio040 {
    public Desafio040() {
    }

    public void Executar() {
        Scanner sc = new Scanner(System.in);

        List<String> nomesAlunos = new ArrayList<>();
        List<Double> alturasAlunos = new ArrayList<>();
        List<Integer> codigosMatricula = new ArrayList<>();

        // Preencher a lista de nomes com os nomes dos alunos
        nomesAlunos.add("Carlos");
        nomesAlunos.add("Ana");
        nomesAlunos.add("Maria");
        nomesAlunos.add("Paula");
        nomesAlunos.add("Felipe");
        nomesAlunos.add("Ricardo");
        nomesAlunos.add("Anthony");
        nomesAlunos.add("Camila");
        nomesAlunos.add("Thiago");
        nomesAlunos.add("Roberta");

        for (int i = 0; i < nomesAlunos.size(); i++) {
            System.out.print("Digite a altura (em metros) do " + nomesAlunos.get(i) + ": ");
            double altura = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer

            System.out.print("Digite o código de matrícula do " + nomesAlunos.get(i) + ": ");
            int codigoMatricula = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            alturasAlunos.add(altura);
            codigosMatricula.add(codigoMatricula);
        }

        int indiceAlunoMaisAlto = 0;
        int indiceAlunoMaisBaixo = 0;

        for (int i = 1; i < alturasAlunos.size(); i++) {
            if (alturasAlunos.get(i) > alturasAlunos.get(indiceAlunoMaisAlto)) {
                indiceAlunoMaisAlto = i;
            }
            if (alturasAlunos.get(i) < alturasAlunos.get(indiceAlunoMaisBaixo)) {
                indiceAlunoMaisBaixo = i;
            }
        }

        System.out.println("Aluno mais alto: " + nomesAlunos.get(indiceAlunoMaisAlto));
        System.out.println("Altura: " + alturasAlunos.get(indiceAlunoMaisAlto) + " metros");
        System.out.println("Código de Matrícula: " + codigosMatricula.get(indiceAlunoMaisAlto));

        System.out.println("Aluno mais baixo: " + nomesAlunos.get(indiceAlunoMaisBaixo));
        System.out.println("Altura: " + alturasAlunos.get(indiceAlunoMaisBaixo) + " metros");
        System.out.println("Código de Matrícula: " + codigosMatricula.get(indiceAlunoMaisBaixo));
    }

    public static void main(String[] args) {
        Desafio040 desafio040 = new Desafio040();
        desafio040.Executar();
    }
}
