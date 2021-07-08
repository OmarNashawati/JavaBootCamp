package SecondWeekHomework;

import java.util.Scanner;

public class VizeFinalProgrami {

    public static void main (String[] args){

        takeInputs();

    }


    private static void takeInputs(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunuz giriniz : " );
        float midtermNote = scanner.nextFloat();
        System.out.print("Final notunuz giriniz : " );
        float finalNote = scanner.nextFloat();
        scanner.close();

        calculateAverageNote(midtermNote,finalNote);

    }


    private static void calculateAverageNote(float midtermNote ,float finalNote){

        float averageNote = midtermNote*0.40f + finalNote*0.60f;

        latterNote(averageNote);

    }


    /** 0-20 FF    20-50 CB    50-70 BB    70-100 AA*/
    private static void latterNote (float averageNote){

        String latterNote = "";

        if(averageNote<=20){
            latterNote = "FF";
        }else if(averageNote>20 && averageNote<=50){
            latterNote = "CB";
        }else if(averageNote>50 && averageNote<=70){
            latterNote = "BB";
        }else if(averageNote>70 && averageNote<=100){
            latterNote = "AA";
        }

        printResult(averageNote,latterNote);

    }


    private static void printResult(float averageNote , String latterNote){
        System.out.println("\nortalamanız  : " + averageNote + "\nHarf notunuz : "+latterNote);
    }


}
