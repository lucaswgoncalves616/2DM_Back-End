package ClasseLivro;

public class Livro {
    private String title;
    private String author;
    private int numOfPages;

    public void setTitulo(String newTitle) {
        this.title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setNumOfPages(int newNumOfPages) {
        this.numOfPages = newNumOfPages;
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
