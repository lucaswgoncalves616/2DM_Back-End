package ContasBancarias;

import java.util.Scanner;

abstract class Conta {
    Scanner sc = new Scanner(System.in);

    private String numero;
    private String agencia;
    private String titular;
    private double saldo;

    public Conta(String numero, String agencia, String titular, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return "Agência: " + this.agencia +
                "\nNumero: " + this.numero +
                "\nTitular: " + this.titular +
                "\nSaldo: " + this.saldo;
    }

    public void escolherOperacao(Conta conta) {
        int response = 0;
        while (true) {
            System.out.println("""
                    1. Saque
                    2. Depósito
                    3. Mostrar saldo
                    4. Sair
                    
                    Escolha a operação que deseja realizar:
                    """);
            response = sc.nextInt();
            sc.nextLine();

            if (response <= 0 || response > 4) {
                System.out.println("Opção inválida, tente novamente...");
            } else if (response == 1) {
                System.out.println("Digite o valor que deseja sacar: ");
                conta.sacar(sc.nextDouble());
            } else if (response == 2) {
                System.out.println("Digite o valor que deseja depositar: ");
                conta.depositar(sc.nextDouble());
            } else if (response == 3) {
                System.out.println(conta.exibirSaldo());
            } else {
                break;
            }
        }
    }
    
    public String formatarReal(double valor) {
        return "R$ " + String.format("%.2f", valor);
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void sacar(double saque) {
        saldo -= saque;
    }

    public String exibirSaldo() {
        return formatarReal(saldo);
    }

    abstract double calcularTarifaMensal();
}
