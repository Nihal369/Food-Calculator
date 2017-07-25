package com.lmntrx.foodcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputField;
    int totalFund = 600;
    int remainingFund=600;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String totalFundString = totalFund + "";
        TextView totalFundText = (TextView) findViewById(R.id.totalFundNum);
        totalFundText.setText(totalFundString);
        TextView remainingFundTextView = (TextView) findViewById(R.id.remainingFundNum);
        String fundToDisplay=remainingFund + "";
        remainingFundTextView.setText(fundToDisplay);
    }

    public void recordExpense(View view) {
        remainingFund-=35;
        TextView remainingFundTextView = (TextView) findViewById(R.id.remainingFundNum);
        String fundToDisplay=remainingFund + "";
        remainingFundTextView.setText(fundToDisplay);
    }
}