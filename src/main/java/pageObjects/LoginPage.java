package pageObjects;

import helper.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public WebDriver driver;
    CommonFunctions commonFunctions;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        commonFunctions=new CommonFunctions(driver);
    }

    @FindBy(xpath ="//*[@name =\"username\"]")
    WebElement userName;

    @FindBy(xpath ="//*[@type=\"submit\"]")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@ name =\"password\"]")
    WebElement password;


    public void enterUserName(String name) {
        commonFunctions.enterValues(userName,name);
    }

    public void enterPassword(String pass) {
        commonFunctions.enterValues(password,pass);
    }

    public void clickLoginButton() {
        commonFunctions.click(loginBtn);
    }
}
