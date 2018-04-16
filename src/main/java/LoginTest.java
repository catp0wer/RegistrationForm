import Pom.RegistrationForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver = new FirefoxDriver();

    @BeforeMethod
    public void setup() {
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demoqa.com/registration/");
    }

    @Test(dataProvider = "LogInData", dataProviderClass = DataProvider_Repository.class)
    public void testLoginWorks(String name, String name2) {
        RegistrationForm regF = new RegistrationForm();
        regF.login(name, name2,driver);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


