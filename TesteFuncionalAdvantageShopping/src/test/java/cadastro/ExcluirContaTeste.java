package cadastro;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dsl.DSL;
import pages.ExcluirContaPage;
import pages.LoginPage;
import until.DriverFactory;

public class ExcluirContaTeste {
	
	private DSL dsl;
	private LoginPage loginPage;
	private ExcluirContaPage excluirPage;
	DriverFactory facDriver;

	@Before
	public void iniciliza() {
		DriverFactory.getDriver();
		dsl = new DSL(DriverFactory.getDriver());
		loginPage = new LoginPage(DriverFactory.getDriver());
		excluirPage = new ExcluirContaPage(DriverFactory.getDriver());
	}

	@After
	public void finaliaza() {
		DriverFactory.killDriver();
	}

	public void waitPage(int tempo) {
		facDriver.getDriver().manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
	}

	@Test
	public void DeleteAccount() {
		waitPage(2000);
		dsl.clicaByid("menuUser");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		loginPage.setUserName("Raaul92");
		Assert.assertEquals("Raaul92", loginPage.ObterUserNome());
		
		loginPage.setSenha("b1107C@rol");
		Assert.assertEquals("b1107C@rol", loginPage.ObterSenha());
		
		loginPage.clicaBotaoLogin();

		excluirPage.clicaBotaoUsuario();;
		excluirPage.clicaBotaoMyAccount();
		excluirPage.clicaBotaoDeleteAccount();
		excluirPage.clicaConfirmDelete();
		
	}

}
