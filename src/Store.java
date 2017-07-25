/**
 * Created by Grand Circus Student on 7/24/2017.
 */
public class Store {
     private String color;
     private int size;
    private static boolean style;

    public Store(String color, int size){
         this.color = color;
         this.size = size;
     }

    public static boolean getStyle() {
        return style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
