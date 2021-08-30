package Cucumber.Automation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShaadiDotCom {
	
	//ExcelRead read =new ExcelRead();
	
	

		
		
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DataDriven d=new DataDriven();
		
		ArrayList data=d.getData("Login");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		System.out.println(data.get(4));
		System.out.println(data.get(5));
		
		
		
		
		
		
		
		
		
		
		 //Map<String, String> testData = new HashMap<String,String>() ;
		 
		 //ExcelRead.getTestData("1");
		 
		// System.out.println("Input data is "+testData);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://marathishaadi.com/");  //URL
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()=\"Let's Begin\"]")).click();
		//testdata.get()
		driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[2]/div[1]/input")).sendKeys(data.get(1).toString());
		

		driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("Password");  //data.get(2).toString()
		driver.findElement(By.xpath("//div[@class='Dropdown-placeholder']")).click();
		
		//String CurrentUrl = driver.getCurrentUrl();
		
		//System.out.println(CurrentUrl);
		
		driver.findElement(By.xpath("//div[normalize-space()='Son']")).click();
		
		
		//Select s = new Select(driver.findElement(By.xpath("//div[@class='Dropdown-placeholder']")));
		
		//s.selectByVisibleText("Son");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys((data.get(4)).toString());
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys((data.get(5)).toString());
		
		driver.findElement(By.xpath("//div[contains(text(),'Day')]")).click();
		
		driver.findElement(By.xpath("//div[@role='option'][normalize-space()='02']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Month')]")).click();
		
		driver.findElement(By.xpath("//div[@role='option'][normalize-space()='Mar']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Year')]")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='1996']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='Dropdown-placeholder'][normalize-space()='Select']")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='Hindu']")).click();
		
		
		String community = driver.findElement(By.xpath("//div[@class='Dropdown-placeholder is-selected'][normalize-space()='Marathi']")).getText();
		
		System.out.println(community);
		
String CurrentUrl = driver.getCurrentUrl();
		
		System.out.println(CurrentUrl);
		
if(community.equals("Marathi"))
			
		{
			community=community.toLowerCase();
		}
		
		
		
CurrentUrl.contains(community);
		
		
		
		System.out.println(CurrentUrl.contains(community));
		
		

	}

		
		
		//driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		
		
		/*String URL = "Marathi"
		
		String community =driver.findElement(By.xpath(""))
				
				
				String url =driver.findElement(By.xpath(""))
				
				url.contains(community)*/
		
		//driver.findElement(By.xpath("")).get
		
	/*	WebElement community=driver.findElement(by.)
		
		String community;
		String CurrentURL =driver.getCurrentUrl();
		
		 community ="Marathi";
		
		if(community.equals("Marathi"))
			
		{
			community=community.toLowerCase();
		}
		
		
		
		URL.contains(community);
		
		
		
		System.out.println(URL.contains(community));*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

