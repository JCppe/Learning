package LearningFramework;
/* Account information for http://automationpractice.com/index.php
johnnycarverp@gmail.com
ao@0fAW21d
John Test 10/10/1990
111 adada, Raleigh, NC, 27602
112-211-2121
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
public static void main(String[] args) {
    int count = 0;
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\John\\Prog\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();

    try {
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(2000);
    }
    catch(Exception e){
        System.out.println("Exception Message: " + e.getMessage());
        e.printStackTrace();
    }

    do {
        try {
            driver.findElement(By.xpath("//div[contains(concat(' ', normalize-space(@class), ' '), ' header_user_info ')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("johnnycarverp@gmail.com");
            driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("ao@0fAW21d");
            driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[contains(concat(' ', normalize-space(@class), ' '), ' home ')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//img[contains(concat(' ', normalize-space(@title), ' '), ' Printed Summer Dress ')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' exclusive ')]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//a[contains(concat(' ', normalize-space(@class), ' '), ' btn btn-default button button-medium ')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//i[contains(concat(' ', normalize-space(@class), ' '), ' icon-trash ')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[contains(concat(' ', normalize-space(@class), ' '), ' logout ')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[contains(concat(' ', normalize-space(@class), ' '), ' home ')]")).click();
            Thread.sleep(2000);

            count++;
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
            e.printStackTrace();
        }
    } while (count < 5);

	}	
}