package com.bachors.img2ascii;

import android.graphics.Bitmap;
import android.graphics.Color;

import static java.lang.StrictMath.round;

/**
 * Created by Bachors on 10/31/2017.
 * https://github.com/bachors/Android-Img2Ascii
 */

public class Img2Ascii {

    private String[] chars = {"@", "#", "+", "\\", ";", ":", ",", ".", "`", " "};

    public Img2Ascii(){

    }

    public String convert(Bitmap rgbImage, int quality) {
        if(quality > 3 && quality < 1)
            quality = 3;
        String tx = "";
        int width = rgbImage.getWidth();
        int height = rgbImage.getHeight();
        for (int y = 0; y < height; y = y + quality) {
            for (int x = 0; x < width; x = x + quality) {
                int pixel = rgbImage.getPixel(x, y);
                int red = Color.red(pixel);
                int green = Color.green(pixel);
                int blue = Color.blue(pixel);

                int brightness = red + green + blue;
                brightness = round(brightness / (765 / (chars.length - 1)));
                tx += chars[brightness];
            }
            tx += "\n";
        }
        return tx;
    }
}