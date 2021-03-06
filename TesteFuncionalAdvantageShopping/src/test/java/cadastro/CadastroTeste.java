package cadastro;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dsl.DSL;
import pages.CadastroPage;
import until.DriverFactory;

public class CadastroTeste {

	//private DSL dsl;
	private CadastroPage page;
	DriverFactory facDriver;

	
	@Before
	public void iniciliza() {
		DriverFactory.getDriver();
		//dsl = new DSL(DriverFactory.getDriver());
		page = new CadastroPage(DriverFactory.getDriver());
	}

	@After
	public void finaliaza() {
		DriverFactory.killDriver();
	}

	public void waitPage(int tempo) {
		facDriver.getDriver().manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
	}

	@Test
	public void CadastroCompleto() {
		waitPage(2000);
		page.clicaBotaoUser();
		//dsl.clicaByid("menuUser");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//dsl.clicaByLink("CREATE NEW ACCOUNT");
		page.clicaNewAccount();
		//dsl.mudaPagina(0);
		page.mudaPagina();

		page.setUserName("Raaul92");
		Assert.assertEquals("Raaul92", page.ObterUserNome());

		page.setUserEmail("leafar@gmail.com");
		Assert.assertEquals("leafar@gmail.com", page.getEmail());

		page.setPassword("b1107C@rol");
	//	Assert.assertEquals("b1107C@rol", dsl.obterValorCampoByname("passwordRegisterPage"));
		Assert.assertEquals("b1107C@rol", page.getPassword());
		
		page.setConfirmPassword("b1107C@rol");
		Assert.assertEquals("b1107C@rol", page.getConfirmPassword());

		page.setFirstName("Rafael");
		Assert.assertEquals("Rafael", page.getFirstname());

		page.setLastName("Santos");
		Assert.assertEquals("Santos", page.getLastName());

		page.setPhone("11987654321");
		Assert.assertEquals("11987654321", page.getPhone());

		page.setCity("S?o Paulo");
		Assert.assertEquals("S?o Paulo", page.getCity());

		page.setStreet("Rua 01");
		Assert.assertEquals("Rua 01", page.getStreet());

		page.setState("S?o Paulo");
		Assert.assertEquals("S?o Paulo", page.getState());

		page.setCep("02987090");
		Assert.assertEquals("02987090", page.getCep());

		page.selecionaOpcaoAgree();
		Assert.assertTrue(page.getStatusAgree());
		
		page.clicaBotaoCadastro();
	
	}

}
