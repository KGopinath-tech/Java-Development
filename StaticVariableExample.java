
class Motorbike{

    String brand;
    int cubicCapacity;
    static String type;
    int mileage;

    public void showBikeDetails(){
        System.out.println(brand + " : "+ cubicCapacity + " : " + type + " : " + mileage);
    }
}

public class StaticVariableExample {

    public static void main(String[] args) {
        
        Motorbike bike = new Motorbike();
        bike.brand="TVS";
        bike.cubicCapacity=159;
        Motorbike.type="StreetNaked";
        bike.mileage=45;

        Motorbike bike2 = new Motorbike();
        bike2.brand="Yamaha";
        bike2.cubicCapacity=155;
        Motorbike.type="StreetNaked";
        bike2.mileage=55;
      

        Motorbike.type="ADV";

        bike.showBikeDetails();
        bike2.showBikeDetails();
    }
}