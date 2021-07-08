package FirstWeekHomeworks;

import java.util.Scanner;

public class FibonacciSeries {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        /**  n => dizinin uzunluğu (kullancıdan alınır).*/
        int n = scanner.nextInt();
        int[] fibonacciSeries = new int[n];


        /**integer sınırları açımamak için kullancıdan gelecek veri 1 ve 25 arasında sınırlı olmalı.
         yani kullanıcı en az 1 terim ve en fazla 25 terim yazdırablir.*/
        if(n>=1 && n<=25){

            for(int i=0 ; i<n ; i++){
                if(i==0){
                    //birinci terim her zaman 0 olacaktır.
                    fibonacciSeries[i] =0;
                }else if(i==1){
                    //ikinci terim her zaman 1 olacaktır.
                    fibonacciSeries[i] =1;
                }else if(i>=2){
                    //sonraki terimler için formula göre her sayının kendisinden önce gelen iki sayının
                    //toplamı eşittir.
                    fibonacciSeries[i] = fibonacciSeries[i-1]+fibonacciSeries[i-2];
                }
            }

            /**yazdırma işlemi.*/
            for (int i=0; i<fibonacciSeries.length;i++){

                if(i== fibonacciSeries.length-1){
                    System.out.printf("%d",fibonacciSeries[i]);
                }else {
                    System.out.printf("%d, ",fibonacciSeries[i]);
                }
            }


        }else{
            //kullanıcıdan 25'ten büyük bir sayi gelirse işlem yapılmayacaktır.
            System.out.println("Please Enter a Number Between 0 and 25");
        }

    }

}
