package main.Sharpies;
//        Create Sharpie class
//        We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
//        When creating one, we need to specify the color and the width
//        Every sharpie is created with a default 100 as inkAmount
//        We can use() the sharpie objects
//        which decreases inkAmount

import java.util.ArrayList;

public class Sharpie {
    public String colour;
    public Float width;
    public Float inkAmount = 100.0f;

    public Sharpie(String newColour, Float newWidth) {
        colour = newColour;
        width = newWidth;
    }


    public void use (int object){
        for (int i = 0; i < object; i++) {
            inkAmount -=10.0f*width;
        }

        if (inkAmount<15.0f){
            System.out.println("Ink is running low in the "+colour+" sharpie!");
        }
    }

    public static void main(String[] args) {
        Sharpie fancySharpie = new Sharpie("pink", 1f);
        fancySharpie.use(3);
        fancySharpie.use(6);
        System.out.println(fancySharpie.inkAmount);
    }
}
