package ContasBancarias;

public class PessoaJuridica extends Conta{
    public PessoaJuridica(String numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public void sacar(double saque) {
        super.sacar(saque + 1.50);
    }

    @Override
    double calcularTarifaMensal() {
        return 20;
    }
}
