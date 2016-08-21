package au.com.wsit.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by guyb on 20/08/16.
 */
public class ColourWheel
{

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

    public int getColour()
    {

        String colour;

        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        colour = mColors[randomNumber];

        int ColourAsInt = Color.parseColor(colour);

        return ColourAsInt;
    }
}