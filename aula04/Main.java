import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        int opcao = 0;

    while (opcao != 3) {
        System.out.println("SISTEMA DE CADASTRO DE PESSOAS");
        System.out.println("1- Cadastrar pessoa física! ");
        System.out.println("2- Cadastrar pessoa jurídica! ");
        System.out.println("3- Sair!");
        System.out.print("Escolha: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("CPF: ");
            String cpf = scanner.nextLine();
            listaPessoas.add(new PessoaFisica(nome, cpf));
            System.out.println("Pessoa Física cadastrada!");
        } else if (opcao == 2) {
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("CNPJ: ");
            String cnpj = scanner.nextLine();
            listaPessoas.add(new PessoaJuridica(nome, cnpj));
            System.out.println("Pessoa Jurídica cadastrada!");
        }
    }
    System.out.println("RELATÓRIO DE CADASTROS!");
    for (Pessoa p: listaPessoas) {
        if (p instanceof PessoaFisica) {
            System.out.println(p.toString());
        } else if (p instanceof PessoaJuridica) {
            System.out.println(p.toString());
        }
    }
    scanner.close();
    }
}