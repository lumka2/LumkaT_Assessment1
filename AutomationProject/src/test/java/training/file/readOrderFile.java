package training.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class readOrderFile {

    public String readFile() {

        String orderNo = "";
        try {


            FileReader file = new FileReader("src/main/resources/orderNumber.txt");
            BufferedReader br = new BufferedReader(file);

            orderNo = br.readLine();
            System.out.println("The order number stored is : " + orderNo);

            br.close();
        } catch (Exception exception) {
            System.out.println("Oops error in reading file :" + exception.getMessage());
        }

        return orderNo;
    }

}
/**
 * Author : Lumka Thile
 * Class: readOrderFile
 * Method: readOrderFile()
 *
 * Method reads the order number stored in the .txt file and passes it in a variable then return the variable
 * returns variable of type string (which contains the value from txt file.)
 */
