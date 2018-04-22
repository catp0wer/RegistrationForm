package Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {
    final String SingleMarStatus = "Single";
    final String MarriedMarStatus = "Married";
    final String DivorcedMarStatus = "Divorced";
    final String DanceHobby = "Dance";
    final String ReadingHobby = "Reading";
    final String CricketHobby = "Cricket";
    final String MonthDataFinal = "Month";

    By firstName = By.id("name_3_firstname");
    By lastName = By.id("name_3_lastname");
    By singleMaritalStatus = By.xpath("//input[@value='single']");
    By marriedMaritalStatus = By.xpath("//input[@value='married']");
    By divorcedMaritalStatus = By.xpath("//input[@value='divorced']");
    By danceHobby = By.xpath("//input[@value='dance']");
    By readingHobby = By.xpath("//input[@value='reading']");
    By cricketHobby = By.xpath("//input[@value='cricket ']");
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
    By ConfirmationMessage = By.xpath("//p[@class='piereg_message']");

    public void fillFirstName (String name, WebDriver driver){
        driver.findElement(firstName).sendKeys(name);
    }
    public void fillLastName (String name, WebDriver driver){ driver.findElement(lastName).sendKeys(name);}
    public void selectMaritalStatus(String marStatus, WebDriver driver){

        switch(marStatus){
            case SingleMarStatus:
                driver.findElement(singleMaritalStatus).click();
                break;
            case MarriedMarStatus:
                driver.findElement(marriedMaritalStatus).click();
                break;
            case DivorcedMarStatus:
                driver.findElement(divorcedMaritalStatus).click();
                break;
            default:
                break;
        }
    }

    public void selectHobby(String hobby, WebDriver driver) {
        switch (hobby) {
            case DanceHobby:
                driver.findElement(danceHobby).click();
                break;
            case ReadingHobby:
                driver.findElement(readingHobby).click();
                break;
            case CricketHobby:
                driver.findElement(cricketHobby).click();
                break;
            default:
                break;
        }
    }

    public void selectCountry(String country, WebDriver driver){
       Select dr = new Select(driver.findElement(countryDropDown));
       dr.selectByVisibleText(country);

    }

    public void selectMonth(String month, WebDriver driver ){
        Select monthData = new Select(driver.findElement(monthBirthday));
        monthData.selectByVisibleText(month);



    }
    public void selectDay(String day, WebDriver driver ){
        Select dayData = new Select(driver.findElement(dayBirthday));
        dayData.selectByVisibleText(day);
    }
    public void selectYear(String year, WebDriver driver ){
        Select yearData = new Select(driver.findElement(yearBirthday));
        yearData.selectByVisibleText(year);
    }

    public void fillPhoneNumber(String number,WebDriver driver){
        driver.findElement(phoneNumber).sendKeys(number);
    }

    public void fillUserName(String username, WebDriver driver){
        driver.findElement(userName).sendKeys(username);
    }
    public void fillEmail(String emailAddress, WebDriver driver){
        driver.findElement(email).sendKeys(emailAddress);
    }
    public void fillAboutYourself(String yourText, WebDriver driver){
        driver.findElement(aboutYourself).sendKeys(yourText);
    }
    public void fillPassword(String pass, WebDriver driver){
        driver.findElement(password).sendKeys(pass);
    }
    public void fillConfirmpassword(String pass2, WebDriver driver){
        driver.findElement(confirmPassword).sendKeys(pass2);
    }
    public String getMessageText(WebDriver driver){
        return driver.findElement(ConfirmationMessage).getText();
    }
    public void clickSubmit(WebDriver driver){
        driver.findElement(Submit).click();
    }

    public void login(String name,String lastName,WebDriver driver,String marStatus,String hobby,String country,
                      String month,String day,String year,String number,String username,String emailAddress,
                      String yourText,String pass, String pass2) {
        fillFirstName(name, driver);
        fillLastName(lastName, driver);
        selectMaritalStatus(marStatus, driver);
        selectHobby(hobby,driver);
        selectCountry(country,driver);
        selectMonth(month,driver);
        selectDay(day,driver);
        selectYear(year,driver);
        fillPhoneNumber(number,driver);
        fillUserName(username,driver);
        fillEmail(emailAddress,driver);
        fillAboutYourself(yourText,driver);
        fillPassword(pass,driver);
        fillConfirmpassword(pass2,driver);
        clickSubmit(driver);
        getMessageText(driver);
    }


}