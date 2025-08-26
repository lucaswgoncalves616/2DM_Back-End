package OOPtest;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isStudent = false;

        Database database = new Database();

        System.out.println("Vamos adicionar usuários:");

        System.out.println("Digite o nome do usuário: ");
        String name = sc.nextLine();

        System.out.println("Digite a idade do usuário: ");
        int age = sc.nextInt();

        System.out.println("É um estudante? ");
        sc.nextLine();
        String isStudentResponse = sc.nextLine();
        if (isStudentResponse.equalsIgnoreCase("sim") || isStudentResponse.equalsIgnoreCase("s")) {
            isStudent = true;
        }

        User newUser = new User(name, age, isStudent);

        database.registerUser(newUser);

        String response;
        System.out.println("Deseja adicionar mais alunos? ");
        response = sc.nextLine();

        while(response.equalsIgnoreCase("sim")) {
            System.out.println("Digite o nome do usuário: ");
            name = sc.nextLine();

            System.out.println("Digite a idade do usuário: ");
            age = sc.nextInt();

            System.out.println("É um estudante? ");
            sc.nextLine();
            isStudentResponse = sc.nextLine();
            if (isStudentResponse.equalsIgnoreCase("sim") || isStudentResponse.equalsIgnoreCase("s")) {
                isStudent = true;
            }
            newUser = new User(name, age, isStudent);
            database.registerUser(newUser);
            System.out.println("Deseja adicionar mais alunos? ");
            response = sc.nextLine();
        }

        database.showInfo();

    }
}
