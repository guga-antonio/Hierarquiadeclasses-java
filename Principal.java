package hierarquiadeclasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionarios deseja cadastrar? ");
        int quantidade = scanner.nextInt();

        while (quantidade < 1 || quantidade > 10) {
            System.out.print("Digite uma quantidade entre 1 e 10: ");
            quantidade = scanner.nextInt();
        }

        for (int i = 0; i < quantidade; i++) {

            System.out.println("\n--- FUNCIONARIO " + (i + 1) + " ---");

            System.out.println("1 - Assalariado");
            System.out.println("2 - Horista");
            System.out.print("Digite o tipo do funcionario: ");
            int tipo = scanner.nextInt();

            scanner.nextLine();

            if (tipo == 1) {

                System.out.println("Voce escolheu assalariado");

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("CPF: ");
                String cpf = scanner.nextLine();

                System.out.print("Endereco: ");
                String endereco = scanner.nextLine();

                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();

                System.out.print("Setor: ");
                String setor = scanner.nextLine();

                System.out.print("Salario: ");
                double salario = scanner.nextDouble();

                Assalariado funcionario = new Assalariado(
                        nome, cpf, endereco, telefone, setor, salario);

                funcionarios.add(funcionario);

            } else if (tipo == 2) {

                System.out.println("Voce escolheu horista");

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("CPF: ");
                String cpf = scanner.nextLine();

                System.out.print("Endereco: ");
                String endereco = scanner.nextLine();

                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();

                System.out.print("Setor: ");
                String setor = scanner.nextLine();

                System.out.print("Horas trabalhadas: ");
                double horasTrabalhadas = scanner.nextDouble();

                System.out.print("Valor da hora: ");
                double valorHora = scanner.nextDouble();

                Horista funcionario = new Horista(
                        nome, cpf, endereco, telefone, setor,
                        horasTrabalhadas, valorHora);

                funcionarios.add(funcionario);

            } else {
                System.out.println("Tipo invalido!");
            }
        }

        System.out.println("\n===== FUNCIONARIOS CADASTRADOS =====");

        for (Funcionario funcionario : funcionarios) {

            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Endereco: " + funcionario.getEndereco());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println("Setor: " + funcionario.getSetor());
            System.out.println("Pagamento: R$ " + funcionario.calculoSalario());

            System.out.println("-----------------------------");
        }

        System.out.print("\nDigite o percentual de aumento: ");
        double percentual = scanner.nextDouble();

        for (Funcionario funcionario : funcionarios) {
            funcionario.aplicarAumento(percentual);
        }

        System.out.println("\n===== PAGAMENTOS APOS O AUMENTO =====");

        for (Funcionario funcionario : funcionarios) {

            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Novo pagamento: R$ " + funcionario.calculoSalario());

            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}