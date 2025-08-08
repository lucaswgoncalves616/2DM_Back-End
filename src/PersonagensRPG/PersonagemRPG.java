package PersonagensRPG;

import java.util.Scanner;

public class PersonagemRPG {
    Scanner sc = new Scanner(System.in);

    private String name;
    private String role;
    private int level;
    private int health;

    public PersonagemRPG(String name, String role, int level, int health) {
        this.name = name;
        this.role = role;
        this.level = level;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHealth() {
        return this.health;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setRole(String newRole) {
        this.role = newRole;
    }

    public void setLevel(int newLevel) {
        while (newLevel < 1) {
            System.out.println("Nivel do personagem deve ser maior do que 1.");
            newLevel = sc.nextInt();
        }
        this.level = newLevel;
    }

    public void setHealth(int newHealth) {
        while (newHealth < 1 || newHealth > 100 ) {
            System.out.println("O valor da vida deve ficar entre 0 e 100.");
            newHealth = sc.nextInt();
        }
        this.health = newHealth;
    }
}
