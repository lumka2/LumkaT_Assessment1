package training.file;

import training.WebUtilities.webUtilities;
import training.webPageObjects.hotel_Booking;

import java.io.FileWriter;
import java.time.Duration;

public class orderNumFile extends webUtilities {


    public  void passOrderNumber(){

        try {
            hotel_Booking booking = new hotel_Booking(driver);
            String order;

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            if (booking.orderno.isDisplayed()) {
                order = booking.orderno.getAttribute("value");
                System.out.println("Booking successful..Order number : " + order);

                FileWriter writer = new FileWriter("src/main/resources/orderNumber.txt");
                writer.write(order);
                writer.close();
            } else {
                System.out.println("Booking unsuccessful");
            }


        }
        catch (Exception exception){

        }
    }
}
/**
 * Author : Lumka Thile
 * Class : orderNumFile
 * Inherits the webUtilities class
 * Method: passOrderNumber()
 *
 * Method confirms booking was successful
 * else booking was not successful if the orderNumber webElement is not displayed
 * Method stores the number generated from the booking process and stores it in to a .txt file
 *
 *
 */
