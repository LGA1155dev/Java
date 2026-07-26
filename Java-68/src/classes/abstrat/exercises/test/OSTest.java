package classes.abstrat.exercises.test;

import classes.abstrat.exercises.domain.Linux;
import classes.abstrat.exercises.domain.MacOs;
import classes.abstrat.exercises.domain.Windows;

import java.io.IOException;

public class OSTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Linux linux = new Linux() {
            @Override
            public void deligar() throws IOException {

            }
        };

        Windows windows = new Windows() {
            @Override
            public void desligar() throws IOException {

            }
        };

        MacOs macOs = new MacOs() {
            @Override
            public void deligar() throws IOException {

            }
        };

        linux.desligar();
        windows.deligar();
        macOs.desligar();
    }
}
