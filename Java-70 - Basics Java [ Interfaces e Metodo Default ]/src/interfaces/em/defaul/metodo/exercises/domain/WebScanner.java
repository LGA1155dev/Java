package interfaces.em.defaul.metodo.exercises.domain;

public class WebScanner implements SecurityTool{
    @Override
    public void execute(){
        System.out.println("Executando o Web Scanner... ");
    }

    @Override
    public void showBanner(){
        System.out.println("========== Web Scanner ==========");
    }

    @Override
    public String getName(){
        return getClass().getSimpleName();
    }
}
