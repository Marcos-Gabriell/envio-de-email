package eviando.email;

import java.util.Properties;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@org.junit.Test
	public void testEmail() {
		
		
		 Properties properties = new Properties();
		 properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.socketFactory.port", "465");
			properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	}
}
