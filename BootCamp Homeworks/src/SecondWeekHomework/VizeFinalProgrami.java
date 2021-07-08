package SecondWeekHomework;

import java.util.Scanner;

public class VizeFinalProgrami {

    public static void main (String[] args){

        takeInputs();

    }


    private static void takeInputs(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunuz giriniz : " );
        float vizeNot = scanner.nextFloat();
        System.out.print("Final notunuz giriniz : " );
        float finalNot = scanner.nextFloat();
        scanner.close();

        ortalamaHesapla(vizeNot,finalNot);

    }


    private static void ortalamaHesapla(float vizeNot ,float finalNot){

        float ortalama = vizeNot*40/100 + finalNot*60/100;

        harfNotu(ortalama);

    }


    /** 0-20 FF    20-50 CB    50-70 BB    70-100 AA*/
    private static void harfNotu (float ortalmaNotu){

        String harfNotu = "";

        if(ortalmaNotu<=20){
            harfNotu = "FF";
        }else if(ortalmaNotu>20 && ortalmaNotu<=50){
            harfNotu = "CB";
        }else if(ortalmaNotu>50 && ortalmaNotu<=70){
            harfNotu = "BB";
        }else if(ortalmaNotu>70 && ortalmaNotu<=100){
            harfNotu = "AA";
        }

        yazdir(ortalmaNotu,harfNotu);

    }


    private static void yazdir(float ortalmaNotu , String harfNotu){
        System.out.println("\nortalamanız  : " + ortalmaNotu + "\nHarf notunuz : "+harfNotu);
    }


}
