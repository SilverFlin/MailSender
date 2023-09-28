/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.main;

import Excepciones.MailConfigException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ini4j.Wini;

/**
 * implementacion de ConfigFileReader
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class ConfigFileReaderImpl implements ConfigFileReader {

    /**
     * lee el archivo ini de configuracion y extrae los parametros.
     *
     * @param file direccion del archivo ini
     * @return la configuracion del email
     * @throws MailConfigException
     * @throws FileNotFoundException
     * @throws IOException
     */
    @Override
    public Configurations readFile(File file) 
            throws MailConfigException, FileNotFoundException, IOException {
        try {
            Wini ini = new Wini(file);
            String protocols = ini.get(
                    "EmailConfigurations", "protocol");
            String servers = ini.get(
                    "EmailConfigurations", "server");
            String mailAccounts = ini.get(
                    "EmailConfigurations", "mailAccount");

            Configurations config = new Configurations
                                            (servers, protocols, mailAccounts);
            System.out.print("protocol: " + protocols + "\n");
            System.out.print("server: " + servers + "\n");
            System.out.print("mailAccount: " + mailAccounts + "\n");
            return config;
        } catch (MailConfigException ex) {
            Logger.getLogger
        (ConfigFileReader.class.getName()).log
        (Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger
        (ConfigFileReaderImpl.class.getName()).log
        (Level.SEVERE, null, ex);
        }
        return null;
    }
}
