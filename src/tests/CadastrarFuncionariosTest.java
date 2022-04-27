package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastrarFuncionariosTest {
	
	WebDriver driver;

	@Dado("^Acessar a página de cadastro de funcionário$")
	public void acessar_a_página_de_cadastro_de_funcionário() {
	   
		//Referência do driver do google chrome
		System.setProperty("Webdrive.chrome.driver", "c:\\chromedriver.exe");
		
		//Abrir o navegador e acessar a página
		driver = new ChromeDriver();
		driver.get("http://exercqa-001-site1.btempurl.com/Jmeter/Exercicio04");
		
		//maximizar o navegador
		driver.manage().window().maximize();
		
	}

	@Dado("^Informar o nome do funcionário \"([^\"]*)\"$")
	public void informar_o_nome_do_funcionário(String arg1) {
	    
		//preencher o campo nome na tela de cadastro
		driver.findElement(By.cssSelector("#nome")).sendKeys(arg1);
	}

	@Dado("^Informar o cpf do funcionário \"([^\"]*)\"$")
	public void informar_o_cpf_do_funcionário(String arg1) {
	    
		//preencher o campo cpf na tela de cadastro
		driver.findElement(By.cssSelector("#cpf")).sendKeys(arg1);
	}

	@Dado("^Informar a matrícula do funcionário \"([^\"]*)\"$")
	public void informar_a_matrícula_do_funcionário(String arg1) {
	    
		//preencher o campo matricula da tela de cadastro
		driver.findElement(By.cssSelector("#matricula")).sendKeys(arg1);
	}

	@Dado("^Informar a data de admissão do funcionário \"([^\"]*)\"$")
	public void informar_a_data_de_admissão_do_funcionário(String arg1) {
	    
		//preencher o campo de data de admissão na tela de cadastro
		driver.findElement(By.cssSelector("#admissao")).sendKeys(arg1);
	}

	@Dado("^Selecionar a empresa do funcionário \"([^\"]*)\"$")
	public void selecionar_a_empresa_do_funcionário(String arg1) {
	   
		//selecionar o campo de opção de empresa
		new Select(driver.findElement(By.cssSelector("#empresa"))).selectByValue(arg1);
	}

	@Dado("^Selecionar o setor do funcionário \"([^\"]*)\"$")
	public void selecionar_o_setor_do_funcionário(String arg1) {
	   
		//selecionar o campo de opção de setores
		new Select(driver.findElement(By.cssSelector("#setor"))).selectByValue(arg1);
	}

	@Dado("^Selecionar a função do funcionário \"([^\"]*)\"$")
	public void selecionar_a_função_do_funcionário(String arg1) {
	    
		//selecionar o campo de opção de função
	     new Select(driver.findElement(By.cssSelector("#funcao"))).selectByValue(arg1);
	}

	@Quando("^Solicitar a realização do cadastro do funcionário$")
	public void solicitar_a_realização_do_cadastro_do_funcionário() {
	    
		//clicar no botão de cadastro
		driver.findElement(By.cssSelector("#btnCadastro")).click();
	}

	@Então("^Sistema imforma que o funcionário foi cadastrado com sucesso$")
	public void sistema_imforma_que_o_funcionário_foi_cadastrado_com_sucesso() {
	    
		//lendo a mensagem exibida pelo sistema
		String mensagem = driver.findElement(By.cssSelector("#mensagem")).getText();
		
		//comparando a mensagem obtida do sistema
		//resultado esperado x resultado obtido
		assertEquals(mensagem,"Operação realizada com sucesso.");
		
		//fechando o navegador
		driver.close();
		driver.quit();
	}


	
}
