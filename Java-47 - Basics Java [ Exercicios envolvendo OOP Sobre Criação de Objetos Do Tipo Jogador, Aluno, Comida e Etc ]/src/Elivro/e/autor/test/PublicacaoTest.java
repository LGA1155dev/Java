package Elivro.e.autor.test;

import Elivro.e.autor.domain.Autor;
import Elivro.e.autor.domain.Livro;
import Elivro.e.autor.domain.Publicacao;

public class PublicacaoTest {
    public static void main(String[] args) {
        Autor autor = new Autor("Nietchze", 46);
        Livro livro = new Livro("Assim Falou zaratrusta", 150);
        Publicacao publicacao = new Publicacao(autor, livro);
        publicacao.imprimir();
    }
}
