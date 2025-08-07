package PrecoSugerido;

import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);

    private String name;
    private double price;

    public Produto (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double aplicarDesconto(double percentual) {
        return this.price - (percentual * this.price / 100);
    }

    public void setPrice(double newPrice) {
        while(newPrice < 0) {
            System.out.println("Valor inválido, o valor deve ser um número positivo");
            newPrice = sc.nextDouble();
        }
        this.price = newPrice;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
