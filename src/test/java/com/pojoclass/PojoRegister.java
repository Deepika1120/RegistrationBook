package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

//Registration Page
public class PojoRegister extends BaseClass {
	//non parametrized constructor
		public PojoRegister() {
			
			PageFactory.initElements(driver, this);
		}
		
	//Private Webelement for Registration Page
		
		//creat Account
		@FindBy(xpath="//button[text()='Create an account']")
		private WebElement create_Account;
	
		public void setCreate_Account(WebElement create_Account) {
			this.create_Account = create_Account;
		}

		//First_Name
		@FindBy(name="first_name")  
		private WebElement firstName;

		//Last_name
		@FindBy(id="last_name")
		private WebElement lastName;
		
		//email
		@FindBy(id="email")
		private WebElement email;
		
		//confirm_email
		@FindBy(id="confirm_email")
		private WebElement confirmEmail;
		
		//password
		@FindBy(name="password")
		private WebElement password;
		

		//code
		@FindBy(xpath="//button[@class='absolute top-0 h-[42px] px-2 disabled:cursor-not-allowed ltr:right-0 rtl:left-0']")
		private WebElement code;
		
		//country
		@FindBy(xpath="//span[text()='India']")
		private WebElement country;

	
		//mobile
		@FindBy(name="mobile")
		private WebElement mobile;
		

		//Getters
		public WebElement getFirstName() {
			return firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getConfirmEmail() {
			return confirmEmail;
		}

		public WebElement getPassword() {
			return password;
		}
	
		public WebElement getCode() {
			return code;
		}
		
		public WebElement getCountry() {
			return country;
		}
		
		public WebElement getMobile() {
			return mobile;
		}
		
		public WebElement getCreate_Account() {
			return create_Account;
		}
		

}
