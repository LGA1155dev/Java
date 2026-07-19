package classes.abstrat.exercises.domain;
import java.io.IOException;
import java.awt.*;
import java.awt.TrayIcon.MessageType;

public abstract  class OS {
    public String os = System.getProperty("os.name").toLowerCase();

    public static void main(String[] args) {
        if (!SystemTray.isSupported()) {
            System.out.println("Não suportado as notificações, que paia...");
            return;
        }


        try {
            SystemTray tray = SystemTray.getSystemTray();

            Image image = Toolkit.getDefaultToolkit().createImage(new byte[0]);
            TrayIcon trayIcon = new TrayIcon(image, "My apply");

            trayIcon.setImageAutoSize(true);
            tray.add(trayIcon);


            trayIcon.displayMessage(
                    "Hello, você se fudeu... -999 aura",
                    "Seu pc irá desligar... ",
                    MessageType.WARNING
            );




        } catch (AWTException e) {
            System.out.println("Não deu pra adicionar o icone, paia...");
        }


    }

        public void iniciar () {
            System.out.println("OS iniciando ...");
        }

        public void nomeOS () {
            System.out.println(System.getProperty("os.name"));
        }

        public abstract void desligar () throws IOException, InterruptedException;


    public abstract void deligar() throws IOException;
}
