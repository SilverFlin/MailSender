/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 */

package logica.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class UC2 {

    public static void main(String[] args) throws IOException {
//llama a MailConfigWatcher con la direccion del archivo para revisarlo
        MailConfigWatcher run=new MailConfigWatcher("C:/Users/oswal/Downloads/popo.txt");
                       run.ConfigWatcher();
                      
    }
}
