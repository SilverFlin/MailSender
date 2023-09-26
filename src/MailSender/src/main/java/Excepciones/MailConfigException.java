/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class MailConfigException extends RuntimeException{
    /**
* Constructor por omision
*/
public MailConfigException() {
super();
}
/**
* Constructor que establece un mensaje en la excepcion
* @param msj Mensaje para la excepcion
*/
public MailConfigException(String msj) {
super(msj);
}
    
}
