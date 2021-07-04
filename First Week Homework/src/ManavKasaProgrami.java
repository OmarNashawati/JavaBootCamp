import java.util.Scanner;

public class ManavKasaProgrami {

    /**
     * Manav Kasa Programı
     * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını
     * ekrana yazdıran programı yazın.
     *
     * Meyveler ve KG Fiyatları
     * Armut : 2,14 TL
     * Elma : 3,67 TL
     * Domates : 1,11 TL
     * Muz: 0,95 TL
     * Patlıcan : 5,00 TL
     * */


    static String[] liste = {"Armut","Elma","Domates","Muz","Patlıcan"} ;
    static float[] kiloFiyati = {2.14f,3.67f,1.11f,0.95f,5.00f} ;

    static  float toplam ;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        for(int i=0 ; i<liste.length ; i++){
            System.out.printf("%s Kaç Kilo ? ",liste[i]);
            float AlinanMiktar =scanner.nextFloat();
            toplam = toplam + (AlinanMiktar*kiloFiyati[i]);
        }

        System.out.print("Toplam Tutar : " + toplam);

    }
}
