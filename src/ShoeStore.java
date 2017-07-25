public class ShoeStore extends Store {
    private String style;

    public ShoeStore(String color, int size, String style) {
        super(color, size);
        this.style = style;
    }

    public String getStyle(){
        return style;
    }

    public static void setStyle(String style) {
        this.style = style;
    }

    public static void getStyle(String s) {
    }
}
