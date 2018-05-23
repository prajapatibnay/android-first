/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.admin.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int quantity = 0;

    Button btnOrder;
    Button btnIncrement;
    Button btnDecrement;
    private TextView quantityTextView;
    private TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         setContentView(R.layout.activity_main);

         btnOrder = (Button)findViewById(R.id.button_order);

         btnIncrement = (Button)findViewById(R.id.button_increment);

         btnDecrement = (Button)findViewById(R.id.button_decrement);

         quantityTextView = (TextView) findViewById(R.id.quantity_text_view);

         priceTextView = (TextView) findViewById(R.id.price_text_view);

         btnOrder.setOnClickListener(this);

         btnIncrement.setOnClickListener(this);

         btnDecrement.setOnClickListener(this);

    }




    @Override
    public void onClick(View v)
    {
        int id = v.getId();
        switch (id)
        {
            case R.id.button_order:
                Log.i("mainActivity", "butn order clicked");
                int total = quantity * 5;
                priceTextView.setText(NumberFormat.getCurrencyInstance().format(total));
             break;

             case R.id.button_increment:
                Log.i("mainActivity", "butn plus clicked");
                quantity++;
                quantityTextView.setText(""+quantity);
                break;

                case R.id.button_decrement:
                Log.i("mainActivity", "butn minus clicked");
                 quantity--;
                 if(quantity<0)
                 {
                 quantity=0;
                 }
                 quantityTextView.setText(""+quantity);
                 break;
         }
        }


    }
