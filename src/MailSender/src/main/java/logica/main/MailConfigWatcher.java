/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.main;

import Excepciones.MailConfigException;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * clase para validar
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class MailConfigWatcher {

    private String direccion;
/**
 * constructor de la clase
 * @param direccion del archivo a vigilar
 */
    public MailConfigWatcher(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * valida la existencia y posibilidad de lectura del archivo de configuracion dentro del sistema
     *
     * @return verdadero si el archivo en la direccion pasa las pruebas
     */
    private boolean validate() {

        try {
            boolean resultado;
            File arch = new File(this.direccion);

            resultado= arch.exists();
            
            if(resultado!=arch.canRead()){
            resultado=arch.canRead();
            }
           
            resultado=arch.isFile();
          
            return resultado;
        } catch (MailConfigException e) {
            JOptionPane.showMessageDialog(null, "direccion invalida.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
/**
 * llama a validate para validar archivo, una vez validado puede traspasar la tarea a observer.
 * @throws MailConfigException
 * @throws IOException 
 */
    public void ConfigWatcher() throws MailConfigException, IOException {
        try {
            if (validate()) {
                ConfigFileReader lector=new ConfigFileReader();
               lector.readFileConfigs(this.direccion);
                
                Observer observador=new Observer();
                observador.notifyObservers(this.direccion);
            } else {

            }

        } catch (MailConfigException e) {
            JOptionPane.showMessageDialog(null, "direccion invalida.", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
    }
}
