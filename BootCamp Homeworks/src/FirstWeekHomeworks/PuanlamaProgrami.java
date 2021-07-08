package FirstWeekHomeworks;

import java.util.Scanner;

public class PuanlamaProgrami {

    /**
     * puanlama programı
     *
     * 91 ve 100 arasında A+
     * 81 ve 90  arasında A
     * 71 ve 80  arasında B+
     * 61 ve 70  arasında B
     * 51 ve 60  arasında C
     * 41 ve 50  arasında D
     * 0  ve 40  arasında F
     *
     */


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String output = puanlama(input);

        System.out.println(output);
    }

    private static String puanlama(int puan){
        String sonuc = "";

        if(puan>=91 && puan<=100){
             sonuc = "A+";
        }else if(puan>=81 && puan<=90){
            sonuc = "A";
        }else if(puan>=71 && puan<=80){
            sonuc = "B+";
        }else if(puan>=61 && puan<=70){
            sonuc = "B";
        }else if(puan>=51 && puan<=60){
            sonuc = "C";
        }else if(puan>=41 && puan<=50){
            sonuc = "D";
        }else if(puan>=0 && puan<=40){
            sonuc = "F";
        }

        return sonuc;
    }
}
