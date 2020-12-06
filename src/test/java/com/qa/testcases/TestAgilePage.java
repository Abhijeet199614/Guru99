package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.AgilePage;
import com.qa.pages.Guru99HomePage;

public class TestAgilePage extends BaseClass {
	 Guru99HomePage homePage;
	 AgilePage agilePage;

	public TestAgilePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		initialization();
		homePage = new Guru99HomePage();
		agilePage = new AgilePage();
		agilePage= homePage.hoovering();
	}
	
	@Test
	public void validateSubjectTitle() {
		agilePage.SubjectPage();
	}

}
