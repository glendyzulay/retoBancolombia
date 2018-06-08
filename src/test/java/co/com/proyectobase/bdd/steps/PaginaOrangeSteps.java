package co.com.proyectobase.bdd.steps;

import java.util.List;

import co.com.proyectobase.bdd.pages.PaginaOrangePage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class PaginaOrangeSteps {
	
	
 PaginaOrangePage paginaOrangePage;

public void adicionarUsuario(List<List<String>> data, int i) {
	paginaOrangePage.adicionarUsuario(data,i);
	
}

public void verificarMensaje(List<List<String>> data, int i) {
	paginaOrangePage.verificarMensaje(data,i);
	
}
	
	
//	@Step
//	public void <<nombre_metodo>>() {
//		
//	}
//	
//	@Step
//	public void <<nombre_metodo>>() {
//		
//	}
//	
//	@Step
//	public void <<nombre_metodo>>() {
//		
//	}
	
	
}