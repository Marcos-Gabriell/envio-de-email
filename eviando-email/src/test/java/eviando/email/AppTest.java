package eviando.email;

import java.net.InterfaceAddress;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private String userName ="***************************************************************************************************";
	private String password = "***********************************************************************";

	@Test
	public void testeEmail() {
		try {
			Properties properties = new Properties();
			
			properties.put("mail.smtp.ssl.trust", "*");
			
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.socketFactory.port", "465");
			properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			
			Session session = Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userName, password);
				}
			});

		Address[] toUser = InternetAddress.parse("marcosgabriel79355@gmail.com, mgg334466@gmail.com, maraqueiroz1975@gmail.com, daniellneto@yahoo.com.br");
		
		Message message =  new MimeMessage(session);
		message.setFrom(new InternetAddress(userName));
		message.setRecipients(Message.RecipientType.TO, toUser);
		message.setSubject("Chegou email enviado com java");
		message.setText("Olá, testando");
		
		Transport.send(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
