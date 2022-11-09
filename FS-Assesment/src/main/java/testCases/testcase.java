package testCases;
import java.util.*;
import java.util.Map.Entry;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.*;

import pageObjects.*;
import utils.*;

class testcase {   

public static void main(String[] args) throws Exception{     
  HomePageObjects hpo= new HomePageObjects();
  GeneralMethods gm = new GeneralMethods();
  StatisticsPage sp= new StatisticsPage();
  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");         
  WebDriver driver = new ChromeDriver();
  
  //Launch Website
  driver.get("https://fundingsocieties.com/progress");
  driver.manage().window().maximize();
  
  /*gm.waitUntil(driver, hpo.StatisticsMenu);
  
  //Click on Statistics Menu
  WebElement menu = driver.findElement(By.xpath(hpo.StatisticsMenu));
  menu.click();
  */
  //Waiting until details are visible
  gm.waitUntil(driver,sp.statisticsRow);
  System.out.println("Statistics Details: ");
  //Verify All details and Print
  String statisticsTotalFundedHeading = driver.findElement(By.xpath(sp.statisticsTotalFundedHeading)).getText();
  String statisticsTotalFundedValue = driver.findElement(By.xpath(sp.statisticsTotalFundedValue)).getText();
  String statisticsNoOfFinanceHeading = driver.findElement(By.xpath(sp.statisticsNoOfFinanceHeading)).getText();
  String statisticsNoOfFinanceValue = driver.findElement(By.xpath(sp.statisticsNoOfFinanceValue)).getText();
  String statisticsDefaultRateHeading = driver.findElement(By.xpath(sp.statisticsDefaultRateHeading)).getText();
  String statisticsDefaultRateValue = driver.findElement(By.xpath(sp.statisticsDefaultRateValue)).getText();
  String statisticsRateHeading = driver.findElement(By.xpath(sp.statisticsRateHeading)).getText();
  String statisticsRateValue = driver.findElement(By.xpath(sp.statisticsRateValue)).getText();
  
  System.out.println(statisticsTotalFundedHeading.replace("\n", "")+": "+statisticsTotalFundedValue+"\n"+
		  			 statisticsNoOfFinanceHeading.replace("\n", "")+": "+statisticsNoOfFinanceValue+"\n"+
		  			statisticsDefaultRateHeading.replace("\n", "")+": "+statisticsDefaultRateValue+"\n"+
		  			statisticsRateHeading.replace("\n", "")+": "+statisticsRateValue+"\n"
		  			);
  
  //Move to General Tab
  System.out.println("General Tab Details: ");
  WebElement general = driver.findElement(By.xpath(sp.tabGeneral));
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", general);
  Thread.sleep(500);
  //General -> Total Approved
  String totalApporved = gm.getValueFromGraph(driver,sp.graphMarker,sp.amountPopup,sp.Year);
  System.out.println("Total Approved of "+totalApporved);
  //General -> Amount Disbursed
  driver.findElement(By.xpath(sp.amountDisbursed)).click();
  String disbursedAmount = gm.getValueFromGraph(driver,sp.graphMarker,sp.amountPopup,sp.Year);
  System.out.println("Amount Disbursed of "+disbursedAmount);
  //General -> Default Rate
  driver.findElement(By.xpath(sp.defaultRate)).click();
  String defaultRate = gm.getValueFromGraph(driver,sp.graphMarker,sp.amountPopup,sp.Year);
  System.out.println("Default Rate of "+defaultRate);
  
  //Move to Repayment Tab
  driver.findElement(By.xpath(sp.tabRepayment)).click();
  String totalRepayment = gm.getValueFromGraph(driver, sp.totalRepayment, sp.repaymentPopupValue, sp.repaymentPopupHeading);
  System.out.println(totalRepayment);
  String principle = gm.getValueFromGraph(driver, sp.princple, sp.repaymentPopupValue, sp.repaymentPopupHeading);
  System.out.println(principle);
  String interest = gm.getValueFromGraph(driver, sp.interest, sp.repaymentPopupValue, sp.repaymentPopupHeading);
  System.out.println(interest);
  
  //Move to Disbursement
  driver.findElement(By.xpath(sp.tabDisbursement)).click();
  List<WebElement> industryElementList =  driver.findElements(By.cssSelector(sp.industryType));
  
  HashMap<String, Double> map = new HashMap<>();
  LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>();
  ArrayList<Double> list = new ArrayList<>();
  
  for(int i=0; i<industryElementList.size();i++) {
	  
	  gm.moveToElement(driver, industryElementList.get(i));
	  String name = driver.findElement(By.cssSelector(sp.industryName)).getText();
	  String percentage = driver.findElement(By.cssSelector(sp.industryPercentage)).getText();
	  map.put(name, Double.parseDouble(percentage));
  }
  for (Map.Entry<String, Double> entry : map.entrySet()) {
      list.add(entry.getValue());
  }
  
  Collections.sort(list, new Comparator<Double>() {
      public int compare(Double str, Double str1) {
          return (str).compareTo(str1);
      }
  });
  for (Double str : list) {
      for (Entry<String, Double> entry : map.entrySet()) {
          if (entry.getValue().equals(str)) {
              sortedMap.put(entry.getKey(), str);
          }
      }
  }
  System.out.println(sortedMap);
  driver.quit();
}

} 

