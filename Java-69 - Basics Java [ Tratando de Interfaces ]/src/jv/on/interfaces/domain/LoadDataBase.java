package jv.on.interfaces.domain;

public class LoadDataBase implements DataLoad {
    @Override
    public void load(){
        System.out.println("carregando banco de dados... ");
    }
}
