import Pom.RegistrationForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
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
    public void testLogin(String name, String name2,String marStatus,String hobby,String country,String month,
                               String day,String year,String number,String username,String emailAddress,String yourText,
                               String pass, String pass2, String mess) {
        RegistrationForm regF = new RegistrationForm();
        regF.login(name, name2,driver,marStatus,hobby,country,month,day,year,number,username,emailAddress,yourText,pass,pass2);
        Assert.assertEquals(regF.getMessageText(driver),mess);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


