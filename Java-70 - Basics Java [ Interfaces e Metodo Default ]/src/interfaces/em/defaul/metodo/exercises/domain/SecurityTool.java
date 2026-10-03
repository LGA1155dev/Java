package interfaces.em.defaul.metodo.exercises.domain;

public interface SecurityTool {
    public abstract String getName();

    public abstract  void execute();

    default  void showBanner(){
        System.out.println("==================== BANNER SCAN ====================");
    }

}
