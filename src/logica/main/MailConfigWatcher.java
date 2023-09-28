/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 */
package logica.main;

import Excepciones.MailConfigException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * clase para actualizar configuracion y validar archivo de configuracion.
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class MailConfigWatcher implements Subject {

    private Configurations currentConfigurations;
    private FileReader fileReader;

    public MailConfigWatcher() {
        this.currentConfigurations = null;
        this.fileReader = null;
        // this.addObserver(new receptores_1());
        //	this.addObserver(new receptores_2());
        //	tell("Text");
    }

    public Configurations getCurrentConfigurations() {

        return currentConfigurations;
    }

    public void setCurrentConfigurations(Configurations currentConfigurations) {
        this.currentConfigurations = currentConfigurations;
    }

    public FileReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    /**
     * valida la existencia y posibilidad de lectura del archivo de
     * configuracion dentro del sistema.
     *
     * @return verdadero si el archivo en la direccion pasa las pruebas false en
     * caso contrario.
     */
    public boolean validate() throws IOException {
        try {

            //directorio del archivo de configuracion se encuentra en.
            //la carpeta principal del proyecto.
           File file = new File("..\\MailSenderAnt\\configurations.ini");
            boolean resultado;

            resultado = file.exists();

            if (resultado != file.canRead()) {
                resultado = file.canRead();
            }

            resultado = file.isFile();
            if (resultado == true) {
                readFileConfigs();
            }
            return resultado;
        } catch (MailConfigException e) {
            JOptionPane.showMessageDialog(null,
                    "direccion invalida.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * lee el archivo de configuracion y extrae los parametros necesarios
     * para enviar el correo.
     *
     * @throws MailConfigException
     * @throws IOException
     */
    public void readFileConfigs() throws MailConfigException, IOException {
        try {

            File file = new File
        ("..\\MailSenderAnt\\configurations.ini");
            ConfigFileReaderImpl reader = new ConfigFileReaderImpl();
            //llamada al metodo de lectura en ConfigFileReaderImpl.
            this.currentConfigurations = reader.readFile(file);
            //watcher detector de cambios en el archivo de config.
            try {
                Path dir = Paths.get("..\\MailSenderAnt\\");
                WatchService watchService = 
                        FileSystems.getDefault().newWatchService();

                dir.register(watchService,
                        StandardWatchEventKinds.ENTRY_CREATE,
                        StandardWatchEventKinds.ENTRY_DELETE,
                        StandardWatchEventKinds.ENTRY_MODIFY);

                WatchKey key;
                while ((key = watchService.take()) != null) {
                    for (WatchEvent<?> event : key.pollEvents()) {
                        System.out.println(
                                "Event kind:" + event.kind()
                                + ". File affected: " + event.context() + ".");
                    }
                    key.reset();

                }
            } catch (IOException ex) {
                Logger.getLogger(MailConfigWatcher.class.getName()).log
        (Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(MailConfigWatcher.class.getName()).log
        (Level.SEVERE, null, ex);
            }
            //despues de lectura se notifica al observer
            notifyObservers();

        } catch (MailConfigException ex) {
            Logger.getLogger(ConfigFileReader.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConfigFileReaderImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {
    }

    @Override
    public void notifyObservers() {

    }

}
