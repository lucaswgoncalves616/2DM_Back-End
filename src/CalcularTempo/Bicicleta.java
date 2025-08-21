package CalcularTempo;

public class Bicicleta extends Veiculo{
    private float velocidadeMedia = 20f;

    public Bicicleta (String modelo) {
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
