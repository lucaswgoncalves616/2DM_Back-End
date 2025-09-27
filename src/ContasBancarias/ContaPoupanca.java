package ContasBancarias;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    double calcularTarifaMensal() {
        return 0;
    }
}
