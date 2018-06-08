package co.com.proyectobase.bdd.definition;

import net.thucydides.core.annotations.Steps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

import co.com.proyectobase.bdd.steps.LoginOrangeSteps;

public class LoginOrangeDefinition {
	
	public static List<List<String>> data;
	
	@Steps
	LoginOrangeSteps loginOrangeSteps;
	
	@Given("^que Ingreso a la pagina web de OrangeHRM$")
	public void queIngresoALaPaginaWebDeOrangeHRM() throws Exception {
		loginOrangeSteps.abrirPagina();
	}

	@When("^Diligencio los campos de registro$")
	public void diligencioLosCamposDeRegistro(DataTable dtDatatable) throws Exception {
		data= dtDatatable.raw();
		for (int i=0; i < data.size(); i++ ) {
			loginOrangeSteps.digitarCampos(data,i);
		}
	}
	
	@Then("^Verifico el ingreso exitoso$")
	public void verificoElIngresoExitoso(DataTable dtDatatable) throws Exception {
		data= dtDatatable.raw();
		for (int i=0; i < data.size(); i++ ) {
			loginOrangeSteps.verificarIngreso(data,i);
		}
		
	}
	
	
	
	
//	/***Metodo para el manejo de DataTable*/
//	public void <<nombre>>(DataTable dtDatatable) {
//		data= dtDatatable.raw();
//		for (int i=0; i < data.size(); i++ ) {
//			
//			String dato = (data.get(i).get(0).trim()); 
//		}
}
	
	
	
	
	
