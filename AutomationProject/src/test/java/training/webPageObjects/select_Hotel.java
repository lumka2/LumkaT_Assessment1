package training.webPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class select_Hotel {

    protected WebDriver driver;
    public select_Hotel(WebDriver driver) {
          this.driver=driver;

        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 10), this);
    }

    @FindBy(xpath ="//*[@id=\"radiobutton_0\"]")
    public WebElement radioButton;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    public  WebElement continueBtn;
}
