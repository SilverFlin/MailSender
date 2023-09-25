
package edu.itson.mailsender;

/**
 *
 * @author José Iván Vázquez Brambila
 */
public class UC1 {
    public static void main(String[] args) {
        
        var msi = new MailSenderImpl();
        var mDTO = new MessageDTO();
        var ma = new MailAccount();
        var ms= new MailServer();
        var p1 = new Protocol();
        p1.type="SMTP";
        var p2 = new Protocol();
        p2.type="POP3";
        var p3 = new Protocol();
        p3.type="IMAP";
        ms.name="gmail";
        ms.List.add(p1);
        ms.List.add(p2);
        ms.List.add(p3);
        ma.email="darksamus0997@hotmail.com";
        ma.provider=ms;
        mDTO.content="este es un mensaje de prueba";
        mDTO.from=ma;
        mDTO.protocol = p1;
        mDTO.subject="Vero";
        var tempMA = new MailAccount();
        tempMA.email="veronica.sierra@potros.itson.edu.mx";
        tempMA.provider=ms;
        mDTO.to.add(tempMA);
        
        //Caso de uso 1 Enviar correo
        var messum = msi.send(mDTO, "lafje082j");
        messum.statusCode=1;
    }
}
