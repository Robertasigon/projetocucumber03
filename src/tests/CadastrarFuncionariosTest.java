package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;

public class CadastrarFuncionariosTest {
	
	WebDriver driver;

	@Dado("^Acessar a p�gina de cadastro de funcion�rio$")
	public void acessar_a_p�gina_de_cadastro_de_funcion�rio() {
	   
		//Refer�ncia do driver do google chrome
		System.setProperty("Webdrive.chrome.driver", "c:\\chromedriver.exe");
		
		//Abrir o navegador e acessar a p�gina
		driver = new ChromeDriver();
		driver.get("http://exercqa-001-site1.btempurl.com/Jmeter/Exercicio04");
		
		//maximizar o navegador
		driver.manage().window().maximize();
		
	}

	@Dado("^Informar o nome do funcion�rio \"([^\"]*)\"$")
	public void informar_o_nome_do_funcion�rio(String arg1) {
	    
		//preencher o campo nome na tela de cadastro
		driver.findElement(By.cssSelector("#nome")).sendKeys(arg1);
	}

	@Dado("^Informar o cpf do funcion�rio \"([^\"]*)\"$")
	public void informar_o_cpf_do_funcion�rio(String arg1) {
	    
		//preencher o campo cpf na tela de cadastro
		driver.findElement(By.cssSelector("#cpf")).sendKeys(arg1);
	}

	@Dado("^Informar a matr�cula do funcion�rio \"([^\"]*)\"$")
	public void informar_a_matr�cula_do_funcion�rio(String arg1) {
	    
		//preencher o campo matricula da tela de cadastro
		driver.findElement(By.cssSelector("#matricula")).sendKeys(arg1);
	}

	@Dado("^Informar a data de admiss�o do funcion�rio \"([^\"]*)\"$")
	public void informar_a_data_de_admiss�o_do_funcion�rio(String arg1) {
	    
		//preencher o campo de data de admiss�o na tela de cadastro
		driver.findElement(By.cssSelector("#admissao")).sendKeys(arg1);
	}

	@Dado("^Selecionar a empresa do funcion�rio \"([^\"]*)\"$")
	public void selecionar_a_empresa_do_funcion�rio(String arg1) {
	   
		//selecionar o campo de op��o de empresa
		new Select(driver.findElement(By.cssSelector("#empresa"))).selectByValue(arg1);
	}

	@Dado("^Selecionar o setor do funcion�rio \"([^\"]*)\"$")
	public void selecionar_o_setor_do_funcion�rio(String arg1) {
	   
		//selecionar o campo de op��o de setores
		new Select(driver.findElement(By.cssSelector("#setor"))).selectByValue(arg1);
	}

	@Dado("^Selecionar a fun��o do funcion�rio \"([^\"]*)\"$")
	public void selecionar_a_fun��o_do_funcion�rio(String arg1) {
	    
		//selecionar o campo de op��o de fun��o
	     new Select(driver.findElement(By.cssSelector("#funcao"))).selectByValue(arg1);
	}

	@Quando("^Solicitar a realiza��o do cadastro do funcion�rio$")
	public void solicitar_a_realiza��o_do_cadastro_do_funcion�rio() {
	    
		//clicar no bot�o de cadastro
		driver.findElement(By.cssSelector("#btnCadastro")).click();
	}

	@Ent�o("^Sistema imforma que o funcion�rio foi cadastrado com sucesso$")
	public void sistema_imforma_que_o_funcion�rio_foi_cadastrado_com_sucesso() {
	    
		//lendo a mensagem exibida pelo sistema
		String mensagem = driver.findElement(By.cssSelector("#mensagem")).getText();
		
		//comparando a mensagem obtida do sistema
		//resultado esperado x resultado obtido
		assertEquals(mensagem,"Opera��o realizada com sucesso.");
		
		//fechando o navegador
		driver.close();
		driver.quit();
	}


	
}
