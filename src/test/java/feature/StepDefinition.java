package feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	List<String> countires = new ArrayList<String>();
	List<String> capitals = new ArrayList<String>();
	List<String> languages = new ArrayList<String>();
	int randomNum;
	@Given("^The user three$")
	public void the_user_three(DataTable arg1) throws Throwable {
		Map<String, String> map = arg1.asMap(String.class, String.class);
		String[] country = map.get("country").split(",");
		countires = Arrays.asList(country);
		String[] capital = map.get("capital").split(",");
		capitals = Arrays.asList(capital);
		String[] lang = map.get("language").split(",");
		languages = Arrays.asList(lang);
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	@Given("^choose random number$")
	public void choose_random_number() throws Throwable {
		randomNum = (int) (Math.random() * ((countires.size() - 1) - 0)) + 0;
		System.out.println(randomNum);

	}

	@Then("^print  the country details$")
	public void print_the_country_details() throws Throwable {
		System.out.println(countires.get(randomNum));
		System.out.println(capitals.get(randomNum));
		System.out.println(languages.get(randomNum));

	}


}
