package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

//Login Page
public class PojoLogin extends BaseClass {
	//non parametrized constructor
		public PojoLogin() {
			PageFactory.initElements(driver, this);
		}
		
		//Private WebElement
		//email
		@FindAll({
		 @FindBy(xpath="//input[@name='email']"),
		 @FindBy(xpath="//input[@type='email']"),
		 @FindBy(name="email")
		})
		private WebElement email;
		
		@FindAll({
			@FindBy(name="password"),
			@FindBy(id="password")
		})
		private WebElement password;
		
		
		//login
		@FindBy(xpath="//button[@id='email-login-button']")
		private WebElement login;

}
