package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class GeneralMethods {
	public void moveToElement(WebDriver driver, WebElement element) {
		Actions builder = new Actions (driver);	
		  builder.clickAndHold().moveToElement(element);	
		  builder.moveToElement(element).build().perform();
	}
	public void waitUntil(WebDriver driver, String element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
	}
	public void waitUntilCss(WebDriver driver, String element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
	}
	public String getValueFromGraph(WebDriver driver, String mark, String popup, String Year) throws InterruptedException {
		WebElement marker = driver.findElement(By.cssSelector(mark));
		moveToElement(driver, marker);
		waitUntilCss(driver, popup);
		WebElement amountPopup = driver.findElement(By.cssSelector(popup));
		String amount = amountPopup.getText();
		WebElement amountYear = driver.findElement(By.cssSelector(Year));
		String year = amountYear.getText();
		return (year+": "+amount);
	}
}
