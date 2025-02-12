package buttoninheritance.BrowserFolder;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BrowserLauncher {
        private void openBrowser(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace(System.out);
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }


    private static void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(
            null,        
            message,    
            "An Error Occurred",      
            JOptionPane.ERROR_MESSAGE  
        );
    }
}