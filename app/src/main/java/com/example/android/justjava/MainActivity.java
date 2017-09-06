package com.example.android.justjava;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view){
        quantity++;
        displayQuantity(quantity);
        Integer price = calculatePrice(quantity);
        displayMessage(price.toString()+"$");
    }
    public void decrement(View view){
        if(quantity<=1) return;
        quantity--;
        displayQuantity(quantity);
        Integer price = calculatePrice(quantity);
        displayMessage(price.toString()+"$");
    }
    public void submitOrder(View view) {
        displayMessage("Order Placed");
    }
    private Integer calculatePrice(int quantity) {
        Integer price = quantity * 5;
        return price;
    }
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}

