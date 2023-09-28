/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 */

package logica.main;

import java.io.IOException;



/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class UC2 {

    public static void main(String[] args) throws IOException{
        MailConfigWatcher watcher=new MailConfigWatcher();
      
    watcher.validate();
        
    }
}
