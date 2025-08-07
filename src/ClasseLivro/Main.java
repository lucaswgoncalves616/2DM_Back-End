package ClasseLivro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro book1 = new Livro(" ", " ", 0);

        System.out.println("Digite o nome do livro: ");
        book1.setTitle(sc.nextLine());

        System.out.println("Qual o autor do livro? ");
        book1.setAuthor(sc.nextLine());

        System.out.println("Quantas páginas tem o livro? ");
        book1.setNumOfPages(sc.nextInt());

        System.out.println("Livro: " + book1.getTitle());
        System.out.println("Autor: " + book1.getAuthor());
        System.out.println("Números de páginas: " + book1.getNumOfPages());

    }
}
