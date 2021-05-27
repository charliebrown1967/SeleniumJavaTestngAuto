package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;


/**
 * 
 * Esta clase centraliza los localizadores y m�todos de la p�gina que ser� usada por el test case.
 * Se requiere una clase por cada p�gina a ser probada. 
 *
 */
public class GooglePage extends Base{

    // Define localizadores objetos de la pagina
	// Localizador campo de texto Google busqueda "q" 
	By textbox_search = By.name("q");
	// Localizador boton de busqueda Google "btnK"
	By button_search = By.name("btnK");
	
	/**
	 * Este m�todo es el constructor de la clase
	 * @param driver contiene la sesi�n actual
	 */
	public GooglePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	/**
	 * Este m�todo toma un texto de b�squeda y lo escribe en el campo "q" 
	 * de Google, para luego dar clic en el bot�n de b�squeda
	 * @param searchText cadena de texto que ser� buscada en Google
	 * @throws InterruptedException genera excepci�n en caso de que no pueda localizar el campo de b�squeda de la p�gina donde se digita el texto
	 */
	public void search (String searchText) throws InterruptedException
	{
		// Pregunta si el campo textbox_search esta presente
		if (isDisplayed(textbox_search))
		{
			// Envia cadena de busqueda al campo textbox_search "q"
			type(searchText,textbox_search);
			// Solicita dar click en button_search btnK
			click(button_search);
		}else
		{  // Informa que el campo "q" no fue hallado
			System.out.println("No fue encontrado el campo de busqueda q !!");
		}
	}
	/**
	 * Este m�todo recibe un objeto driver (sesi�n actual) y
	 * retorna el t�tulo de la p�gina actual del navegador
	 * @param driver tiene la sesi�n actual
	 * @return t�tulo de la p�gina actual
	 */
	public String returnpagetitle (WebDriver driver)
	{
	    return driver.getTitle();	
	}	
	
} // Final GooglePage
