package classes.abstrat.exercises.domain;

import java.awt.*;
import java.io.IOException;

public abstract class MacOs extends OS{
    @Override
    public void iniciar(){
        System.out.println("Iniciando... ");
    }

    @Override
    public void desligar() throws IOException {
        if (os.contains("mac")) {

            try {
                SystemTray tray = SystemTray.getSystemTray();

                Image image = Toolkit.getDefaultToolkit().getImage(
                        "cr7.jpg"
                );

                TrayIcon trayIcon = new TrayIcon(image, "My apply");

                trayIcon.setImageAutoSize(true);
                tray.add(trayIcon);


                trayIcon.displayMessage(
                        "Hello, você se fudeu... -999 aura",
                        "Seu pc irá desligar... ",
                        TrayIcon.MessageType.WARNING
                );




            } catch (AWTException e) {
                System.out.println("Não deu pra adicionar o icone, paia...");
            }

            System.out.println("Tá usando mac? Se tu não for bom na programação principalmente em flutter ou swift vc só quer se achar mesmo...");
            Runtime.getRuntime().exec("shutdown -h now");
        } else{
            System.out.println("Miseravel");
        }
    }
}
