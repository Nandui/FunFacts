package com.nand3.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Fernando Serina on 04/11/14.
 **/

public class ColorWheel {

    //Member variables (properties about the object)
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    //Methods
    public int getColor() {

        String color = "";

        //Randomly select color from Array
        Random randomNumberGenerator = new Random();
        int randomNumber = randomNumberGenerator.nextInt(mColors.length);

        //Save color selected on string to return
        color = mColors[randomNumber];

        //Return random color
        return Color.parseColor(color);
    }


}
