
class Motorbike{

    String brand;
    int cubicCapacity;
    static String type;
    int mileage;

    public void showbikedetails(){
        System.out.println(brand + " : "+ cubicCapacity + " : " + type + " : " + mileage);
    }
}


public class Practice{

    public static void main(String[] args) {
        
        Motorbike bike = new Motorbike();
        bike.brand="TVS";
        bike.cubicCapacity=159;
        bike.type="StreetNaked";
        bike.mileage=45;

        Motorbike bike2 = new Motorbike();
        bike2.brand="Yamaha";
        bike2.cubicCapacity=155;
        bike2.mileage=55;
        bike2.type="StreetNaked";

        bike.type="ADV";

        bike.showbikedetails();
        bike2.showbikedetails();
    }
}