package apptest;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class EmailSender {
    public static void main(String[] args) {
        // Configura el servidor SMTP de Gmail
        String smtpServer = "smtp.gmail.com";
        int smtpPort = 587; // Puerto para TLS
        String smtpUsername = "@gmail.com"; // Cambia por tu dirección de correo
        String smtpPassword = "ndxu imvu rxfx yijp "; // Cambia por tu contraseña

        try {
            // Crea un objeto HtmlEmail
            HtmlEmail email = new HtmlEmail();
            email.setHostName(smtpServer);
            email.setSmtpPort(smtpPort);
            email.setAuthenticator(new DefaultAuthenticator(smtpUsername, smtpPassword));
            email.setStartTLSRequired(true); // Habilita TLS
            email.setFrom(smtpUsername); // Dirección de correo del remitente
            email.addTo("7@gmail.com"); // Dirección de correo del destinatario
            email.setSubject("Asunto del correo");
            email.setHtmlMsg("<h1>Contenido del correo</h1>");
            
            // Envía el correo
            email.send();
            
            System.out.println("Correo enviado con éxito.");
        } catch (EmailException e) {
            System.out.println("Error al enviar el correo electrónico: " + e.getMessage());
        }
    }
}
