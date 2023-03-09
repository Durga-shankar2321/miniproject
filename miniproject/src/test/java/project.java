import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class project {
    @Test
   public void test()
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("id#email")).sendKeys("durbal008@gmail.com");
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("Durga@7789");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.findElement(By.cssSelector(". _9ay7")).getText());


    }
}