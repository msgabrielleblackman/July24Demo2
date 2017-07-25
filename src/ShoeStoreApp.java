/**
 * Created by Grand Circus Student on 7/25/2017.
 */
public class ShoeStoreApp {
    public static void main(String[] args) {

        Store stores = new Store("Blue", 11);
        ShoeStore extras = new ShoeStore("Red",10, "Pump");

        stores.setSize(8);

     System.out.println(stores.getColor());


        //adding a different style
        System.out.println(Store.getStyle());
//        Store.setColor(HotPink);
//        System.out.println("I added a different style: ");
//        System.out.println(setColor.getStyle());

        System.out.println("Selling a new style shoe: ");
        ShoeStore.setStyle("Slingback");
        System.out.println(Store.getStyle());


    }
}



