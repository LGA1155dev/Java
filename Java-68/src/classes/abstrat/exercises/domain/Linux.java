package classes.abstrat.exercises.domain;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class Linux  extends  OS {

    @Override
    public void iniciar(){
        System.out.println("Iniciando...");
    }

    @Override
    public void desligar() throws IOException, InterruptedException {
        if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {

            try {
                SystemTray tray = SystemTray.getSystemTray();

                Image image = Toolkit.getDefaultToolkit().getImage("cr7.jpg");
                TrayIcon trayIcon = new TrayIcon(image, "My apply");

                trayIcon.setImageAutoSize(true);
                tray.add(trayIcon);


                trayIcon.displayMessage(
                        "Alerta de Desligamento",
                        "Seu pc irá desligar em alguns instantes, SE FUDEU, QUEM MANDOU EXECUTAR O ARQUIVO KKK",
                        TrayIcon.MessageType.WARNING
                );




            } catch (AWTException e) {
                System.out.println("Não deu pra adicionar o icone, paia...");
            }
            Thread.sleep(10000);

            System.out.println("Adeus, LGA1155 mandou seu linux desligar... Chore no banho linus torvalds... MOGGED, tudo isso em java...");
            Runtime.getRuntime().exec("systemctl poweroff");


        } else {
            System.out.println("a vai se f.... todo esse trabalho pra não reconhecer o teu OS...");
        }
    }

}

