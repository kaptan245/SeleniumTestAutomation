import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class ParabankTestNG {
      private WebDriver driver;

   @BeforeTest
    public void setup(){
    ChromeOptions chromeOpsions = new ChromeOptions();
    chromeOpsions.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(chromeOpsions);
    driver.get("https://parabank.parasoft.com");
    }
    @Test
    public void TC0001(){
     WebElement userName = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
     userName.sendKeys("TEST user");

     WebElement password = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input"));
          password.sendKeys("123456");

    driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();



    }
    @Test
    public void TC0002(){
     WebElement userName = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
     userName.sendKeys("TEST user");

     WebElement password = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input"));
     password.sendKeys("123456");

     driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();


    }
@AfterTest
    public void after(){
     driver.quit();
    }

}
