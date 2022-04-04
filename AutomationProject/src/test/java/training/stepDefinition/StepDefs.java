package training.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import training.PageObjects.WebFunctions;
import training.WebUtilities.webUtilities;
import training.data.data;

import java.io.IOException;
import java.sql.ResultSet;

public class StepDefs {
    webUtilities web = new webUtilities();
    WebFunctions adactin = new WebFunctions();

    data connect = new data();
    //ResultSet set;

   @Given("^a user launches \"([^\"]*)\" and navigates to the Adactin web page \"([^\"]*)\"$")
    public void a_user_launches_and_navigates_to_the_Adactin_web_page(String arg1,String arg2) throws InterruptedException {
        web.initializeWebDriver(arg1);
        web.navigate(arg2);
    }

    @When("^a user enters the \"([^\"]*)\" and \"([^\"]*)\" and clicks login$")
    public void a_user_enters_the_and_and_clicks_login(String arg1, String arg2) {
        adactin.login_Hotel(webUtilities.getWebDriver(), arg1, arg2);

    }

    @And("^a user populates fields in the search page and clicks continue$")
    public void a_user_populates_fields_in_the_search_page_and_clicks_continue() throws Exception {
       ResultSet set;

        try {
            set = connect.ConnectAndQuerySQL("jdbc:mysql://localhost:3306/adactin","root","root","Select * from dataexcel");
            int iRow = connect.rowCount(set);
            for (int i=1;i<=iRow;i++) {
                if (set.next()) {
                    adactin.search_Hotel(webUtilities.getWebDriver(),set);
                }
            }
            set.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @And("^a user selects a hotel from the selection page and click continue$")
    public void a_user_selects_a_hotel_from_the_selection_page_and_click_continue() {
        adactin.select_Hotel(webUtilities.getWebDriver());

    }

    @When("^a user populates the book with valid data and clicks confirm$")
    public void a_user_populates_the_book_with_valid_data_and_clicks_confirm() throws IOException {
        ResultSet set;

       try{
           set = connect.ConnectAndQuerySQL("jdbc:mysql://localhost:3306/adactin","root","root","Select * from dataexcel");
           int iRow = connect.rowCount(set);
           for (int i=1;i<=iRow;i++) {
               if (set.next()) {
                   adactin.book_Hotel(webUtilities.getWebDriver(),set);
               }
           }
           set.close();
       }catch (Exception e){
           System.out.println(e.getMessage());

       }

    }

    @Then("^a order is generated and the booking is successful$")
    public void a_order_is_generated_and_the_booking_is_successful() throws IOException, InterruptedException {
        adactin.order_Num_Generated(webUtilities.getWebDriver());

    }


    @And("^Clicks on Booked Itinerary$")
    public void clicks_on_Booked_Itinerary() throws InterruptedException {
         adactin.booked_Itinerary(webUtilities.getWebDriver());

    }

    @When("^enters order number   for a recently booked existing order and clicks on search$")
    public void entersOrderNumberForARecentlyBookedExistingOrderAndClicksOnSearch() throws IOException {
        try {
            adactin.search_Order_Number(webUtilities.getWebDriver());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @When("^a booking record is displayed on the table,the user selects the booking radio button$")
    public void aBookingRecordIsDisplayedOnTheTableTheUserSelectsTheBookingRadioButton() {
        adactin.select_Hotel(webUtilities.getWebDriver());
    }

    @And("^a user clicks on cancel selected$")
    public void aUserClicksOnCancelSelected() {

        adactin.cancel_Order(webUtilities.getWebDriver());
    }

    @Then("^a confirm cancel popup message appears$")
    public void aConfirmCancelPopupMessageAppears() {

        adactin.AlertMessage(webUtilities.getWebDriver());
    }

    @When("^a user clicks on ok$")
    public void aUserClicksOnOk() {

        adactin.ClicksOnAlertMessage(webUtilities.getWebDriver());
    }

    @Then("^booking is successfully cancelled$")
    public void bookingIsSuccessfullyCancelled() {

        adactin.SuccessfullyCancelled(webUtilities.getWebDriver());
    }

    @Then("^a user clicks logout$")
    public void a_user_clicks_logout() {

        adactin.logout(webUtilities.getWebDriver());
    }

    @Then("^a user is successfully logged out$")
     public void a_user_is_successfully_logged_out() throws InterruptedException {
        adactin.logoutSuccessful(webUtilities.getWebDriver());
    }

}
