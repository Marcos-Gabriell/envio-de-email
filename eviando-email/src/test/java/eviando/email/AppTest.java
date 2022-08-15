package eviando.email;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {


	@Test
	public void testeEmail()  throws Exception{
		
		ObjetoEnviaEmail enviaEmail = 
				new ObjetoEnviaEmail("marcosgabriel79355@gmail.com",
						"Marcos gabriel", 
						"Email com java",
						"teste");
		
		enviaEmail.eviarEmail();

	}
}
