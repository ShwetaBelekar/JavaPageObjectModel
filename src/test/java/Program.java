import Pages.EmployeeHomePage;
import Pages.EmployeePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Program
{
    public static void main(String[] args) throws InterruptedException
    {
        /*HashMap<Object, Object> chromePrefs = new HashMap<>();
        chromeprefs.put("credentials_enable_service", false);
        chromeprefs.put("profile.password_manager_enabled", false);
        chromePrefs.put("profile.password_manager_leak_detection", false);

        final ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", chromePrefs);

        driver = new ChromeDriver(chromeOptions);*/

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);


        LoginPage loginPageObj = new LoginPage();
        loginPageObj.LoginActions(driver);

        loginPageObj.VerifyUserInHomePage(driver);

        EmployeeHomePage employeeHomePageObj = new EmployeeHomePage();
        employeeHomePageObj.NavigateToEmployeesPage(driver);

        EmployeePage employeePageObj = new EmployeePage();
        employeePageObj.CreateEmployeeRecord(driver);

        employeePageObj.EditEmployeeRecord(driver);

        employeePageObj.DeleteEmployeeRecord(driver);






    }
}
