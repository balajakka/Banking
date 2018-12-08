package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import static stepDefinition.Hooks.driver;

/**
 * Created by balajakka on 06/12/2018.
 */
public class MyBankingStepDefinition {

    WebDriver driver;

    @Given("I am a Chrome user")
    public void step1(){
        System.setProperty("webdriver.chrome.driver","./src/test/java/chromedriver");
        System.out.println("I am in Given");
        driver = new ChromeDriver();
    }
    @When("^I access HSBC bank website")
    public void step2(){

        driver.get("https://www.google.co.uk/");
        System.out.println("I am in Given");
    }
    @Then("^I see HSBC home page")
    public void ste3(){
        System.out.println("I am Then");
        driver.quit();
    }


}

