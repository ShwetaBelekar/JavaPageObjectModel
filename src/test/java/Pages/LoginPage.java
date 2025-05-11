package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
    public void LoginActions(WebDriver driver) throws InterruptedException {
        driver.navigate().to("http://horse.industryconnect.io/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement usernameTextbox = driver.findElement(By.id("UserName"));
        usernameTextbox.sendKeys("hari");

        /*Wait.WaitToBeVisible(driver, "Id", "Password", 7);*/

        WebElement passwordTextbox = driver.findElement(By.id("Password"));
        passwordTextbox.sendKeys("123123");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[3]/input[1]"));
        loginButton.click();
        Thread.sleep(2000);

    }

    public void VerifyUserInHomePage(WebDriver driver)
    {
        WebElement hellohari = driver.findElement(By.xpath("//*[@id=\"logoutForm\"]/ul/li/a"));

        if (hellohari.getText().equals("Hello hari!"))
        {
            System.out.println("User has logged in successfully. Test passed!");
        }
        else
        {
            System.out.println("User has not logged in. Test failed!");
        }

    }

}
