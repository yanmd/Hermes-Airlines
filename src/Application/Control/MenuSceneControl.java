package Application.Control;

import Presentation.BookingScene;
import Presentation.MenuScene;
import javafx.scene.control.*;
import javafx.stage.Stage;


/**
 * Created by Administrator on 5/19/2016.
 */
public class MenuSceneControl {

    //fields
    private static Stage window;
    private static Button bookingsB, customersB, flightsB, planesB, exitB;

    //initialization of fields
    public static void initialize(){
        //stage
        window = MainControl.getWindow();

        //bookingsB
        bookingsB = MenuScene.getBookingsB();
        bookingsB.setOnAction(e -> handle_bookingsB());

        //customesrB
        customersB = MenuScene.getCustomersB();
        customersB.setOnAction(e -> handle_customersB());

        //flightsB
        flightsB = MenuScene.getFlightsB();
        flightsB.setOnAction(e -> handle_flightsB());

        //planesB
        planesB = MenuScene.getPlanesB();
        planesB.setOnAction(e -> handle_planesB());

        //exitB
        exitB = MenuScene.getExitB();
        exitB.setOnAction(e -> handle_exitsB());

    }

    //handle bookingsB
    public static void handle_bookingsB(){
        MainControl.showViewBookingScene();
    }

    //handle customersB
    public static void handle_customersB(){
        MainControl.showViewCustomerScene();
    }

    //handle flightsB
    public static void handle_flightsB(){
        MainControl.showFlightsScene();
    }


    //handle planesB
    public static void handle_planesB(){
        MainControl.showPlaneScene();
    }

    //handle exitB
    public static void handle_exitsB(){
        window.close();
    }

}
