package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class Guru99HomePage extends BaseClass {

	public Guru99HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//h3[text()='Guru99 is totally new kind of learning experience.']")
	WebElement text;
	
	@FindBy (xpath="//div[@class='g-content g-particle']//nav//ul//li//span[text()='Testing']")
	WebElement testing;
	
	@FindBy (xpath="//span[@class='g-menu-item-content']//span[text()='Agile Testing']")
	WebElement agile;
	
	@FindBy (xpath="//span[text()='SAP']")
	WebElement sap;
	
	@FindBy (xpath="//span[@class='g-menu-item-content']//span[text()='Crystal Reports']")
	WebElement crystalReports;
	
	@FindBy (xpath="//a[text()='About Us']")
	WebElement aboutUs;
	
	@FindBy (xpath="//span[@class='g-separator g-menu-item-content']//span[text()='Web']")
	WebElement web;
	
	@FindBy (xpath="//span[text()='C#']")
	WebElement c;
	
	public void testTitle() {
		boolean title=text.isDisplayed();
		System.out.println(text.getText());
		System.out.println(title);
	}
	public AgilePage hoovering() throws InterruptedException, IOException {  //hoovering on Testing
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.moveToElement(testing).build().perform();
		Thread.sleep(3000);
		agile.click();
		return new AgilePage();
		
		
		
	}

	//method for hoovering on sap button
	public CrystalReportPage hooverOnSap() throws InterruptedException, IOException {
		Actions act = new Actions(driver);
		act.moveToElement(sap).build().perform();
		Thread.sleep(2000);
		crystalReports.click();
		return new CrystalReportPage();
	}
	
	public AboutUS clickOnAboutUs() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", aboutUs);
		aboutUs.click();
		return new AboutUS();
	}
	
	public void hooverOnWebAndClickOnCsharp() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(web).build().perform();
		Thread.sleep(2000);
		c.click();
	}

}
