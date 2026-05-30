package Elivro.e.autor.domain;

public class Livro {
    private String name;
    private int[] pages;


    public Livro(String name, int... pages) {
        this.name = name;
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int[] getPages() {
        return pages;
    }

    public void setPages(int[] pages) {
        this.pages = pages;
    }
}
