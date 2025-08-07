package ValidarIdade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa(" ", 0);

        System.out.println("Digite um nome para a pessoa" + pessoa1.getName());
        pessoa1.setName(sc.nextLine());

        System.out.println("Digite uma nova idade para a pessoa: ");
        pessoa1.setAge(sc.nextInt());

        System.out.println("Nome da pessoa: " + pessoa1.getName());
        System.out.println("Idade da pessoa: " + pessoa1.getAge());
    }
}
