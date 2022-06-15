package pages;

import org.openqa.selenium.WebDriver;

import dsl.DSL;

public class CadastroPage {

	
	private DSL dsl;
	
	public CadastroPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	
	public void setUserName(String nome) {
		dsl.escreveByName("usernameRegisterPage", nome);
	}
	
	public String ObterUserNome() {
		return dsl.obterValorCampoByname("usernameRegisterPage");
	}
	
	
	public void setUserEmail(String email) {
		dsl.escreveByName("emailRegisterPage", email);
	}
	
	public String getEmail() {
		return dsl.obterValorCampoByname("emailRegisterPage");
		
	}
	
	public void setPassword(String password) {
		dsl.escreveByName("passwordRegisterPage", password);
	}
	
	public String getPassword() {
		return dsl.obterValorCampoByname("passwordRegisterPage");
		
	}
	
	public void setConfirmPassword(String password) {
		dsl.escreveByName("confirm_passwordRegisterPage", password);
	}
	
	public String getConfirmPassword() {
		return dsl.obterValorCampoByname("confirm_passwordRegisterPage");
	}
	
	
	public void setFirstName(String firstName) {
		dsl.escreveByName("first_nameRegisterPage", firstName);
	}
	
	public String getFirstname() {
		return dsl.obterValorCampoByname("first_nameRegisterPage");
	}
	
	
	public void setLastName(String lastName) {
		dsl.escreveByName("last_nameRegisterPage", lastName);
	}
	
	public String getLastName() {
		return dsl.obterValorCampoByname("last_nameRegisterPage");
	}

	public void setPhone(String phone) {
		dsl.escreveByName("phone_numberRegisterPage", phone);
	}
	
	public String getPhone() {
		return dsl.obterValorCampoByname("phone_numberRegisterPage");
	}
	

	public void setCity(String city) {
		dsl.escreveByName("cityRegisterPage", city);
	}
	
	public String getCity() {
		return dsl.obterValorCampoByname("cityRegisterPage");
	}
	

	public void setStreet(String street) {
		dsl.escreveByName("addressRegisterPage", street);
	}
	
	public String getStreet() {
		return dsl.obterValorCampoByname("addressRegisterPage");
	}
	
		
	public void setState(String state) {
		dsl.escreveByName("state_/_province_/_regionRegisterPage", state);
	}
	
	public String getState() {
		return dsl.obterValorCampoByname("state_/_province_/_regionRegisterPage");
	}
	
	public void setCep(String cep) {
		dsl.escreveByName("postal_codeRegisterPage", cep);
	}
	
	public String getCep() {
		return dsl.obterValorCampoByname("postal_codeRegisterPage");
	}

	public void selecionaOpcaoAgree() {
		dsl.clicaByName("i_agree");
	}
	
	
	public Boolean getStatusAgree() {
		return dsl.selecionadoByName("i_agree");
	}
	
	public void clicaBotaoCadastro() {
		dsl.clicaByid("register_btnundefined");
	}
	
	public void clicaBotaoUser() {
		dsl.clicaByid("menuUser");
	}
	
	public void clicaNewAccount() {
		dsl.clicaByLink("CREATE NEW ACCOUNT");
	}
	
	public void mudaPagina() {
		dsl.mudaPagina(0);
	}
}

