package co.com.proyectobase.bdd.definition;

import net.thucydides.core.annotations.Steps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

import co.com.proyectobase.bdd.steps.LoginOrangeSteps;
import co.com.proyectobase.bdd.steps.PaginaOrangeSteps;

public class PaginaOrangeDefinition {
	
	@Steps
	PaginaOrangeSteps paginaOrangeSteps;
	
	
	public static List<List<String>> data;
	
	
	@When("^se adiciona un nuevo usuario$")
	public void seAdicionaUnNuevoUsuario(DataTable dtDatatable) throws Exception {
		data= dtDatatable.raw();
		for (int i=0; i < data.size(); i++ ) {			
			paginaOrangeSteps.adicionarUsuario(data,i);			
		}
	   
	}

	@Then("^Verifico el mensaje$")
	public void verificoElMensaje(DataTable dtDatatable1) throws Exception {
		data= dtDatatable1.raw();
		for (int i=0; i < data.size(); i++ ) {
			paginaOrangeSteps.verificarMensaje(data,i);
			
		}
	   
	}
	    
	
	//String dato = (data.get(i).get(0).trim()); 
	
	
	
	
	
	
}