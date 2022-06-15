package cadastro;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dsl.DSL;
import pages.CadastroPage;
import pages.LoginPage;
import until.DriverFactory;

public class LoginTeste {

	private LoginPage page;
	DriverFactory facDriver;

	@Before
	public void iniciliza() {
		DriverFactory.getDriver();
		page = new LoginPage(DriverFactory.getDriver());
	}

	@After
	public void finaliaza() {
		DriverFactory.killDriver();
	}

	public void waitPage(int tempo) {
		facDriver.getDriver().manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
	}

	@Test
	public void Login() {
		waitPage(2000);
		//dsl.clicaByid("menuUser");
		page.clicaBotaoUser();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		page.setUserName("Raaul92");
		Assert.assertEquals("Raaul92", page.ObterUserNome());
		
		page.setSenha("b1107C@rol");
		Assert.assertEquals("b1107C@rol", page.ObterSenha());
		
		page.clicaBotaoLogin();
	}
	
}
