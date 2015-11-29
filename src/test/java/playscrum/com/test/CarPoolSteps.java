package playscrum.com.test;

import junit.framework.TestCase;
import playscrum.com.main.Ride;
import playscrum.com.main.RideBLL;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarPoolSteps extends TestCase {
	Ride ride;
	String button;
	@Given("^employee enter Name as \"([^\"]*)\" and email id as \"([^\"]*)\" and origin is \"([^\"]*)\" and dest is \"([^\"]*)\" and phone is \"([^\"]*)\"$")
	public void employee_enter_Name_as_and_email_id_as_and_origin_is_and_dest_is_and_phone_is(String name, String email, String origin, String dest, String phone) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride = new Ride();
		ride.setDestination(dest);
		ride.setEmail(email);
		ride.setName(name);
		ride.setOrigin(origin);
		ride.setPhone(phone);
		
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		button = arg1;
	}

	@Then("^System should display a message \"([^\"]*)\"$")
	public void System_should_display_a_message(String message) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RideBLL ridebll = new RideBLL();
		assertEquals(message, ridebll.validate(ride));
		
	}


}
