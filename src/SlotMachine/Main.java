package SlotMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String lion = "🦁";
        String tiger = "🐯";
        String fox = "🦊";
        String bear = "🐻";
        String horse = "🐴";

        int balance = 100;

        System.out.println("""
                **********************
                Bem vindo ao Java Slot
                Simbolos: 🦁🐯🦊🐻🐴
                **********************
                """);

        System.out.println("Saldo atual: " + balance);

        System.out.println("Digite o quanto quer apostar: ");
        balance = sc.nextInt();


    }
}
