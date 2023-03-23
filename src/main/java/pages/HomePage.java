package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    WebDriverWait wait;
    private By countriesLink = By.id("country-name");
    private By Emirates = By.xpath("//a[@id='ae']");
    private By Jordan = By.xpath("//a[@id='jo']");
    private By Tunisia = By.xpath("//a[@id='tn']");

    private By packageType = By.xpath("//div[@class='trial-description']/h4");

    private By cost = By.xpath("//div[@class='trial-cost']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void openCountryList()
    {
        driver.findElement(countriesLink).click();
    }

    public void selectEmirates()
    {
        driver.findElement(Emirates).click();
    }

    public void selectJordan()
    {
        driver.findElement(Jordan).click();
    }

    public void selectTunisia()
    {
        driver.findElement(Tunisia).click();
    }


    public String getPackageType(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(packageType));
        return driver.findElement(packageType).getText();
    }

    public String getCost(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cost));
        return driver.findElement(cost).getText();
    }

}
