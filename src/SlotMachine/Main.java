package SlotMachine;

import java.util.Scanner;

public class Main {
    public static String formatReal(double balance) {
        return "R$ " + String.format("%.2f", balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] row = {"🦁","🐯","🦊","🐻","🐴"};
        double balance = 100;

        System.out.println("""
                **********************
                Bem vindo ao Java Slot
                Simbolos: 🦁🐯🦊🐻🐴
                **********************
                """);

        System.out.println("Saldo atual: " + formatReal(balance));

        System.out.println("Digite o quanto quer apostar: ");
        balance -= sc.nextDouble();

        System.out.println("Saldo atual: " + formatReal(balance));

        String mensagem = "Olá, isso é uma animação no console!";

        for (char c : mensagem.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(100); // atraso de 100ms entre cada caractere
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(); // pula linha no final
    }
}
