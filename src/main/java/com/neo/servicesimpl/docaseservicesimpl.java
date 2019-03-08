package com.neo.servicesimpl;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

//@Listeners({TestngListener.class})
public class docaseservicesimpl {
    static { System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");}

    public static WebDriver driver =new FirefoxDriver();
	static{driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
//    @DataProvider(name = "test1")
//    public static Object[][] primeNumbers(String pagename,String elename,String doname,String url,String sendinfo,String eleby) {
//    	
//        return new Object[][] { {elename, doname, url, sendinfo, eleby}};
//    }
//    
//	
//	public static void dotest(String elename,String doname,String url,String sendinfo,String eleby){
//		docase(elename,doname, url, sendinfo,eleby);	
//	}
//	

//	@Test
	public static void docase(String elename,String doname,String url,String sendinfo,String eleby) {

		if (StringUtils.isNotBlank(url)){

			driver.get(url);
		}else if (url==null){
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		try {

		switch (eleby) {
		case "id":
			WebElement elid=driver.findElement(By.id(elename));
			switch (doname) {
			case "click":
				elid.click();
				break;
			case "sendkeys":
				elid.sendKeys(sendinfo);
				break;
			case "clear":
				elid.clear();
				break;
			case "gettext":
				elid.getText();
				break;
			case "getsize":
				elid.getSize();
				break;
			case "tostring":
				elid.toString();
				break;
			case "gettagname":
				elid.getTagName();
				break;
			case "isdisplayed":
				elid.isDisplayed();
				break;
			case "isselected":
				elid.isSelected();
				break;
			default:
				break;
			}
			break;

		case "name":
			WebElement elname=driver.findElement(By.name(elename));
			switch (doname) {
			case "click":
				elname.click();
				break;
			case "sendkeys":
				elname.sendKeys(sendinfo);
				break;
			case "clear":
				elname.clear();
				break;
			case "gettext":
				elname.getText();
				break;
			case "getsize":
				elname.getSize();
				break;
			case "tostring":
				elname.toString();
				break;
			case "gettagname":
				elname.getTagName();
				break;
			case "isdisplayed":
				elname.isDisplayed();
				break;
			case "isselected":
				elname.isSelected();
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
		Assert.assertEquals(0, 0);
		Thread.sleep(2000);
		
//		driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		finally {driver.quit();driver=null;}
		
	}

}
