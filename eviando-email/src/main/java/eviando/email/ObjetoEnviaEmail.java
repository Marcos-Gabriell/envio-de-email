package eviando.email;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

public class ObjetoEnviaEmail {

	private String userName = "***********";
	private String password = "******";

	public void eviarEmail() throws Exception {
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

		Address[] toUser = InternetAddress.parse("marcosgabriel79355@gmail.com, mgg334466@gmail.com");

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(userName, "Marcos Gabriel"));
		message.setRecipients(Message.RecipientType.TO, toUser);
		message.setSubject("Chegou email enviado com java");
		message.setText("Olá, testando");

		Transport.send(message);
	}
}
