package pages;

import org.openqa.selenium.WebDriver;

import dsl.DSL;

public class ExcluirContaPage {

private DSL dsl;
	
	public ExcluirContaPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void clicaBotaoUsuario() {
		dsl.clicaByCssSeletor(".containMiniTitle");
	}
	
	public void clicaBotaoMyAccount() {
		dsl.clicaByCssSeletor("#loginMiniTitle > .option:nth-child(1)");
	}
	
	public void clicaBotaoDeleteAccount(){
		dsl.clicaByCssSeletor(".deleteBtnText");
	}
	
public void clicaConfirmDelete(){
	dsl.clicaByCssSeletor(".deleteRed");
	}


}
