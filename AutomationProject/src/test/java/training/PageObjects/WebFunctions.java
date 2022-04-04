package training.PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import training.WebUtilities.WebActions;
import training.WebUtilities.webUtilities;
import training.file.orderNumFile;
import training.file.readOrderFile;
import training.report.reporting;
import training.webPageObjects.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebFunctions extends WebActions {


    public void login_Hotel(WebDriver driver, String Username, String Password) {
        hotel_Login log = new hotel_Login(driver);
        reporting report = new reporting();

        try {

            passData(log.txtUsernme, driver, Username);
            passData(log.txtPassword, driver, Password);
            clickObject(log.btnLogin, driver);

            if (!driver.getCurrentUrl().contains("SearchHotel")) {
                System.out.println("Invalid Login details or Your Password might have expired.");

            } else {
                System.out.println("Logged In Successfully.");
            }

        } catch (Exception e) {
            System.out.println("Login unsuccessful,Errors" + e.getMessage());
            Assert.fail();
        }
    }//end of method


    public void search_Hotel(WebDriver driver, ResultSet rs) {

        hotel_Search search = new hotel_Search(driver);
        try {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            selectObject(search.location, driver, "selectByVisibleText", rs.getString("Location"));
            selectObject(search.hotels, driver, "selectByVisibleText", rs.getString("Hotels"));
            selectObject(search.room_type, driver, "selectByVisibleText", rs.getString("RoomType"));
            selectObject(search.room_no, driver, "selectByVisibleText", rs.getString("NumberOfRooms"));
            passData(search.check_in_date, driver, rs.getString("CheckInDate"));
            passData(search.check_out_date, driver, rs.getString("CheckOutDate"));
            selectObject(search.adults, driver, "selectByVisibleText", rs.getString("AdultsPerRoom"));
            selectObject(search.children, driver, "selectByVisibleText", rs.getString("ChildrenPerRoom"));
            clickObject(search.submit, driver);

            if (!driver.getCurrentUrl().contains("SelectHotel")) {
                System.out.println("Invalid hotel search details.");
            } else {
                System.out.println("Searched Successfully.");
            }

        } catch (Exception e) {
            System.out.println("search was unsuccessful,Errors" + e.getMessage());

        }
    }//end of method


    public void select_Hotel(WebDriver driver) {
        select_Hotel selectObj = new select_Hotel(driver);

        try {
            clickObject(selectObj.radioButton, driver);
            clickObject(selectObj.continueBtn, driver);

        } catch (Exception e) {
            System.out.println("select hotel was unsuccessful,Errors" + e.getMessage());
            Assert.fail();
        }
    }//end of method


    public void book_Hotel(WebDriver driver, ResultSet set) throws IOException {
        hotel_Booking booking = new hotel_Booking(driver);

        try {
            Thread.sleep(4000);

            passData(booking.firstname, driver, set.getString("FirstName"));
            passData(booking.surname, driver, set.getString("LastName"));
            passData(booking.billing, driver, set.getString("BillingAddress"));
            passData(booking.account, driver, set.getString("CreditCardNumber"));
            selectObject(booking.account_type, driver, "selectByVisibleText", set.getString("CreditCardType"));
            selectObject(booking.month, driver, "selectByVisibleText", set.getString("ExpiryDateMonth"));
            selectObject(booking.year, driver, "selectByVisibleText", set.getString("ExpiryDateYear"));
            passData(booking.cvv, driver, set.getString("CVVNumber"));
            clickObject(booking.bookNowButton, driver);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end of method


    public void order_Num_Generated(WebDriver driver) {
        orderNumFile numFile = new orderNumFile();
        numFile.passOrderNumber();
    }//end of method


    public void booked_Itinerary(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);

        hotel_Itinerary item = new hotel_Itinerary(driver);

        try {
            item.bookedItinerary.click();
        } catch (Exception e) {
            System.out.println("Oops :" + e.getMessage());
        }
    }//end of method


    public void search_Order_Number(WebDriver driver) throws IOException, InterruptedException {

        hotel_Delete delete = new hotel_Delete(driver);
        readOrderFile readObj = new readOrderFile();
        String orderNo = null;


        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            orderNo = readObj.readFile();

            passData(delete.searchOrder, driver, orderNo);
            clickObject(delete.goBtn, driver);

        } catch (Exception e) {

            System.out.println(" Oops :" + e.getMessage());
        }

    }//end of method


    public void cancel_Order(WebDriver driver) {
        hotel_Delete delete = new hotel_Delete(driver);

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            clickObject(delete.deleteRadioBtn, driver);
            clickObject(delete.deleteBtn, driver);

        } catch (Exception e) {

            System.out.println("Oops  :" + e.getMessage());

        }

    }//end of method


    public void AlertMessage(WebDriver driver) {

        String getText = driver.switchTo().alert().getText();
        System.out.println(getText);
        System.out.println("popup message appears");

    }//end of method


    public void ClicksOnAlertMessage(WebDriver driver) {

        Alert alert = driver.switchTo().alert();
        String getText = driver.switchTo().alert().getText();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if (getText.equalsIgnoreCase("Are you sure want to Cancel Selected?.")) {
            alert.accept();
            System.out.println("You accepted alert");
        } else {
            alert.dismiss();
            System.out.println("You dismissed alert");
        }

    }//end of method


    public void SuccessfullyCancelled(WebDriver driver) {
        hotel_Confirm_delete del = new hotel_Confirm_delete(driver);
        try {
            Thread.sleep(3000);
            if (del.DeleteConfirmation.isDisplayed()) {
                System.out.println("Booking has been successfully cancelled.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }//end of method


    public void logout(WebDriver driver) {
        hotel_Logout logout = new hotel_Logout(driver);

        try {
            if (logout.logout.isDisplayed()) {
                Thread.sleep(3000);
                clickObject(logout.logout, driver);
                System.out.println("Successfully logged out!!");
            } else {
                System.out.println("Oops something went wrong cannot log out!!!!!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//end of method


    public void logoutSuccessful(WebDriver driver) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webUtilities.getWebDriver().quit();

    }//end of method


}
/***
 * Author: Lumka Thile
 * Class: WebFunctions
 * Methods: login_Hotel()
 *
 *
 *         search_Hotel()
 *
 *
 *         select_Hotel()
 *
 *
 *         book_Hotel()
 *
 *
 *         order_Num_Generated()
 *
 *
 *         booked_Itinerary()
 *
 *
 *         search_Order_Number()
 *
 *
 *         cancel_Order()
 *
 *
 *         AlertMessage()
 *
 *
 *         ClicksOnAlertMessage()
 *
 *         SuccessfullyCancelled()
 *
 *         logout()
 *
 *
 *         logoutSuccessful
 *
 *
 *
 *
 */
