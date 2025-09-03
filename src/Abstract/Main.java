package Abstract;

public class Main {
    public static void main(String[] args) {
        Vehicle ford = new Car();
        Vehicle honda = new Bike();

        ford.setColor(Cores.AZUL);

        for (Cores cor : Cores.values()) {
            System.out.println(cor + " " +  cor.getI());
        }
    }
}
