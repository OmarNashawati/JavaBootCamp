package ThirdWeekHomework;

import java.util.HashMap;

public class THYReservationSys extends ReservationSystem {


    THYReservationSys(HashMap<String,String> userInfo){
        super(userInfo);
    }

    @Override
    public void makeReservation() {

        System.out.println("\n<<<THY rezervasyon sistemine hoşgeldiniz>>>\n");

        super.makeReservation();

    }

    @Override
    public String toString() {
        return "THY rezervasyon sistemi";
    }
}
