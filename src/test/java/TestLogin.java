import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLogin {
    public static void main(String[] args) {
        //  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //  WebDriver driver = new ChromeDriver();

        ChromeOptions chromeOpsions = new ChromeOptions();
        chromeOpsions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOpsions);
        driver.get("https://parabank.parasoft.com");
        WebElement LinkRegister = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a"));
        LinkRegister.click();

        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("tester rifat");

        WebElement lastName = driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("QA software");


    }
}

