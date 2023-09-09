import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio037 {
    public Desafio037() {

    }

    public void Executar() {
        Scanner sc = new Scanner(System.in);

        List<String> nomesFuncionarios = new ArrayList<>();
        List<Double> salariosFuncionarios = new ArrayList<>();

        // Preencher a lista de nomes com os nomes dos funcionários
        nomesFuncionarios.add("Maria");
        nomesFuncionarios.add("Carlos");
        nomesFuncionarios.add("Felipe");
        nomesFuncionarios.add("Madjer");
        nomesFuncionarios.add("Luan");

        for (int i = 0; i < nomesFuncionarios.size(); i++) {
            System.out.print("Digite o salário de " + nomesFuncionarios.get(i) + ":R$ ");
            double salario = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer

            salariosFuncionarios.add(salario);
        }

        // Aplicar reajuste de acordo com as regras
        for (int i = 0; i < nomesFuncionarios.size(); i++) {
            double salario = salariosFuncionarios.get(i);
            double salarioReajustado = calcularSalarioReajustado(salario);
            salariosFuncionarios.set(i, salarioReajustado);
        }

        // Exibir os salários reajustados
        for (int i = 0; i < nomesFuncionarios.size(); i++) {
            System.out.println("Salário de " + nomesFuncionarios.get(i) + " reajustado: R$" + salariosFuncionarios.get(i));
        }
    }

    private double calcularSalarioReajustado(double salario) {
        if (salario <= 300.00) {
            return salario * 1.5; // Reajuste de 50%
        } else {
            return salario * 1.3; // Reajuste de 30%
        }
    }

    public static void main(String[] args) {
        Desafio037 desafio037;
        desafio037 = new Desafio037();
        desafio037.Executar();
    }
}
