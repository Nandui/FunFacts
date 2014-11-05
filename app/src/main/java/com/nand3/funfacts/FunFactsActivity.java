package com.nand3.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends Activity {

    //Create and initialize external classes objects
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our View/Button variables and assign them to respective ID's
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get a fact and color and save them on variables
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();

                //Assign fact to label text property
                factLabel.setText(fact);

                //Assign color to button and activity background
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };

        //Assign OnClickListener to factButton
        showFactButton.setOnClickListener(listener);


    }
}
