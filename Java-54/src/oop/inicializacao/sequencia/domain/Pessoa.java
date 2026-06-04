package oop.inicializacao.sequencia.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected String endereco;
    static{
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco  de inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco  de inicialização de pessoa 2");
    }

    public Pessoa (String name){
        System.out.println("Dentro do construtor pessoa");
        this.name = name;
    }



    public Pessoa(String name, String cpf, String endereco) {
        this.name = name;
        this.cpf = cpf;
        this.endereco = endereco;
        System.out.println("Dentro do construtor de pessoa!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco(String local) {
        return this.endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.endereco);
    }
}
