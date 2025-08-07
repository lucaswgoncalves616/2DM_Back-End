package PrecoSugerido;

import java.util.Scanner;

public class Main {
    public static String formatReal(double value) {
        return "R$ " + String.format("%.2f", value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valueWithDiscount = 0;
        double discount;

        Produto product1 = new Produto(" ", 0);

        System.out.println("Digite o nome do produto: ");
        product1.setName(sc.nextLine());

        System.out.println("Digite o valor do produto: ");
        product1.setPrice(sc.nextDouble());

        System.out.println("Qual o percentual de desconto para ser aplicado? ");
        discount = sc.nextDouble();
        valueWithDiscount = product1.aplicarDesconto(discount);

        System.out.println("Nome do produto: " + product1.getName());
        System.out.println("Valor do produto: " + formatReal(product1.getPrice()));
        System.out.println("Percentual de desconto aplicado: " + discount + "%");
        System.out.println("Valor com desconto: " + formatReal(valueWithDiscount));
    }
}
