package co.com.proyectobase.bdd.pages;

import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("http://opensource.demo.orangehrmlive.com/index.php/dashboard")
public class LoginOrangePage extends PageObject {
	
	@FindBy(id = "txtUsername")
	public WebElementFacade txtUser;
	
	@FindBy(id = "txtPassword")
	public WebElementFacade txtPass;
	
	@FindBy(id = "btnLogin")
	public WebElementFacade btnLogin;
	
	@FindBy(id="welcome")
	public WebElementFacade txtBienvenido;

	public void digitarCampos(List<List<String>> data, int i) {
		System.out.println(data.get(i).get(0).trim());
		System.out.println(data.get(i).get(1).trim());
		txtUser.sendKeys(data.get(i).get(0).trim());
		txtPass.sendKeys(data.get(i).get(1).trim());
		btnLogin.click();		
	}

	public void verificarIngreso(List<List<String>> data, int i) {
		String usuario = data.get(i).get(0).trim();
		String strMensaje = txtBienvenido.getText();
		assertThat(strMensaje, containsString(usuario));
		
	}
	

	
//	/* Verificar campo en pantalla  */
//	public void <<NombreClase>> (String lblExitoso) {
//		String strMensaje = objeto.getText();
//		assertThat(strMensaje, containsString(lblExitoso));
//		
//	}
	
	
}