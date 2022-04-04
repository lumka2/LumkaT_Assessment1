package training.report;


import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import training.WebUtilities.WebActions;
import training.WebUtilities.webUtilities;

public class reporting extends WebActions {


    public  void tearDown(Scenario scenario){

        if(scenario.isFailed()){

            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot)webUtilities.getWebDriver()).getScreenshotAs(OutputType.BYTES);
            // embed it in the report.
            scenario.embed(screenshot, "image/png");
        }
    }
}
