import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartPhoneBook {
    WebDriver wd;
    @Test
    public void startPhoneBook(){
        wd = new ChromeDriver();
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");// open
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");//open www + history
        wd.manage().window().maximize();
        // steps of test login Success:
        //open login form --- find loginbtn + click
        //WebElement el=wd.findElement(By.id("idel"));
        //List<WebElement> list = wd.findElements(By.id("idel"));
        //WebElement a = wd.findElement(By.tagName("a"));
        //List <WebElement> elements = wd.findElements(By.tagName("a"));
        //WebElement login = elements.get(2);
        //login.click();
        List<WebElement> list_a =wd.findElements(By.tagName("a"));
        List<WebElement> list_div =wd.findElements(By.tagName("div"));
        List<WebElement> list_body =wd.findElements(By.tagName("body"));
        WebElement cont = wd.findElement(By.className("container"));
        WebElement el12 = wd.findElement(By.linkText("LOGIN"));
        //fill email --- find email element+ click+clear+type email
        //fill password --- find password element+ click+clear+type password
        //click login btn --- find login btn + click
        //Assert
       //wd.close();// close one tab//


        //wd.quit();//close all tabs
    }
    @Test
    public void cssLocatorsTest(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");//open www + history
        wd.manage().window().maximize();

        wd.findElement(By.cssSelector(""));
        // by tag name
        wd.findElement(By.cssSelector("div"));
        // by class
        wd.findElement(By.cssSelector(".login_login__3EHKB"));
        wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id = 'root']"));
        // atribut
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.xpath("//*[@placeholder = 'Password']"));
        wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        wd.findElement(By.cssSelector("[placeholder *= 'ss']"));
        wd.findElement(By.xpath("//*[contains(@placeholder, 'ss')]"));
        wd.findElement(By.cssSelector("[placeholder ^= 'Pa']"));
        wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pa')]"));
        wd.findElement(By.cssSelector("[placeholder $= 'rd']"));

    }
}