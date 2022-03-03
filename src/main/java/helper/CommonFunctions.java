package helper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonFunctions {

	Logger logger = LoggerHelper.getLogger(CommonFunctions.class);
	
	private WebDriver driver;
	
	public CommonFunctions(WebDriver driver){
		this.driver = driver;
	}
	
	public void WaitForElement(WebElement element,long timeOutInSeconds){
		logger.info("waiting for element visibilityOf..");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		logger.info("element is visible..");
	}
	public void WaitForElement(WebElement element){
		logger.info("waiting for element visibilityOf..");
		WebDriverWait wait = new WebDriverWait(driver, Constants.explicitWait);
		wait.until(ExpectedConditions.visibilityOf(element));
		logger.info("element is visible..");
	}

	public void click(WebElement element){
		logger.info("Click on element");
		element.click();
	}


	public void enterValues(WebElement element,String data){
		logger.info("Entering value in text filed = "+data);
		element.sendKeys(data);
	}

}
