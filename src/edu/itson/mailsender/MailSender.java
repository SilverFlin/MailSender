
package edu.itson.mailsender;

/**
 * Esta interfas es para que se implemente y se la ainteraccion pricnicpal
 * @author José Iván Vázquez Brambila
 * @version domingo 24 de septiembre 2023
 */
public interface MailSender {
        /**
         * Metodo para que se implemente la configuracon
         */
        public void configure();
        /**
         * Metodo para que se implemente el envio de mensaje
         * @param message objeto para hacer mensajes
         * @param password cadena de texto que representa el mensaje
         * @return objeto que representa el mensaje
         */
        public MessageSummary send(MessageDTO message, String password);
        /**
         * Metodo para validar el mensaje
         * @param message
         * @return Objeto que representa el resumen del mensaje
         */
        public boolean validate(MessageDTO message);
        
}

