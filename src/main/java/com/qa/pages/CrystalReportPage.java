package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class CrystalReportPage extends BaseClass {

	public CrystalReportPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//h1[text()=' SAP Crystal Reports Tutorial ']")
	WebElement subjectTitle;
	
	@FindBy (xpath="//h2[text()='Features of Crystal Report']")
	WebElement subTitle;
	
	public void validatePage() {
		boolean title=subjectTitle.isDisplayed();
		System.out.println(title);
		System.out.println(subjectTitle.getText());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",subTitle);
	       System.out.println(subTitle.getText());
	}

}
