
package edu.itson.mailsender;

/**
 * Clase que representa un mensaje
 * @author José Iván Vázquez Brambila
 * @version domingo 24 de septiembre 2023
 */
public class MessageDTO {
    public Protocol protocol;
    public MailAccount from;
    public java.util.ArrayList<MailAccount > to;
    public String subject;
    public String content;
}
