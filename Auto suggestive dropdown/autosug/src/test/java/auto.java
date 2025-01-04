
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.rahulshettyacademy.com/dropdownsPractise");
        driver.manage().window().maximize();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys(a);
        Thread.sleep(1000);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                System.out.println(option.getText());
                break;

            }

        }

    }
}
