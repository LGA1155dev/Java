package classes.abstrat.exercises.domain;
import java.io.IOException;
import java.awt.*;

public abstract class Windows extends OS{

    public String os = System.getProperty("os.name").toLowerCase();

    @Override
    public void iniciar(){
        System.out.println("Iniciando");
    }

    @Override
    public void deligar () throws IOException {
        if(os.contains("win")){


            try {
                SystemTray tray = SystemTray.getSystemTray();

                Image image = Toolkit.getDefaultToolkit().getImage("cr7.jpg");
                TrayIcon trayIcon = new TrayIcon(image, "My apply");

                trayIcon.setImageAutoSize(true);
                tray.add(trayIcon);


                trayIcon.displayMessage(
                        "Alerta de desligamento.. ",
                        "Seu pc irá desligar em alguns instantes... ",
                        TrayIcon.MessageType.WARNING
                );




            } catch (AWTException e) {
                System.out.println("Não deu pra adicionar o icone, paia...");
            }

            System.out.println("Desligando ... Chore... LGA1155  passou por aqui....");
            Runtime.getRuntime().exec("shutdown -s -t 0");
        } else{
            System.out.println("O miseravel é um miseravel...");
        }

    }
}
