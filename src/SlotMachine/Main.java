package SlotMachine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String formatReal(double balance) {
        return "R$ " + String.format("%.2f", balance);
    }

    public static double makeBet(double balance){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o quanto quer apostar: ");
        double bet = sc.nextDouble();

        while(true){
            if (bet > balance) {
                System.out.println("Valor da aposta deve ser menor que o saldo!");
                bet = sc.nextDouble();
            } else if (bet < 0) {
                System.out.println("Valor da aposta não pode ser negativo!");
                bet = sc.nextDouble();
            } else {
                break;
            }
        }
        return bet;
    }

    public static String[] slotSpin(String[] row) {
        Random rand = new Random();
        int newRand = 0;
        String[] spinedRow = new String[3];

        for (int i = 0; i < spinedRow.length; i++) {
            newRand = rand.nextInt(0,5);
            spinedRow[i] = row[newRand];
        }

        return spinedRow;
    }

    public static double calculatePrize(double bet, String[] spinedRow){
        if (spinedRow[0].equals(spinedRow[1]) && spinedRow[0].equals(spinedRow[2])) {
            return bet * 5;
        } else if (spinedRow[0].equals(spinedRow[1]) || spinedRow[0].equals(spinedRow[2]) || spinedRow[1].equals(spinedRow[2])) {
            return bet * 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] row = {"🦁","🐯","🦊","🐻","🐴","🦄"};
        double balance = 100;

        System.out.println("""
                **********************
                Bem vindo ao Java Slot
                Simbolos: 🦁🐯🦊🐻🐴🦄
                **********************
                """);

        System.out.println("Saldo atual: " + formatReal(balance));
        double bet = makeBet(balance);

        balance -= bet;
        String[] spinedRow = slotSpin(row);
        System.out.println(Arrays.toString(spinedRow));
        balance += calculatePrize(bet, spinedRow);



        System.out.println("Saldo atual: " + formatReal(balance));
/*
        String mensagem = "Olá, isso é uma animação no console!";

        for (char c : mensagem.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(100); // atraso de 100ms entre cada caractere
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(); // pula linha no final*/
    }
}
