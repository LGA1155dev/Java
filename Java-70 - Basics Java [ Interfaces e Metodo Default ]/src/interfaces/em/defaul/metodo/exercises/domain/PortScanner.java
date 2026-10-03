package interfaces.em.defaul.metodo.exercises.domain;

public class PortScanner implements SecurityTool{
    @Override
    public void execute(){
        System.out.println("Executando port scanner.... ");
    }

    @Override
    public void showBanner(){
        System.out.println("========== Port Scanner ==========");
    }

    @Override
    public String getName(){
        return getClass().getSimpleName();
    }
}
