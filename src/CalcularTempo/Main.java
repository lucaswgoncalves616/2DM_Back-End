package CalcularTempo;

public class Main {
    public static void main(String[] args) {
        Bicicleta caloi1 = new Bicicleta("caloi");
        Carro golf = new Carro("Golf");
        Onibus mercedes = new Onibus("mercedes");
        Veiculo veiculo = new Veiculo("Padrão");

        Veiculo[] veiculos = {caloi1, golf, mercedes};

        veiculo.calcularCem(veiculos);
    }
}
