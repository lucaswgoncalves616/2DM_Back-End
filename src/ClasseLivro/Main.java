package ClasseLivro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro1 = new Livro(" ", " ", 0);

        System.out.println("Digite o nome do livro: ");
        livro1.setTitulo(sc.nextLine());

        System.out.println("Qual o autor do livro? ");
        livro1.setAuthor(sc.nextLine());

        System.out.println("Quantas páginas tem o livro? ");
        livro1.setNumOfPages(sc.nextInt());

        System.out.println("Livro: " + livro1.getTitle());
        System.out.println("Autor: " + livro1.getAuthor());
        System.out.println("Números de páginas: " + livro1.getNumOfPages());

    }
}
