package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintest {
	public WebDriver driver;
	
	@Given("admin user is on home page")
	public void admin_user_is_on_home_page() {
				
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\User 1\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions(); 
		//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		//WebDriver driver = new ChromeDriver(options); 
		
		//Builder withSilent = new Builder().withSilent(true);
		//ChromeDriverService build = withSilent.build();
		//ChromeDriver driver1 = new ChromeDriver(build);
	
	driver = new ChromeDriver();
	driver.get("http://karehealth.menpaniproducts.com/admin/auth/login");
	driver.manage().window().maximize();
	}

	@Given("he enter the username")
	public void he_enter_the_username() {
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	}

	@Given("he enter the password")
	public void he_enter_the_password() {
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
	}

	@Then("he login succesfully")
	public void he_login_succesfully() {
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	}

	@When("user click on total order")
	public void user_click_on_total_order() {
		
	driver.findElement(By.xpath("//p[contains(text(),'Total Orders')]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("he click on filter")
	public void he_click_on_filter() {
	driver.findElement(By.xpath("//label[@title='Filter']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("he enter customer name")
	public void he_enter_customer_name() {
	driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[2]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	@Then("he can view the customer details")
	public void he_can_view_the_customer_details() {
	driver.findElement(By.xpath("//button[@ class='btn btn-info submit btn-sm']")).click();
	}


}
