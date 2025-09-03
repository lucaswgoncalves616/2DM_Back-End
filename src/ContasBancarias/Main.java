package ContasBancarias;

public class Main {
    public static void main(String[] args) {
        Conta conta01 = new ContaPoupanca("123", "Banco X", "Leonardo", 300);
        Conta conta02 = new ContaCorrente("456", "Banco Y", "Leandro", 500);
        Conta conta03 = new PessoaJuridica("789", "Banco W", "Comercio Ltda.", 4000);

        conta03.sacar(300);
        System.out.println(conta03.getSaldo());

    }
}
