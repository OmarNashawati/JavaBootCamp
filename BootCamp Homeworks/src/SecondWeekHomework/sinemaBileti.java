package SecondWeekHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class sinemaBileti {
    /**
     * Sinema bileti satışı :
     * 18 yaş altı için %10
     * 18 ve 25 yaş arası %5 indirim
     * yrıca korku filmi seçilmişse ayrıca %10 indirim
    */

    static Scanner scanner = new Scanner(System.in);

    static ArrayList<String[]> moviesList = new ArrayList<>();
    static ArrayList<String[]> costumeMoviesList = new ArrayList<>();

    static String userName ;
    static int userAge ,selectedMovie;

    public static void main(String[] args){

        initMoviesList();

        takeInputs();

        printBill();

    }

    private static void takeInputs(){

        System.out.print("Adınız Soyadınız giriniz : ");
        userName = scanner.nextLine();
        System.out.print("yaşınızı giriniz : ");
        userAge = scanner.nextInt();
        System.out.println("Aşağdaki listeden bir film seçiniz : ");

        printMoviesList();

        selectedMovie = scanner.nextInt();

    }



    private static void initMoviesList(){

        String[] m1 =  { "Yıldız Savaşları: İmparator","1980","+18","korku Değil"};
        String[] m2 =  { "Joker","2019","+18"};
        String[] m3 =  { "Yıldızlararası","2014","+12","korku Değil"};
        String[] m4 =  { "Matrix","1999","+18","korku Değil"};
        String[] m5 =  { "Yüzüklerin Efendisi: Kralın Dönüşü","2003","+12","korku Değil"};
        String[] m6 =  { "1917","2019","+18","korku Değil"};
        String[] m7 =  { "Kara Şövalye","2008","+12","korku Değil"};
        String[] m8 =  { "Para Avcısı","2013","+18","korku Değil"};
        String[] m9 =  { "Dövüş Kulübü","1999","+18","korku Değil"};
        String[] m10 = { "Ruhların Kaçışı","2001","+12","korku Değil"};
        String[] m11 = { "Mad Max: Fury Road","2015","+18","korku Değil"};
        String[] m12 = { "Testere","2004","+18","korku"};
        String[] m13 = { "Örümcek-Adam: Örümcek Evreninde","2018","+12","korku Değil"};

        moviesList.add(m1);
        moviesList.add(m2);
        moviesList.add(m3);
        moviesList.add(m4);
        moviesList.add(m5);
        moviesList.add(m6);
        moviesList.add(m7);
        moviesList.add(m8);
        moviesList.add(m9);
        moviesList.add(m10);
        moviesList.add(m11);
        moviesList.add(m12);
        moviesList.add(m13);

    }

    /** kullanıcının yaşına göre bir film listesi hazırlatmak */
    private static ArrayList makeCostumeMoviesList(){

        int i=0;
        for(String[] s : moviesList){
            if(userAge<18){//18 yaş altı için uygun filmler yazdir
                if( !s[2].equals("+18")){
                    costumeMoviesList.add(moviesList.get(i));
                }
            }else {//tüm filmler yazdir
                costumeMoviesList.add(moviesList.get(i));
            }
            i++;
        }

        return costumeMoviesList;
    }


    /** film listesi consola yazdırmak */
    private  static void printMoviesList(){

        costumeMoviesList = makeCostumeMoviesList();

        int i=1 ;
        for(String[] s : costumeMoviesList){
            System.out.printf("%d. %s  (%s)  [%s]\n",i,s[0],s[1],s[2]);
            i++;
        }

    }



    /** kullanıcının yaşına göre ve seçtiği filme göre fiş yazdırmak */
    private static void printBill(){

        float price = pricing();


        System.out.println(makeStarLine());

        System.out.println("Ad   : "+userName);
        System.out.println("Yaş  : "+userAge);
        System.out.println("film : "+costumeMoviesList.get(selectedMovie-1)[0]);
        System.out.println("tutar: "+price+" TL");

        System.out.println(makeStarLine());

    }


    /** kullanıcının yaşına göre ve seçtiği filme göre bir fiyat bilerlemek */
    private static float pricing(){

        final float moviePrice = 30 ;
        float userPrice = 0 ; //ödenecek tutar


        //18 yaş altı için %10
        if(userAge < 18){
            userPrice = moviePrice -(moviePrice*10/100);
       //18 ve 25 yaş arası %5 indirim
        }else{
            //korku filmi seçilmişse ayrıca %10 indirim .
            if(costumeMoviesList.get(selectedMovie-1)[3].equals("korku")){
                userPrice = moviePrice -(moviePrice*15/100);
            }else{
                userPrice = moviePrice -(moviePrice*5/100);
            }

        }

        return userPrice;

    }

    private static String makeStarLine(){
        String starLine = "";

        for(int i=0 ; i<45 ; i++){
            starLine += "*";
        }
        return starLine;
    }





}
