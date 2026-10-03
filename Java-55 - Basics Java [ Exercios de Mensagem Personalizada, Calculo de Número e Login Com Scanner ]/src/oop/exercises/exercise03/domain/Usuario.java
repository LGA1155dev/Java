package oop.exercises.exercise03.domain;

import jdk.jshell.JShell;

import java.util.Scanner;

public class Usuario {
    private String username;
    private String password;
    private String userLogado;
    private String passLogado;
    private boolean logado;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String username, String password){
        if (username != " " || password != " "){
            logado = true;
            this.userLogado = username;
            this.passLogado = password;
        }else{
            logado = false;
            throw  new RuntimeException("Username ou senha precisam ser preenchidos! ");
        }

        if (!logado){
            this.username = "Guest";
            this.password = "senhaGuest";
            this.userLogado = null;
            this.passLogado = null;
        } else if (logado){
            System.out.println("Hello " + userLogado + " all good? ");

            while (logado) {
                System.out.print(" > ");
                Scanner input = new Scanner(System.in);
                String comands = input.nextLine();


            }
        }
    }

    public String getUserLogado() {
        return userLogado;
    }

    public void setUserLogado(String userLogado) {
        this.userLogado = userLogado;
    }

    public String getPassLogado() {
        return passLogado;
    }

    public void setPassLogado(String passLogado) {
        this.passLogado = passLogado;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public void imprimir(){
        System.out.println(  userLogado + "  \n"  +  passLogado + "\n" + username + "\n" + password);
    }
}
