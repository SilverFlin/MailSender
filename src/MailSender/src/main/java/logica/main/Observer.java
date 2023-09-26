/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.main;

import Excepciones.MailConfigException;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class Observer {
/**
 * notifica al observador de cualquier cambio
 * @param direccion 
 */
    public void notifyObservers(String direccion) {
        update(direccion);
    }
/**
 * detecta cambios en la direccion del archivo utilizado
 * @param direccion del archivo de configuracion
 */
    public void update(String direccion) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            public void run() {
                // do your work 

                try {
                    boolean resultado;
                    File arch = new File(direccion);

                    resultado = arch.exists();

                    if (resultado != arch.canRead()) {
                        resultado = arch.canRead();
                    }
                   
                    resultado = arch.isFile();
                    if(resultado==true){
                        System.out.println("funcionando, resultado: ");
                        System.out.println(resultado);
                    }
                  
                    if (resultado == false) {
                        JOptionPane.showMessageDialog(null, "ERROR! la direccion o el archivo se han comprometido.", "Error de archivo", JOptionPane.WARNING_MESSAGE);
                        timer.cancel();

                    }
                } catch (MailConfigException e) {
                    JOptionPane.showMessageDialog(null, "direccion invalida.", "Error", JOptionPane.ERROR_MESSAGE);

                }

            }
        }, 0, 60 * 1000);
    }
}
