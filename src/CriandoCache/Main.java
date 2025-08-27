package CriandoCache;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta;

        ArrayList<Pessoa> banco = new ArrayList<>();
        ArrayList<Pessoa> cache = new ArrayList<>();

        System.out.println("Bem vindo ao banco.");
        banco.add(new Pessoa(1, "Pedro", 21));
        banco.add(new Pessoa(2, "João", 22));
        banco.add(new Pessoa(3, "Ana Julia", 23));
        banco.add(new Pessoa(4, "Carlos", 24));
        banco.add(new Pessoa(5, "Julia", 25));
        banco.add(new Pessoa(6, "Natalia", 26));
        banco.add(new Pessoa(7, "Alessandra", 27));
        banco.add(new Pessoa(8, "Victor", 28));
        banco.add(new Pessoa(9, "Jackson", 29));
        banco.add(new Pessoa(10, "Thiago", 30));
        banco.add(new Pessoa(11, "Larissa", 31));
        banco.add(new Pessoa(12, "Matheus", 32));

        // System.out.println(banco);

        System.out.println("Escolha a opção que deseja executar: ");

        while (true) {
            System.out.println("""
                    \n1. Consultar pessoa através do ID
                    2. Cadastrar nova pessoa
                    3. Sair
                    """);
            resposta = sc.nextInt();
            sc.nextLine();

            if (resposta == 1) {
                System.out.println(banco.getFirst().pesquisarPessoa(banco, cache));
            } else if (resposta == 2) {
                banco.add(banco.getFirst().cadastrarPessoa());
            } else if (resposta == 3) {
                break;
            } else {
                System.out.println("Comando inválido!");
            }
        }

        System.out.println("Array de cache: " + cache);
    }
}
