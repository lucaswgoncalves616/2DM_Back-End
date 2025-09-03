package Abstract;

abstract class Vehicle {
    private Cores color;
    private int weight;
    private int Hp;

    public Cores getColor() {
        return color;
    }

    public void setColor(Cores color) {
        this.color = color;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        this.Hp = hp;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract String startEngine();
}
