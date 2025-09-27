package ContasBancarias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int response = 0;

        Conta conta01 = new ContaPoupanca("123", "Banco X", "Leonardo", 300);
        Conta conta02 = new ContaCorrente("456", "Banco Y", "Leonardo", 500);
        Conta conta03 = new PessoaJuridica("789", "Banco W", "Comercio Ltda.", 4000);

        while (true) {
            System.out.println("""
                    1. Conta Poupança
                    2. Conta Corrente
                    3. Conta Pessoa Juridica
                    4. Sair
                    
                    Digite a conta que deseja manipular:
                    """);
            response = sc.nextInt();
            sc.nextLine();

            if (response <= 0 || response > 4) {
                System.out.println("Opção inválida, digite novamente...");
                break;
            } else if (response == 1) {
                System.out.println(conta01);
                conta01.escolherOperacao(conta01);
            } else if (response == 2) {
                System.out.println(conta02);
                conta02.escolherOperacao(conta02);
            } else if (response == 3) {
                System.out.println(conta03);
                conta03.escolherOperacao(conta03);
            } else {
                break;
            }
        }

    }
}
