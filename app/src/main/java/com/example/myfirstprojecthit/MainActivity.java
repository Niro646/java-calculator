package com.example.myfirstprojecthit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //global variables:
    TextView result, solution;
    int valueNumber=0;
    String calcOperator="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textViewResult);
        solution=findViewById(R.id.textViewResult);




    }

    public void buttonClickFunction(View view) {

        if(view instanceof Button)
        {
            Button button = (Button) view;

            String str = button.getText().toString();

            result.append(str);
        }
    }

    public void buttonClickClearFunction(View view)
    {
        if(view instanceof Button)
        {
            result.setText("");
            calcOperator="";
            valueNumber=0;
        }
    }

    public void operatorClickFunction(View view)
    {
        if(view instanceof Button)
        {
            Button button=(Button)view;

            calcOperator=button.getText().toString();

            valueNumber=Integer.parseInt(result.getText().toString());
            result.setText("");
        }
    }

    public void equalOperatorClickFunction(View view)
    {
        int secondValueNumber=Integer.parseInt(result.getText().toString());
        switch(calcOperator)
        {
            case "+":
                valueNumber+=secondValueNumber;
                break;

            case "-":
                valueNumber-=secondValueNumber;
                break;


            case "X":
                valueNumber*=secondValueNumber;
                break;

            case "÷":
                valueNumber/=secondValueNumber;
                break;
        }

        result.setText(Integer.toString(valueNumber));
    }
}