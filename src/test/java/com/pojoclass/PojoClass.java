package com.pojoclass;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PojoClass extends BaseClass{
	
	//non parametrized constructor
	public PojoClass() {
		
		PageFactory.initElements(driver, this);
	}
	
    //private WebElement
	//cookies webelement
	@FindBy(xpath="//button[text()='Accept cookies']")
	private WebElement cookies;
	
	
	//Login WebElement
	@FindBy(xpath="//p[text()='Log In / Sign Up']")
	private WebElement login;
	
	//Getters
	public WebElement getCookies() {
		return cookies;
	}

	public WebElement getLogin() {
		return login;
	}
	

}
