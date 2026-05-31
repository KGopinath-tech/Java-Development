
class Place{
    String placeName;
    String type;
    static String stateName;

    public Place(){
        placeName="";
        type="Tourist Place";
        System.out.println("Inside constructor");
        //we can initialize static variable inside constructor but 
        // it is not recommended because constructor will be called every time when we create object and 
        // static variable will be initialized every time when we create object which is not efficient. 
        // So it is better to initialize static variable inside static block.
    }
    static{
        stateName="Tamil Nadu";
        System.out.println("Inside static block");
    }

    public void showPlaceDetails(){
        System.out.println(placeName + " : "+ type + " : " + stateName);
}
}
public class StaticBlockExample {
    
    public static void main (String[] a) throws ClassNotFoundException{
        Place munner = new Place();
        munner.placeName="Munner";
        munner.type="Hill Station";
        Place.stateName="Kerala";

        Place ooty = new Place();
        // //static block will be executed only once when the class is loaded into memory, 
        // // so static variable will be initialized only once and 
        // // it will retain its value until the class is unloaded
        munner.showPlaceDetails();
        Class.forName("Place");
        // if we want to execute static block without creating object then 
        // we can use Class.forName() method to load the class into memory
    }
}
