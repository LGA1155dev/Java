package gpt.chat.exercises.domain;

public interface Imprimivel {
     default void imprimir(){
         System.out.println("Name: " + getClass().getSimpleName());
     }
}
