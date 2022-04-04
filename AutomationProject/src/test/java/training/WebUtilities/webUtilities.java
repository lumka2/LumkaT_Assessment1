package training.WebUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class webUtilities {

    protected static WebDriver driver;
    public static WebDriver getWebDriver(){

        return driver;
    }//end of method

    public void setWebDriver(WebDriver DriverTest){

        driver = DriverTest;
    }//end of method

    public WebDriver initializeWebDriver(String sBrowser) {
        switch (sBrowser.toUpperCase()) {

            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "MICROSOFT EDGE":
                WebDriverManager.firefoxdriver().setup();
                driver = new EdgeDriver();
            case "IE":
                WebDriverManager.chromiumdriver().setup();
                driver = new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }//end of method


    public  void navigate(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);

    }//end of method
}
