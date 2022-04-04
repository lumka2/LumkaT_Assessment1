package training.webPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class hotel_Logout {

    protected WebDriver driver;
    public hotel_Logout(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 10), this);
    }

    @FindBy(xpath ="//*[@id=\"logout\"]")
    public WebElement logout;

    @FindBy(xpath = "/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")
    public  WebElement click;

}
