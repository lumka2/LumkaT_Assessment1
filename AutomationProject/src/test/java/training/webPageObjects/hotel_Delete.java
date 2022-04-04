package training.webPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class hotel_Delete {


    protected WebDriver driver;
    public hotel_Delete(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 10), this);
    }


    @FindBy (xpath = "//*[@id=\"order_id_text\"]")
    public WebElement searchOrder;

    @FindBy (xpath = "//*[@id=\"search_hotel_id\"]")
    public WebElement goBtn;

    @FindBy(xpath = "//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input")
    public WebElement deleteRadioBtn;

    @FindBy (xpath = "//*[@id=\"booked_form\"]/table/tbody/tr[3]/td/input[1]")
    public WebElement deleteBtn;

}
