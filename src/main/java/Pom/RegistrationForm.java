package Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationForm {

    public WebDriver driver;

    public static WebElement firstName(WebDriver driver) {
        return driver.findElement(By.id("name_3_firstname"));
    }
    public static WebElement lastName(WebDriver driver) {
        return driver.findElement(By.id("name_3_lastname"));
    }
    public static WebElement singleMaritalStatus(WebDriver driver){
        return driver.findElement(By.xpath("//input[@value='single']"));
    }
    public static WebElement marriedMaritalStatus(WebDriver driver){
        return driver.findElement(By.xpath("//input[@value='married']"));
    }
    public static WebElement divorcedMaritalStatus(WebDriver driver){
        return driver.findElement(By.xpath("//input[@value='divorced']"));
    }
    public static WebElement danceHobby(WebDriver driver){
        return driver.findElement(By.xpath("//input[@value='dance']"));
    }
    public static WebElement readingHobby(WebDriver driver){
        return driver.findElement(By.xpath("//input[@value='dance']"));
    }
    public static WebElement cricketHobby(WebDriver driver){
        return driver.findElement(By.xpath("//input[@value='cricket']"));
    }
    public static WebElement countryDropDown(WebDriver driver){
        return driver.findElement(By.id("dropdown_7']"));
    }

    public static WebElement monthBirthday(WebDriver driver){
        return driver.findElement(By.id("mm_date_8']"));
    }
    public static WebElement dayBirthday(WebDriver driver){
        return driver.findElement(By.id("dd_date_8']"));
    }
    public static WebElement yearBirthday(WebDriver driver){
        return driver.findElement(By.id("yy_date_8']"));
    }
    public static WebElement phoneNumber(WebDriver driver){
        return driver.findElement(By.id("phone_9']"));
    }
    public static WebElement userName(WebDriver driver){
        return driver.findElement(By.id("username']"));
    }
    public static WebElement email(WebDriver driver){
        return driver.findElement(By.id("email_1']"));
    }
    public static WebElement aboutYourself(WebDriver driver){
        return driver.findElement(By.id("description']"));
    }
    public static WebElement password(WebDriver driver){
        return driver.findElement(By.id("password_2']"));
    }
    public static WebElement confirmPassword(WebDriver driver){
        return driver.findElement(By.id("confirm_password_password_2']"));
    }
    public static WebElement Submit(WebDriver driver){
        return driver.findElement(By.name("pie_submit']"));
    }
}
