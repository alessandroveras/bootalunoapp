package br.edu.infnet.bootalunoapp.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntegrationIT {

	
	@Test
	public void deveriaCadastrarUmNovoAluno() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alessandro Santos\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8484/bootaluno");
		
		driver.findElement( By.linkText("Cadastrar novo aluno")).click();
		
		driver.findElement(By.id("nome")).sendKeys("aluno");
		driver.findElement(By.id("email")).sendKeys("aluno@aluno.com");
		
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		assertTrue(driver.getPageSource().contains("aluno"));
		
		driver.close();
		
		
	}
	
//	@Test
//	public void deveriaDeletarUmAluno() {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alessandro Santos\\Downloads\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost:8484/bootaluno");
//		
//        //Adicionar aluno
//		driver.findElement( By.linkText("Cadastrar novo aluno")).click();		
//		driver.findElement(By.id("nome")).sendKeys("alunoParaDeletar");
//		driver.findElement(By.id("email")).sendKeys("alunoParaDeletar@aluno.com");		
//		driver.findElement(By.cssSelector(".btn-primary")).click();
//		
//		//Remover o aluno adicionado
//		driver.findElement(By.cssSelector(".btn-danger")).click();
//		
//		assertFalse(driver.getPageSource().contains("aluno"));
//		
//		driver.close();
//		
//	}

}
