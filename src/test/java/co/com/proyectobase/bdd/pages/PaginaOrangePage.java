package co.com.proyectobase.bdd.pages;

import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class PaginaOrangePage extends PageObject {
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElementFacade btnAdmin;
	
	@FindBy(id = "menu_admin_UserManagement")
	public WebElementFacade btnUserM ;
	
	@FindBy(id = "menu_admin_viewSystemUsers")
	public WebElementFacade btnUsers;
	
	@FindBy(id = "btnAdd")
	public WebElementFacade btnAdd;
	
	@FindBy(id = "systemUser_userType")
	public WebElementFacade selUsuario;
	
	@FindBy(id = "systemUser_userName")
	public WebElementFacade nomUsu;
	
	@FindBy(id = "systemUser_password")
	public WebElementFacade txtPass;
	
	@FindBy(id = "systemUser_confirmPassword")
	public WebElementFacade txtConPass;
	
	@FindBy(id = "btnSave")
	public WebElementFacade btnSave;
	
	@FindBy(xpath = "//*[@id=\"frmSystemUser\"]/fieldset/ol/li[2]/span")
	public WebElementFacade msjReq;	

	public void adicionarUsuario(List<List<String>> data, int i) {
		btnAdmin.click();
		btnUserM.click();
		btnUsers.click();
		btnAdd.click();
		selUsuario.selectByValue("1");
		nomUsu.sendKeys(data.get(i).get(1).trim());
		txtPass.sendKeys(data.get(i).get(2).trim());
		txtConPass.sendKeys(data.get(i).get(2).trim());		
		btnSave.click();
	}

	public void verificarMensaje(List<List<String>> data, int i) {
		String mensaje = data.get(i).get(0).trim();
		String strMensaje = msjReq.getText();
		System.out.println(mensaje);
		System.out.println(strMensaje);
		assertThat(strMensaje, containsString(mensaje));
	}	
	
}