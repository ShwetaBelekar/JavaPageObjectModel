package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeePage
{
    public void CreateEmployeeRecord(WebDriver driver) throws InterruptedException {
        WebElement createButton = driver.findElement(By.xpath("//*[@id=\"container\"]/p/a"));
        createButton.click();


        WebElement nameTextbox = driver.findElement(By.id("Name"));
        nameTextbox.sendKeys("Nisha");

        WebElement usernameTextbox = driver.findElement(By.id("Username"));
        usernameTextbox.sendKeys("Nisha123");

        WebElement contactTextbox = driver.findElement(By.id("ContactDisplay"));
        contactTextbox.sendKeys("Home001");
        Thread.sleep(3000);

        WebElement passwordTextbox = driver.findElement(By.id("Password"));
        passwordTextbox.sendKeys("Moon001!");

        WebElement retypePasswordTextbox = driver.findElement(By.id("RetypePassword"));
        retypePasswordTextbox.sendKeys("Moon001!");

        WebElement isAdminTickbox = driver.findElement(By.id("IsAdmin"));
        isAdminTickbox.click();
        Thread.sleep(2000);

        WebElement vehicleTextbox = driver.findElement(By.xpath("//*[@id=\"UserEditForm\"]/div/div[7]/div/span[1]/span/input"));
        vehicleTextbox.sendKeys("Car");

        WebElement groupsTextbox = driver.findElement(By.xpath("//*[@id=\"UserEditForm\"]/div/div[8]/div/div/div[1]"));
        groupsTextbox.click();
        Thread.sleep(3000);

        WebElement icOption = driver.findElement(By.xpath("//*[@id=\"groupList_listbox\"]/li[73]"));
        icOption.click();


        WebElement saveButton = driver.findElement(By.id("SaveButton"));
        saveButton.click();
        Thread.sleep(7000);

        WebElement backToListButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/a"));
        backToListButton.click();
        Thread.sleep(3000);

        //driver.navigate().refresh();

        WebElement goToTheLastPageButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[4]/a[4]/span"));
        goToTheLastPageButton.click();
        Thread.sleep(5000);

        WebElement newName = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));

        if (newName.getText().equals("Nisha"))
        {
            System.out.println("New Name record created Successfully!");
        }
        else
        {
            System.out.println("New name record has not been created!");
        }

    }
    public void EditEmployeeRecord(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        WebElement lastPageButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[4]/a[4]/span"));
        lastPageButton.click();


        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr/td[3]/a[1]"));
        editButton.click();
        Thread.sleep(2000);

        WebElement naameTextbox = driver.findElement(By.id("Name"));
        naameTextbox.clear();
        naameTextbox.sendKeys("Asha");
        Thread.sleep(2000);

        WebElement saveButton = driver.findElement(By.id("SaveButton"));
        saveButton.click();

        WebElement baackToListButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/a"));
        baackToListButton.click();
        Thread.sleep(3000);

        WebElement laastPageButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[4]/a[4]/span"));
        laastPageButton.click();

        WebElement name = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr/td[1]"));
        if (name.getText().equals("Asha"))
        {
            System.out.println("Asha is Present!");
        }
        else
        {
            System.out.println("Asha is not Present!");
        }

    }
    public void DeleteEmployeeRecord(WebDriver driver) throws InterruptedException {
        WebElement lastPageButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[4]/a[4]/span"));
        lastPageButton.click();
        Thread.sleep(2000);

        WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr/td[3]/a[2]"));
        deleteButton.click();
        driver.switchTo().alert().accept();

        WebElement llaasstPageButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[4]/a[4]/span"));
        llaasstPageButton.click();

        WebElement naame = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr/td[1]"));

        if (naame.getText().equals("Asha"))
        {
            System.out.println("Asha is not present!");
        }
        else
        {
            System.out.println("Asha is present!");
        }
    }
}
