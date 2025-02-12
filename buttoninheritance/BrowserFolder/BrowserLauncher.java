package buttoninheritance.BrowserFolder;
import java.awt.Desktop;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BrowserLauncher {
        public static void openBrowser(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException ex) {
                showErrorDialog("Error opening URL: " + ex.getMessage());
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