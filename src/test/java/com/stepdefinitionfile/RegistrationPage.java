package com.stepdefinitionfile;

import java.io.IOException;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.pojoclass.PojoClass;
import com.pojoclass.PojoRegister;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RegistrationPage extends BaseClass{
	
	//Pojo class Reference
	
	PojoClass po;
	PojoRegister pr;
	
	@Given("I navigate to the registration page")
	public void i_navigate_to_the_registration_page() throws IOException {
		
		browserLaunch();
		browserMaximize();

		urlWebsite(readExcel(1,0));
		
	}

	@When("I fill in the registration form with valid details")
	public void i_fill_in_the_registration_form_with_valid_details() throws IOException {
		po=new PojoClass();
		
		click(po.getCookies());
		click(po.getLogin());
		
		pr=new PojoRegister();
		click(pr.getCreate_Account());
		sendTxt(pr.getFirstName(),readExcel(2,1));	
		sendTxt(pr.getLastName(),readExcel(3,1));
		sendTxt(pr.getEmail(),readExcel(4,1));
		sendTxt(pr.getConfirmEmail(),readExcel(5,1));
		sendTxt(pr.getPassword(),readExcel(6,1));
		click(pr.getCode());
		click(pr.getCountry());
		sendTxt(pr.getMobile(),readExcel(7,1));
	    
	}

	@When("I submit the registration form")
	public void i_submit_the_registration_form() {
		System.out.println("Submitted Successfully");
	    
	}

	@Then("I should see a success message")
	public void i_should_see_a_success_message() {
		String ActualTitle = driver.getCurrentUrl();
		String ExpectedTitle = "https://webook.com/en/login?redirect=/en";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	    
	}

}
