package ContasBancarias;

abstract class Conta {
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

    abstract void calcularTarifaMensal();
}
