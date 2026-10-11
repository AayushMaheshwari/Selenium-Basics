package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage_PF;

public class LoginDemoSteps {

    WebDriver driver = null;
    LoginPage_PF login;

    // Scenario Hooks
    @Before
    public void browserSetup() {
        System.out.println("  I am inside browserSetup");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    // Scenario Hooks
    @After
    public void teardown() {
        driver.close();
        driver.quit();
    }

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - browser is open");
    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Inside Step - user is on login page");
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        System.out.println("Inside Step - user enters " + username + " and " + password);

        login = new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();

        Thread.sleep(2000);
    }

    @Then("user should see the login page")
    public void user_should_see_the_login_page() throws InterruptedException {
        System.out.println("Inside Step - user should see the login page");

        login = new LoginPage_PF(driver);
        boolean isDisplayed = login.checkLoginPageIsDisplayed();
        System.out.println("Login page displayed: " + isDisplayed);

        Thread.sleep(2000);
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        System.out.println("Inside Step - user is navigated to the home page");

        login.checkLogoutIsDisplayed();

        Thread.sleep(2000);
    }
}
