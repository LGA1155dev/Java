package Elivro.e.autor.domain;
import Elivro.e.autor.domain.Autor;
import Elivro.e.autor.domain.Livro;

import java.time.LocalDateTime;
import java.util.Date;

public class Publicacao {
    private Autor autor;
    private Livro livro;
    private Date data = new Date();


    public Publicacao(Autor autor, Livro livro) {
        this.autor = autor;
        this.livro = livro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void imprimir(){
        System.out.println("-=-==-=-=- Publicação -=-==-=-=-");

        System.out.println(" ");
        System.out.println("Autor: " + autor.getName());
        System.out.println("Livro: " + livro.getName());

        if (this.data.getHours() >= 6 && this.data.getHours() <= 11)
            System.out.println("Postado dia: " + this.data.getDate() + " ás " + this.data.getHours() + " horas da manhã");

        else if (this.data.getHours() >= 12 && this.data.getHours() <= 18)
            System.out.println("Postado dia: " + this.data.getDate() + " ás " + this.data.getHours() + " horas da tarde");

        else if (this.data.getHours() >= 19 && this.data.getHours() <= 23)
            System.out.println("Postado dia: " + this.data.getDate() + " ás " + this.data.getHours() + " horas da noite");

        System.out.println(" ");

        System.out.println("-=-==-=-=-                        -==-=-=-");
    }
}
