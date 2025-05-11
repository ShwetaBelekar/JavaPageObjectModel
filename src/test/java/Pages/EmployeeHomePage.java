package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmployeeHomePage
{
    public void NavigateToEmployeesPage(WebDriver driver) throws InterruptedException, TimeoutException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try
        {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
        catch (TimeoutException e)
        {
            System.out.println("Alert not present within the specified time.");
        }

        WebElement administrationTab = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/a/span"));
        administrationTab.click();

        WebElement employeesOption = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/ul/li[2]/a"));
        employeesOption.click();
        Thread.sleep(3000);
    }
}
