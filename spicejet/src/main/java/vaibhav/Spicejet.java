package vaibhav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Spicejet {

    public static void main(String[] args) throws InterruptedException {
        // Set ChromeOptions to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Pass the options to ChromeDriver
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.spicejet.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();

        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[contains(text(), 'Varanasi')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Udaipur')]")).click();

    }
}
