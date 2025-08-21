package CalcularTempo;

public class Onibus extends Veiculo{
    private float velocidadeMedia = 60f;
    private float numeroParadas;

    public Onibus (String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        return (distancia / velocidadeMedia) + (0.25f * numeroParadas);
    }

    public float getVelocidadeMedia() {
        return this.velocidadeMedia;
    }
}
