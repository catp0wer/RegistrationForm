package Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationForm {


    By firstName = By.id("name_3_firstname");
    By lastName = By.id("name_3_lastname");
    By singleMaritalStatus = By.xpath("//input[@value='single']");
    By marriedMaritalStatus = By.xpath("//input[@value='married']");
    By divorcedMaritalStatus = By.xpath("//input[@value='divorced']");
    By danceHobby = By.xpath("//input[@value='dance']");
    By readingHobby = By.xpath("//input[@value='dance']");
    By cricketHobby = By.xpath("//input[@value='cricket']");
    By countryDropDown = By.id("dropdown_7");
    By monthBirthday =By.id("mm_date_8");
    By dayBirthday = By.id("dd_date_8");
    By yearBirthday = By.id("yy_date_8");
    By phoneNumber = By.id("phone_9");
    By userName = By.id("username");
    By email = By.id("email_1");
    By aboutYourself = By.id("description");
    By password = By.id("password_2");
    By confirmPassword = By.id("confirm_password_password_2");
    By Submit = By.name("pie_submit");

    public void fillFirstName (String name, WebDriver driver){
        driver.findElement(firstName).sendKeys(name);
    }
    public void fillLastName (String name, WebDriver driver){
        driver.findElement(lastName).sendKeys(name);
    }
    public void clickSubmit(WebDriver driver){
        driver.findElement(Submit).click();
    }

    public void login(String name,String lastName,WebDriver driver) {
        fillFirstName(name, driver);
        fillLastName(lastName, driver);
        clickSubmit(driver);
        //   assert driver.getPageSource().contains(SubmitMessage);
    }


}