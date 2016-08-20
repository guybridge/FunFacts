package au.com.wsit.funfacts;

import android.util.Log;

import java.util.Random;

/**
 * Created by guyb on 19/08/16.
 */
public class Listenser
{
    set mSet;

    public interface set
    {
        void getFact();
    }

    public void getFact()
    {
        Log.i("TAG", "Test");


        mSet.getFact();

    }
}
