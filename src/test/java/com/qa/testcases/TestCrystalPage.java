package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.CrystalReportPage;
import com.qa.pages.Guru99HomePage;

public class TestCrystalPage extends BaseClass {
	 Guru99HomePage homePage;
	  CrystalReportPage crystal;

	public TestCrystalPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		initialization();
		homePage= new Guru99HomePage();
		crystal = new CrystalReportPage();
		homePage.hooverOnSap();
	}
	
	@Test
	public void verifyCrystalReportPage() {
		crystal.validatePage();
	}
	
	

}
