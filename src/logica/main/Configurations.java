/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.main;



/**
 * objeto de configuraciones.
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class Configurations {
    private String servers;
            private String protocols;
            private String mailAccounts;

    public Configurations
        (String servers,String protocols, String mailAccounts) {
        this.servers = servers;
        this.protocols = protocols;
        this.mailAccounts = mailAccounts;
    }

    public String getServers() {
        return servers;
    }

    public void setServers(String servers) {
        this.servers = servers;
    }

    public String getProtocols() {
        return protocols;
    }

    public void setProtocols(String protocols) {
        this.protocols = protocols;
    }

    public String getMailAccounts() {
        return mailAccounts;
    }

    public void setMailAccounts(String mailAccounts) {
        this.mailAccounts = mailAccounts;
    }

}
