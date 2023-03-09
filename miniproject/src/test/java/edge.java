import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class edge {
    @Test
    public void main()
    {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.get("https://facebook.com");
      driver.findElement(By.cssSelector("#email")).sendKeys("durbal008@gmail.com");
      driver.findElement(By.cssSelector("[name='pass']")).sendKeys("Durga@7789");
      driver.findElement(By.name("login")).click();
       System.out.println(driver.findElement(By.cssSelector(". _9ay7")).getText());
    }

}
