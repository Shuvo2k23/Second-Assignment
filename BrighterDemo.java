import java.awt.Color;

public class BrighterDemo {
    public static void main(String[] args) {
        int red = 50;
        int green = 100;
        int blue = 150;
        Color color = new Color(red,green,blue);
        Color brightColor = color.brighter();
        System.out.println("Oringinal color : Red:"+red+" Green: "+green+" Blue: "+blue);
        System.out.println("Brighter color: Red: "+brightColor.getRed()+" Green: "+brightColor.getGreen()+" Blue: "+brightColor.getBlue());
    }
    
}
