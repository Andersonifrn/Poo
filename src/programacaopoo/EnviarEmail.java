/* Essa classe vai fazer a realização de envior de email
 */
package programacaopoo;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author ander
 */
public class EnviarEmail {
    public static void main(String[] args) {
        
        // Email para realizar o envior
        String Meuemail2="Anderson21fonseca@gmail.com";
        // senha
        String senha="21201411Abc";
        
        SimpleEmail  email  = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(Meuemail2, senha));
        email.setSSLOnConnect(true);
        
        try {
            // Informando o email 
            email.setFrom(Meuemail2);
            // O assunto que vai se enviado
            email.setSubject("Testando o envior de email:");
            // A mensagem que vai se enviada
            email.setMsg("Olá mundo enviando uma mensagem");
            // destinatário da email para quem vai se recebido 
            email.addTo(Meuemail2);
            email.send();
            System.out.println("Mensagem enviada com sucesso!");
        } catch (Exception e) {
       //    e.printStackTrace();
            System.out.println(" ERROR "+e.getMessage());
        }
        
    }
}
