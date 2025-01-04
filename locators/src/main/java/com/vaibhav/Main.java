package com.vaibhav;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main (String[] args)throws InterruptedException{
        WebDriver driver= new ChromeDriver ();
        driver.get("http:/www.rahulshettyacademy.com/locatorspractice");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername"));
        driver.findElement(By.id("inputUsername")).sendKeys("vaibhavsingh411@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
       System.out.println( driver.findElement(By.cssSelector("p.error")).getText());
       driver.findElement(By.partialLinkText("Forgot your password")).click();
       
       driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Vaibhav");
             driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vaibhavsingh411@gmail.com");
       //driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
       //driver.findElement(By.xpath("input[type='text']:nth-child(3)")).sendKeys("123@gmail.com");
       driver.findElement(By.xpath("//form/input[3]")).sendKeys("123496");
       Thread.sleep(5000);
       driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
      
       System.out.println(driver.findElement(By.cssSelector("form p")).getText());
       driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
           driver.findElement(By.id("inputUsername")).sendKeys("vaibhav");
       driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys("rahulshettyacademy");
      // driver.findElement(By.xpath("//input[@id='chkboxOne'])[1]")).click();
      driver.findElement(By.id("chkboxOne")).click();
       //driver.findElement(By.xpath("//button[contains(@class,'submit)]")).submit();
       driver.findElement(By.className("signInBtn")).click();
    }
}