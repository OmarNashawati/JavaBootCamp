package ThirdWeekHomework;

import java.util.HashMap;

public class PegasusReservationSys extends ReservationSystem {


    PegasusReservationSys(HashMap<String,String> userInfo){
        super(userInfo);
    }

    @Override
    public void makeReservation() {

        System.out.println("\n<<<Pegsus rezervasiyon sistemine hoşgeldiniz>>>\n");

        super.makeReservation();

    }

    @Override
    public void selectSeat() {
        if(getSelectedClass().getClassTypeCode() == 1){
            super.selectSeat();
        }else {
            selectSeatRandomly();
        }
    }

    public void selectSeatRandomly(){
        int randomSeat = (int)(Math.random()*5)+6;

        if (isThereAvailableSeatOnEconomyClass()){
            if(getSeatsMap().get(randomSeat)){
                setSelectedSeat(randomSeat);
            }else {
                selectSeatRandomly();
            }

            getSeatsMap().put(randomSeat,false);

        }else{
            System.out.println("Üzgünüz Ekonomi-Class'ta boş koltuk bulunmamaktadır, Business-Class seçiniz");
            makeReservation();
        }

    }

    @Override
    public String toString() {
        return "Pegsus rezervasyon sistemi";
    }
}
