
package edu.itson.mailsender;

/**
 * Clase que representa la estrategia del mensaje
 * @author José Iván Vázquez Brambila
 * @version domingo 24 de septiembre 2023
 */
public interface SendMailStrategy {
    //Obejto que representa el resumen del mensaje
    public MessageSummary send(Message menssage,String password);
}
