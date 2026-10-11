package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

    // Page Factory WebElements using @FindBy annotations

    @FindBy(id = "username")
    WebElement txt_username;

    @FindBy(id = "password")
    WebElement txt_password;

    @FindBy(id = "submit")
    WebElement btn_login;

    @FindBy(linkText = "Log out")
    WebElement btn_logout;

    @FindBy(xpath = "//h2[text()='Test login']")
    WebElement heading_loginPage;

    WebDriver driver;

    // Constructor: initializes WebDriver and PageFactory elements
    public LoginPage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }

    public void clickLogin() {
        btn_login.click();
    }

    public boolean checkLogoutIsDisplayed() {
        return btn_logout.isDisplayed();
    }

    public boolean checkLoginPageIsDisplayed() {
        return heading_loginPage.isDisplayed();
    }

    public void loginValidUser(String username, String password) {
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
        btn_login.click();
    }
}
