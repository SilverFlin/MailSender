
package edu.itson.mailsender;

/**
 * Clase que implementa MailSender para efecturar mensaje
 * @author José Iván Vázquez Brambila
 * @version domingo 24 de septiembre 2023
 */
public class MailSenderImpl implements MailSender,  SendMailStrategy{
    
    //Objeto que representa un mensaje
    private SendMailStrategy sendMailStrategy;
    //Objeto que representa la configuracion del mensaje
    private MailConfiguration configuration;

    /**
     * establece la confirugracion de los mensajes
     */
    @Override
    public void configure() {
        
    }

    /**
     * Envia el mensaje 
     * @param message Objeto que representa todo un correo con su infromacion
     * @param password contraseña para enviar
     * @return Objeto que representa el resumen de un mensaje
     */
    @Override
    public MessageSummary send(MessageDTO message, String password) {
        validate(message);
        

        return new MessageSummary();
    }

    /**
     * Metodo que valida el mensage
     * @return true si el mensage se aprueba
     */
    @Override
    public boolean validate(MessageDTO message) {
        if(message==null)new MailException("Mensage invalido");
        return true;
    }

    @Override
    public MessageSummary send(Message menssage, String password) {
        return new MessageSummary();
    }
}
