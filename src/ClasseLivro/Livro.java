package ClasseLivro;

import java.util.Scanner;

public class Livro {
    Scanner sc = new Scanner(System.in);

    private String title;
    private String author;
    private int numOfPages;

    public Livro (String title, String author, int numOfPages) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
    }

    public void setTitulo(String newTitle) {
        this.title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setNumOfPages(int newNumOfPages) {
        do {
            if (newNumOfPages < 5) {
                System.out.println("Valor Inválido! Número de páginas deve ser maior que 5");
                sc.nextInt();
            } else {
                this.numOfPages = newNumOfPages;
                break;
            }
        } while(numOfPages < 5);
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getNumOfPages() {
        return this.numOfPages;
    }

}
