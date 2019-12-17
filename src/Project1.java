

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Project1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "D:Selenium\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get( "file:///C:/Users/tunca/IdeaProjects/selenium/src/day3/resources/form.html" );
        driver.get( "https://www.techlistic.com/p/selenium-practice-form.html");
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("T.James");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Aktepe");
        List<WebElement> gender = driver.findElements( By.name( "sex" ) );
        WebElement secondElementOfGender = gender.get( 0 );
        secondElementOfGender.click();
        List<WebElement>experience=driver.findElements(By.name("exp"));
        experience.get(3).click();
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("12/16/2019");
        WebElement profession = driver.findElement(By.id("profession-1"));
        profession.click();
        WebElement Automation = driver.findElement(By.id("tool-2"));
        Automation.click();
        WebElement continent = driver.findElement(By.name("continents"));
        Select dropdown = new Select(continent);
        dropdown.selectByIndex(5);
        Select select = new Select(driver.findElement(By.id("selenium_commands")));
        List<WebElement> select31Options = select.getOptions();
        for (WebElement option : select31Options) {
            select.selectByVisibleText(option.getText());
        }
    }}
