/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.main;



/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public interface Observer {

   

/**
 * detecta cambios en la direccion del archivo utilizado
    
 */
     public void update();
    /*
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
                        JOptionPane.showMessageDialog(null, 
     "ERROR! la direccion o el archivo se han comprometido.",
     "Error de archivo", JOptionPane.WARNING_MESSAGE);
                        timer.cancel();

                    }
                } catch (MailConfigException e) {
                    JOptionPane.showMessageDialog(null, 
     "direccion invalida.", "Error", JOptionPane.ERROR_MESSAGE);

                }

            }
        }, 0, 60 * 1000)
*/
    
}
