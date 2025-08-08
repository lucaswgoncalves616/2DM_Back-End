package PersonagensRPG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersonagemRPG hero1;
        hero1 = new PersonagemRPG(" ", " ", 1, 10);

        System.out.println("Digite o nome do seu personagem: ");
        hero1.setName(sc.nextLine());

        System.out.println("Digite a classe do seu personagem: ");
        hero1.setRole(sc.nextLine());

        System.out.println("Digite o nível do seu personagem: ");
        hero1.setLevel(sc.nextInt());

        System.out.println("Digite a quantidade de vida (entre 0 e 100): ");
        hero1.setHealth(sc.nextInt());

        System.out.println("Aqui está um resumo do seu personagem: ");
        System.out.println("Nome: " + hero1.getName() + "\nClasse: " + hero1.getRole() + "\nNível: " + hero1.getLevel() + "\nVida: " + hero1.getHealth());


    }
}
