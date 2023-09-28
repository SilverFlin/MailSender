
package edu.itson.mailsender;

/**
 * Clase que representa una excepcion a la hora de validar un correo
 * @author José Iván Vázquez Brambila
 * @version domingo 24 de septiembre del 2023
 */
public class MailException extends Exception{

    /**
     * Construtor de la excepcion
     * @param mailexception cadena que contiene el mensaje de la exepcion
     */
    public MailException(String mailexception) {
        super(mailexception);
        
    }
    
}
