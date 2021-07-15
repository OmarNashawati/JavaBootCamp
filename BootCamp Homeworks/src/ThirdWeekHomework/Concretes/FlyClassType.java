package ThirdWeekHomework.Concretes;

public class FlyClassType {


    private int classTypeCode;
    private String classType = "";

    public FlyClassType(int classTypeCode){

        if(classTypeCode == 1 || classTypeCode == 2){
            this.classTypeCode = classTypeCode;
        }else {
            System.out.println("(Error) geçersiz değer, Lütfen 1 veya 2 giriniz!");
        }
    }

    public int getClassTypeCode() {
        return classTypeCode;
    }

    @Override
    public String toString() {
        if(classTypeCode == 1){
            classType = "Business Class";
        }else if(classTypeCode == 2){
            classType = "Ekonomi Class";
        }

        return classType;
    }

}
