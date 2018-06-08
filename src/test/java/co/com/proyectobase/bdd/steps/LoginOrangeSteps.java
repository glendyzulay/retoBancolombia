package co.com.proyectobase.bdd.steps;

import java.util.List;

import co.com.proyectobase.bdd.pages.LoginOrangePage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class LoginOrangeSteps {
	
	LoginOrangePage loginOrangePage;
	
	@Step
	public void abrirPagina() {
		loginOrangePage.open();
		
		
	}
	
	@Step
	public void digitarCampos(List<List<String>> data, int i) {
		loginOrangePage.digitarCampos(data,i);
		
	}

	public void verificarIngreso(List<List<String>> data, int i) {
		loginOrangePage.verificarIngreso(data,i);
		
	}
	
	
}