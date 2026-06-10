package oop.exercises.exercise03.test;
import oop.exercises.exercise03.domain.Usuario;

public class UsuarioTest {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("gabriel", "gabriel");
        usuario.login(usuario.getUsername(),  usuario.getPassword());
        usuario.imprimir();
    }
}
