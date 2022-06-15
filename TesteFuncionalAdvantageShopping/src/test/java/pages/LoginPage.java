package pages;

import org.openqa.selenium.WebDriver;

import dsl.DSL;

public class LoginPage {

private DSL dsl;
	
	public LoginPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void setUserName(String nome) {
		dsl.escreveByName("username", nome);
	}
	
	public String ObterUserNome() {
		return dsl.obterValorCampoByname("username");
	}
	
	public void setSenha(String nome) {
		dsl.escreveByName("password", nome);
	}
	
	public String ObterSenha() {
		return dsl.obterValorCampoByname("password");
	}
	
	public void clicaBotaoLogin() {
		dsl.clicaByid("sign_in_btnundefined");
	}
	
	public void clicaBotaoUser() {
		dsl.clicaByid("menuUser");
	}
	
	
}
