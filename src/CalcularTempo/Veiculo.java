package CalcularTempo;

public class Veiculo {
    private String modelo;
    private float velocidadeMedia;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public float calcularTempo(float distancia) {
        return distancia;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String newModelo) {
        this.modelo = newModelo;
    }

    public float getVelocidadeMedia() {
        return this.velocidadeMedia;
    }

    public void setVelocidadeMedia(float newVelocidadeMedia) {
        this.velocidadeMedia = newVelocidadeMedia;
    }

    public void calcularCem (Veiculo[] veiculos) {

        float tempoBike = 100 / veiculos[0].getVelocidadeMedia();
        float tempoCarro = 100 / veiculos[1].getVelocidadeMedia();
        float tempoOnibus = 100 / veiculos[2].getVelocidadeMedia();
        System.out.println("Em um trajeto de 100KM: ");
        System.out.println("Tempo da bicicleta: " + String.format("%.2f", tempoBike) + " horas");
        System.out.println("Tempo do carro: " + String.format("%.2f", tempoCarro) + " horas");
        System.out.println("Tempo do Onibus: " + String.format("%.2f", tempoOnibus) + " horas");
    }
}
