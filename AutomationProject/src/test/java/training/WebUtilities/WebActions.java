package training.WebUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class WebActions {

    public static void clickObject(WebElement element, WebDriver driver) {
        //check if is display
        //wait for different circumstances
        try {
            if (element.isDisplayed()) {
                Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(5))
                        .pollingEvery(Duration.ofMillis(1000))
                        .ignoring(WebDriverException.class);
                wait.until(ExpectedConditions.elementToBeClickable(element));
                element.click();
            }
        } catch (Exception e) {
            System.out.println(element + "Not found");
        }

    }//end of method

    public static void selectObject(WebElement selElement,WebDriver driver, String selectBy, Object selectValue) {
        Select mySelect = new Select(selElement);
        try {
            if (selElement.isDisplayed()) {
                Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(5))
                        .pollingEvery(Duration.ofMillis(1000))
                        .ignoring(WebDriverException.class);
                wait.until(ExpectedConditions.elementToBeClickable(selElement));

                switch (selectBy.toUpperCase()) {
                    case "INDEX":
                        mySelect.selectByIndex((Integer) selectValue);
                        break;
                    case "SELECTBYVISIBLETEXT":
                        mySelect.selectByVisibleText((String) selectValue);
                        break;
                    case "SELECTBYVALUE":
                        mySelect.selectByValue((String) selectValue);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(selElement + "Not found");
        }
    }//end of method

    public static void passData(WebElement textbox, WebDriver driver, String data) {

        try {
            if (textbox.isDisplayed()) {
                Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(5))
                        .pollingEvery(Duration.ofMillis(1000))
                        .ignoring(WebDriverException.class);
                wait.until(ExpectedConditions.elementToBeClickable(textbox));
                textbox.clear();
                textbox.sendKeys(data);
            }
        } catch (Exception e) {
            System.out.println(textbox + "Not found");
        }
    }//end of method
}
