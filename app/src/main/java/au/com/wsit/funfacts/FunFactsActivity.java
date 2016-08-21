package au.com.wsit.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity
{

    // Declare our view variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private FactBook mFactbook = new FactBook();
    private ColourWheel mColourWheel = new ColourWheel();
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to the corresponding variables

        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.layout);



        mShowFactButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String fact = mFactbook.getFact();
                String colour = mColourWheel.getColour();
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(Integer.parseInt(colour));

            }
        });

    }


}
