package PrecoSugerido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valueWithDiscount = 0;

        Produto product1 = new Produto(" ", 0);

        System.out.println("Digite o nome do produto: ");
        product1.setName(sc.nextLine());

        System.out.println("Digite o valor do produto: ");
        product1.setPrice(sc.nextDouble());

        System.out.println("Qual o percentual de desconto para ser aplicado? ");
        valueWithDiscount = product1.aplicarDesconto(sc.nextDouble());

        System.out.println("Nome do produto: " + product1.getName());
        System.out.println("Valor do produto: " + product1.getPrice());
        System.out.println("Valor com desconto: " + valueWithDiscount);
    }
}
