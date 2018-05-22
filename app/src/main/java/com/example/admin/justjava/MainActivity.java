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
    Button btnOrder;
    private TextView quantityTextView;
    private TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

         btnOrder = (Button)findViewById(R.id.button_order);
         quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
         priceTextView = (TextView) findViewById(R.id.price_text_view);

         btnOrder.setOnClickListener(this);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder() {
        int numberOfcoffees = 5;
        display(numberOfcoffees);
        displayPrice(numberOfcoffees * 5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {

        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {

        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.button_order:
                Log.i("mainActivity", "butn order clickded");
             submitOrder();

                break;
        }
    }
}