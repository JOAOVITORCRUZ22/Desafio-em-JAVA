import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Desafio013 {

    public Desafio013() {

    }

    public void Executar() {
     
         List<String> listaAlunos = new ArrayList<>();
         Scanner sc = new Scanner(System.in);
         Random random = new Random();

        System.out.println("Informe a quantidade de alunos");
        int quantidadeDeAlunos = sc.nextInt();

        for (int i = 1; i <= quantidadeDeAlunos; i++) {

            System.out.println("Informe o nome do aluno: ");
            String Nome = sc.next();
            listaAlunos.add(Nome);

        }
        
        //Sorteia um indice aleatorio para escolher o aluno
        
        int indiceSorteado = random.nextInt(listaAlunos.size());
        String alunoEscolhido = listaAlunos.get(indiceSorteado);
        
        System.out.println("O aluno escolhido para apagar o quadro é: " + alunoEscolhido);

    }

    public static void main(String[] args) {
        Desafio013 desafio013;
        desafio013 = new Desafio013();
        desafio013.Executar();

    }
}