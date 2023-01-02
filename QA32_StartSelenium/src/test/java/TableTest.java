import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;
    @Test
    public void tableCss() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");


        WebElement a = wd.findElement(By.cssSelector("#customers tr:nth-child(2) td:nth-child(2)"));
        WebElement a1 = wd.findElement(By.xpath("//*[text()='Maria Anders']"));
        WebElement a2 = wd.findElement(By.xpath("//*[@id='customers']//tr[2]/td[2]"));
    }
}
