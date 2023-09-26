/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.main;

import Excepciones.MailConfigException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class ConfigFileReader {
    private String correo,protocolo,servidor, proveedor;
    
    
    
    /**
     * lee el contenido del archivo de configuracion para el correo y regresa los elementos necesarios para configurar
     * @param direccion del archivo de configuracion
     * @return configuracion para enviar el correo
     * @throws MailConfigException
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public String readFileConfigs(String direccion) throws MailConfigException, FileNotFoundException, IOException{
          try {
      BufferedReader reader = new BufferedReader(new FileReader (direccion));
        
    String         line = null;
    StringBuilder  configurations = new StringBuilder();
    String         ls = System.getProperty("line.separator");

  
        while((line = reader.readLine()) != null) {
            configurations.append(line);
            configurations.append(ls);
        }
            
        return configurations.toString();
  
    }
     catch (MailConfigException ex) {
            Logger.getLogger(ConfigFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

