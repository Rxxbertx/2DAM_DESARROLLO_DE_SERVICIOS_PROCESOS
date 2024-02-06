package mailJava;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailSender {
    public static void main(String[] args) {
        // Configura las propiedades
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Credenciales de tu cuenta de Gmail
        final String username = "pruebajavaroberto@gmail.com";
        final String password = "PruebaJavaRoberto2**3";

        // Crea una sesión de correo electrónico
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Crea un mensaje de correo electrónico
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("pruebajavaroberto@gmail.com")); // Dirección de correo electrónico del remitente
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("robertotiron7@gmail.com")); // Dirección de correo electrónico del destinatario
            message.setSubject("Asunto del correo"); // Asunto del correo
            message.setText("Contenido del correo"); // Contenido del correo

            // Envía el mensaje
            Transport.send(message);

            System.out.println("Correo electrónico enviado con éxito.");
        } catch (MessagingException e) {
            System.out.println("Error al enviar el correo electrónico: " + e.getMessage());
        }
    }
}
