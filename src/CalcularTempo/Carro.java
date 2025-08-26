package CalcularTempo;

public class Carro extends Veiculo{
    private float velocidadeMedia = 80f;

    public Carro (String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        return distancia / this.velocidadeMedia;
    }

    public float getVelocidadeMedia() {
        return this.velocidadeMedia;
    }


}
