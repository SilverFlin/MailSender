/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.main;

import Excepciones.MailConfigException;
import java.io.File;
import org.ini4j.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public interface ConfigFileReader {

    

 
    public Configurations readFile(File file ) throws 
            MailConfigException, FileNotFoundException,IOException ;
       

}
