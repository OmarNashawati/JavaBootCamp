package ThirdWeekHomework;

import java.util.HashMap;
import java.util.Scanner;

abstract class ReservationSystem {

    Scanner scanner = new Scanner(System.in);

    private FlyClassType selectedClass;
    private int selectedSeat;

    private HashMap<String,String> userInfo;
    private HashMap<Integer,Boolean> seatsMap = new HashMap<>();


    ReservationSystem(HashMap<String,String> userInfo){

        this.userInfo = userInfo;

        initSeatMap();

        makeReservation();

    }

    private void initSeatMap(){

        seatsMap.put(1,true);
        seatsMap.put(2,true);
        seatsMap.put(3,true);
        seatsMap.put(4,true);
        seatsMap.put(5,true);
        seatsMap.put(6,true);
        seatsMap.put(7,true);
        seatsMap.put(8,true);
        seatsMap.put(9,true);
        seatsMap.put(10,true);

    }


    public void makeReservation(){

       if(isThereAvailableSeatOnAirplane()){
           selectClassType();

           selectSeat();

           printTicket();

       }else {
           System.out.println("Üzgünüz Boş koltuk bulunmamaktadır");

           closeSystem();
       }

    }

    public void selectClassType(){

        System.out.print("Business class uçmak için 1'e, Ekonomi class için 2'e basınız : ");
        selectedClass = new FlyClassType(scanner.nextInt());

    }

    public void selectSeat(){

        if(selectedClass.getClassTypeCode() == 1){
            if( isThereAvailableSeatOnBusinessClass()){

                System.out.println("Aşağıdaki boş kultuklardan birini seçiniz : ");
                printAvailableBusinessSeats();

                selectedSeat = scanner.nextInt();
                seatsMap.put(selectedSeat,false);

            }else{
                System.out.println("Üzgünüz Business-Class'ta boş koltuk bulunmamaktadır, Ekonomi-Class seçiniz");
                makeReservation();
            }

        }else if(selectedClass.getClassTypeCode() == 2){
            if(isThereAvailableSeatOnEconomyClass()){

                System.out.println("Aşağıdaki boş kultuklardan birini seçiniz : ");
                printAvailableEconomySeats();

                selectedSeat = scanner.nextInt();
                seatsMap.put(selectedSeat,false);

            }else {
                System.out.println("Üzgünüz Ekonomi-Classta boş koltuk bulunmamaktadır, Business-Class seçiniz");
                makeReservation();
            }
        }

    }

    private void printAvailableBusinessSeats(){

        for(int i=1 ; i<=5 ; i++){
            if(seatsMap.get(i)){
                System.out.print(i+" ");
            }
        }
    }

    private void printAvailableEconomySeats(){

        for(int i=6 ; i<seatsMap.size()+1 ; i++){
            if(seatsMap.get(i)){
                System.out.print(i+" ");
            }
        }
    }

    public boolean isThereAvailableSeatOnBusinessClass(){
        boolean availabilityOnBusiness = false;

        for(int i=1 ; i<=5 ;i++){
            if(seatsMap.get(i)){
                availabilityOnBusiness = true;
                break;
            }
        }

        return availabilityOnBusiness;
    }

    public boolean isThereAvailableSeatOnEconomyClass(){
        boolean availabilityOnEconomy = false;

        for(int i=6 ; i<=10 ;i++){
            if(seatsMap.get(i)){
                availabilityOnEconomy = true;
                break;
            }
        }

        return availabilityOnEconomy;
    }

    public boolean isThereAvailableSeatOnAirplane(){
        boolean availabilityOnAirplane = false;

        for(int i=1 ; i<=10 ;i++){
            if(seatsMap.get(i)){
                availabilityOnAirplane = true;
                break;
            }
        }

        return availabilityOnAirplane;
    }


    public void printTicket(){

        makeStarLine();
        System.out.println("name             : "   + userInfo.get("userName"));
        System.out.println("Age              : "    + userInfo.get("userAge"));
        System.out.println("passaport no     : " + userInfo.get("passportNo"));
        System.out.println("Sınıf            : " + selectedClass.toString());
        System.out.println("seçilen koltuk no: " + selectedSeat);
        makeStarLine();

        doUserWantToStartAgain();
    }

    public void closeSystem(){
        System.out.println("iyi uçuçlr");
    }

    private void makeStarLine(){
        for(int i=0;i<40;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    private void doUserWantToStartAgain(){
        System.out.println("Devam etmek için c'e basınız, çıkmak için herhangi bir tuşa basınız ");
        String input = scanner.next();
        if(input.matches("c") || input.matches("C")){

            makeReservation();

        }else {
            closeSystem();
        }
    }


    public FlyClassType getSelectedClass() {
        return selectedClass;
    }

    public void setSelectedSeat(int selectedSeat){
        this.selectedSeat = selectedSeat;
    }

    public HashMap<Integer,Boolean> getSeatsMap(){
        return seatsMap;
    }

    @Override
    public String toString() {
        return "Rezervasyon Sistemi";
    }
}