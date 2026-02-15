package com.example.inventoryappalexisp;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity {
    EditText nameText;
    TextView textGreeting;
    Button buttonSayHello;

    //Create a function that displays a greeting.
    public void SayHello(View view)
    {
        if(!nameText.getText().toString().matches(""))
        {
            textGreeting.setText("Hello "+nameText.getText());
        }
        else
        {
            textGreeting.setText("Enter your name here:");
        }
    }

    //Create validation of the elements and inputs.

    //Dynamically enable and disable the button settings for appropriate situations.
}
