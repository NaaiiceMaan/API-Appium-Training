package com.capgemini.ddt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BuyOrderPOM {
	static WebDriver driver;
	Actions action;

	public BuyOrderPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		action = new Actions(driver);

	}
	
	@FindBy(how = How.LINK_TEXT, using="Sign in")
	@CacheLookup
	public static WebElement signinbtn;
	
	@FindBy(how = How.ID, using="email")
	@CacheLookup
	public static WebElement emailbox;

	@FindBy(how = How.ID, using="passwd")
	@CacheLookup
	public static WebElement passbox;

	@FindBy(how = How.CSS, using="#SubmitLogin>span")
	@CacheLookup
	public static WebElement loginbtn;
	
	@FindBy(how = How.CSS, using=".sfHover>.sf-with-ul")
	@CacheLookup
	public static WebElement womentab;
	
	@FindBy(how = How.LINK_TEXT, using="T-shirts")
	@CacheLookup
	public static WebElement tshirttab;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"center_column\"]/ul/li/div")
	@CacheLookup
	public static WebElement product;
	
	@FindBy(how = How.CSS, using="link_view>span")
	@CacheLookup
	public static WebElement morebtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"quantity_wanted_p\"]/a[2]")
	@CacheLookup
	public static WebElement addqtybtn;
	
	@FindBy(how = How.TAG_NAME, using = "select")
	@CacheLookup
	public static WebElement sizeselect;
	
	@FindBy(how = How.ID, using = "color_14")
	@CacheLookup
	public static WebElement colorselect;
	
	@FindBy(how = How.NAME, using = "Submit")
	@CacheLookup
	public static WebElement addtocartbtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	@CacheLookup
	public static WebElement proceedbtn;
	
	public void toSigninPage() {
		driver.get("http://automationpractice.com/index.php");
		signinbtn.click();
		emailbox.sendKeys("alexanderfernandez161999@gmail.com");
		passbox.sendKeys("Alex@12345");
		loginbtn.click();
	}
	
	public void toWomenTshirt() {
		action.moveToElement(womentab).perform();
		tshirttab.click();
	}
	
	public void totshirtpage() {
		action.moveToElement(product).perform();
		morebtn.click();
	}
	
	public void toaddtocart() {
		addqtybtn.click();
		Select size = new Select(sizeselect);
		size.selectByVisibleText("L");
		colorselect.click();
		colorselect.submit();
	}
	
	public void proceedcheckout() {
		proceedbtn.click();
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		BuyOrderPOM bop = new BuyOrderPOM(driver);	
		bop.toSigninPage();
		bop.toWomenTshirt();
		bop.totshirtpage();
		bop.toaddtocart();
		bop.proceedcheckout();
		
	}
}
