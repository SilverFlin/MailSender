
package edu.itson.mailsender;

/**
 * Clase que representa un mensaje
 * @author José Iván Vázquez Brambila
 * @version domingo 24 de septiembre 2023
 */
public class Message {
    //Objeto que representa un prtocolo
    public Protocol protocol;
    //Objeto que representa una direccion de corre
    public MailAccount from;
    //Lista de objetos de direccion de correo
    public java.util.ArrayList<MailAccount > to;
    //Cadena que representa el sujeto
    public String subject;
    //Cadena que representa contenido
    public String content;
}
