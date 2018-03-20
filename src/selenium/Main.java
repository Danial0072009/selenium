package selenium;

import org.openqa.selenium.By;

import selenium.AutomateSystem;

public class Main {
	
	AutomateSystem automateSystem;
	
	public Main() {
		automateSystem = new AutomateSystem("chrome", "https://www.instagram.com/accounts/login/");
		test();
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	public void test() {
		automateSystem.writeToElement(By.name("username"), "danial_k007");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		automateSystem.writeToElement(By.name("password"), "danialhahaha");
		automateSystem.submitElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/form/span/button"));
	}
}
