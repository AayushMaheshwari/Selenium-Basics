// package StepDefinitions;

// import java.time.Duration;

// import org.openqa.selenium.By;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

// import io.cucumber.java.en.And;
// import io.cucumber.java.en.Given;
// import io.cucumber.java.en.Then;
// import io.cucumber.java.en.When;

// public class GoogleSearchSteps {

//     WebDriver driver = null;

//     @Given("browser is open")
//     public void browser_is_open() {
//         System.out.println("Inside Step - browser is open (Microsoft Edge)");

//         driver = new ChromeDriver();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//         driver.manage().window().maximize();
//     }

//     @And("user is on google search page")
//     public void user_is_on_google_search_page() {
//         System.out.println("Inside Step - user is on google search page");
//         driver.navigate().to("https://duckduckgo.com/");
//     }

//     @When("user enters a text in search box")
//     public void user_enters_a_text_in_search_box() throws InterruptedException {
//         System.out.println("Inside Step - user enters a text in search box");
//         Thread.sleep(1000);
//         driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//     }

//     @And("hits enter")
//     public void hits_enter() throws InterruptedException {
//         System.out.println("Inside Step - hits enter");
//         Thread.sleep(1000);
//         driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//     }

//     @Then("user is navigated to search results")
//     public void user_is_navigated_to_search_results() throws InterruptedException {
//         System.out.println("Inside Step - user is navigated to search results");
//         Thread.sleep(2000);
//         driver.getPageSource().contains("Automation Step by Step");

//         driver.close();
//         driver.quit();
//     }
// }
