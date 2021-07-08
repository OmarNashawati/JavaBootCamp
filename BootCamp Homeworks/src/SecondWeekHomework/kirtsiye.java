package SecondWeekHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class kirtsiye {

    /**
     * Bir kırtasiye dükkanına mal geliyor.
     * Kırtasiyeci kalem, silgi gibi malzemelerin kaydını sisteme girecek.
     * soru 1: Toplam kaç adet mal aldı.
     * soru 2: Hangi maldan kaç adet aldı.
     * soru 3: Kaç çeşit malı var.
     */

    static ArrayList<String> productsList = new ArrayList<>();
    static ArrayList<Integer> numOfProductsList = new ArrayList<>();

    
    public static void main(String[] args){

        initProductList();

        takeInputs();

        makeReport();

    }
    

    private static void takeInputs(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("kırtasiye dükkanına gelen ürünlerin sayısı giriniz :");
        int i =1;
        for(String product : productsList){
            System.out.printf("%d.ürün : %s : ",i,product);
            int numOfProduct = scanner.nextInt();
            numOfProductsList.add(numOfProduct);
            i++;
        }

    }
    

    private static void initProductList(){

        productsList.add("kalem");
        productsList.add("tükenmezkalem");
        productsList.add("silgi");
        productsList.add("defter");
        productsList.add("tahta kalemi");
        productsList.add("cetvel");
        productsList.add("A4 kağtı");

    }

    private static void makeReport(){

        /** soru 1: Toplam kaç adet mal aldı.  */
        int totalOftokenProducts = 0;
        for(int n : numOfProductsList){
            totalOftokenProducts += n ;
        }

        /** soru 2: Hangi maldan kaç adet aldı.  */
        ArrayList<String> tokenProductsList = new ArrayList<>();
        ArrayList<Integer> tokenProductsNumList = new ArrayList<>();
        int i=0;
        for(int x :numOfProductsList){
            if(x != 0){
                tokenProductsList.add(productsList.get(i));
                tokenProductsNumList.add(numOfProductsList.get(i));
            }
            i++;
        }

        /** soru 3: Kaç çeşit malı var.  */
        int tokenProductTypeNum = tokenProductsList.size() ;


        printReport(totalOftokenProducts , tokenProductsList ,tokenProductsNumList,tokenProductTypeNum);

    }
    

    private static void printReport(int totalOfProducts,ArrayList<String> tokenProducts,ArrayList<Integer> tokenProductsNum,
                                    int tokenProductTypeNum){

        makeStarLine();

        /** soru 1: yazdırmak  */
        System.out.println("Toplam kaç adet mal aldı : "+totalOfProducts);

        /** soru 2: yazdırmak  */
        System.out.println();
        System.out.println("Hangi maldan kaç adet aldı : ");
        for(int i=0 ;i<tokenProducts.size() ; i++){
            System.out.printf("%10d. %s : %d adet \n",i+1,tokenProducts.get(i),tokenProductsNum.get(i));
        }

        /** soru 3: yazdırmak  */
        System.out.println();
        System.out.println("Kaç çeşit malı var : "+ tokenProductTypeNum +" çeşit malı alındı");

        makeStarLine();

    }
    

    private static void makeStarLine(){
        String star ="*";
        for(int i=0 ; i<40 ; i++){
            System.out.print(star);
        }
        System.out.println();
    }

}
