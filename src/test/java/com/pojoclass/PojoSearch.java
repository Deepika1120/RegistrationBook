package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PojoSearch extends BaseClass{
	
	public PojoSearch() {
		PageFactory.initElements(driver, this);
	}
	
	//private Webelement
	@FindBy(xpath="//input[@type='search']")
	private WebElement search;

	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement searching;


	@FindBy(xpath="(//p[text()='Everywhere'])[1]")
	private WebElement place;

	@FindBy(xpath="//div[text()='Riyadh']")
	private WebElement serachplace;
	
	@FindBy(xpath="//span[text()='Tomorrow']")
	private WebElement dates;
	
	@FindBy(xpath="//input[@name='theater-and-performing-arts']")
	private WebElement filter;

	@FindBy(xpath="//input[@name='sports-events']")
	private WebElement sport;
	//Getters
	public WebElement getSearch() {
		return search;
	}
	public WebElement getSearching() {
		return searching;
	}
	public WebElement getPlace() {
		return place;
	}

	public WebElement getSerachplace() {
		return serachplace;
	}
	public WebElement getDates() {
		return dates;
	}
	public WebElement getFilter() {
		return filter;
	}
	public WebElement getSport() {
		return sport;
	}

}
