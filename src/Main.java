import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Gestor gestorEventos = new Gestor();
        Scanner sc = new Scanner(System.in);
        Asistente asistenteActual = new Asistente("Lolo", "Pepo", "pepe@gmail.com", "12345", "699838377", null, "12345678Z");

        do {
            System.out.println("\n\n🌟🌟🌟🌟🌟 DELECTARE MULTIEVENTOS 🌟🌟🌟🌟🌟\n<<------------------------------------------>>\n\n   1.  🚀 [Acceder]\n   2.  📝 [Registrarse]\n   3.  🚪 [Finalizar]\n\n<<----------------------------------------\n   Por favor, selecciona una opción: \n---------------------------------------->>\n");
            switch (sc.nextLine()) {
                case "1":
                    asistenteActual = gestorEventos.login();
                    break;
                case "2":
                    asistenteActual = gestorEventos.signin();
                    break;
                case "3":
                    System.out.println("Hemos terminado. ¡Hasta nunca!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("❗ Introduce una opción válida.");
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://youtu.be/6W5AMPjtcns"));
                        } catch (IOException | URISyntaxException e) {
                            e.printStackTrace();
                        }
                    }
            }
        } while(asistenteActual == null);

    }
}
