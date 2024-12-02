package com.stepdefinitionfile;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.pojoclass.PojoClass;
import com.pojoclass.PojoSearch;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Search Page

public class SearchPage extends BaseClass {
	PojoSearch ps;
	PojoClass po;
	@Given("I navigate to the search page")
	public void i_navigate_to_the_search_page() throws IOException {
		browserLaunch();
		browserMaximize();
		urlWebsite(readExcel(1,0));
		  
	}

    @When("I search for Events")
    public void i_search_for_Events() {
    	ps=new PojoSearch();
    	po=new PojoClass();
    	click(po.getCookies());
    	sendTxt(ps.getSearch(),"event");
    	click(ps.getSearching());
    
}

	@When("I apply the Destination and Select dates and PriceRange filter")
	public void i_apply_the_Destination_and_Select_dates_and_PriceRange_filter() {
	    
		click(ps.getPlace());
		click(ps.getSerachplace());
		click(ps.getDates());
		click(ps.getFilter());
		click(ps.getSport());
	}

	@Then("I should see filtered search results")
	public void i_should_see_filtered_search_results() {
	  
		System.out.println("Sucessfully get filtered data");
		//driver.close();
	}



	
	

}
