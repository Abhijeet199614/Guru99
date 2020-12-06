package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class AgilePage extends BaseClass {

	public AgilePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//h1[text()=' Agile Tutorial | Agile Methodology Tutorial for Testing ']")
	WebElement subjectTitle;
	
	public void SubjectPage() {
		boolean title=subjectTitle.isDisplayed();
		System.out.println(title);
		System.out.println(subjectTitle.getText());
	}
	
	

}
