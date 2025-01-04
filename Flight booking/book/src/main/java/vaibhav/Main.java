package vaibhav;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Main {
    public static void main (String[] args)throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        WebElement staticDropdwon=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown= new Select(staticDropdwon);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=0;i<4;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='AMD']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
        driver.findElement(By.xpath("(//a[@value='BKK'])[2]")).click();
        


    }
}