package ThirdWeekHomework;

import ThirdWeekHomework.Concretes.PegasusReservationSys;
import ThirdWeekHomework.Concretes.THYReservationSys;

import java.util.HashMap;
import java.util.Scanner;


public class Main {

    Scanner scanner = new Scanner(System.in);
    HashMap<String,String> userInfo = new HashMap<>();


    public static void main(String[] args){

        new Main().startSystem();

    }

    private void startSystem(){

        System.out.println("\n****Uçak Bileti Rezervsiyon sisemine Hoşgeldiniz****\n");

        takeUserInfo();

        selectSystem();

    }


    private void selectSystem(){

        System.out.println("\nLütfen aşağıdaki rezervsiyon sistemlardan birini seçiniz");

        System.out.println("1 - THY Rezervsiyon sistemi ");
        System.out.println("2 - Pegasus Rezervsiyon sistemi ");
        int selectedSystem = scanner.nextInt();

        if(selectedSystem == 1){
            new THYReservationSys(userInfo);
        }else if(selectedSystem == 2){
            new PegasusReservationSys(userInfo);
        }else{
            System.out.println("(Error) geçersiz değer, Lütfen 1 veya 2 giriniz!");
            selectSystem();
        }

    }


    private void takeUserInfo(){

        System.out.print("Ad Soyadı : ");
        userInfo.put("userName",scanner.nextLine());

        System.out.print("Yaş : ");
        userInfo.put("userAge",scanner.next());

        System.out.print("passaport no : ");
        userInfo.put("passportNo",scanner.next());



    }

}
