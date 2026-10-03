package Bpolymorphism.learn.domain;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Scanner;

@AllArgsConstructor
@Data
public abstract class Livro {
    private String name;
    private String author;
    private int totalPages;
}
