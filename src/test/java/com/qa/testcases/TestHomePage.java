package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.CrystalReportPage;
import com.qa.pages.Guru99HomePage;

public class TestHomePage extends BaseClass {
	  Guru99HomePage homePage;
	  CrystalReportPage crystal;

	public TestHomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setUp() throws IOException {
		initialization();
		homePage= new Guru99HomePage();
		crystal = new CrystalReportPage();
	}
	
	@Test(priority=1)
	public void validateText() {
		homePage.testTitle();
		
	}
	
	@Test(priority=2)
	public void testHooveringOnTesting() throws InterruptedException, IOException {
		homePage.hoovering();
	}
	
	@Test
	public void verifySap() throws InterruptedException, IOException {
		homePage.hooverOnSap();
		
	}
	@Test
	public void verifyAboutUsLink() throws IOException {
		homePage.clickOnAboutUs();
	}
	
	@Test
	public void verifyhooverOnWebAndClickOnCsharp() throws InterruptedException{
		homePage.hooverOnWebAndClickOnCsharp();
		
	}
	

}
