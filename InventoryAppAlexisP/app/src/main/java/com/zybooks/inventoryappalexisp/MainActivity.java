package com.zybooks.inventoryappalexisp;

import static com.zybooks.inventoryappalexisp.R.string.hello;

import android.app.Activity;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.text.Editable;

public class MainActivity extends Activity {
    private EditText nameText;
    private TextView textGreeting;
    private Button buttonSayHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.nameText);
        textGreeting = findViewById(R.id.textGreeting);
        buttonSayHello = findViewById(R.id.buttonSayHello);
        buttonSayHello.setEnabled(false);

        nameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // kept because ide needs it
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // kept because ide needs it
            }

            @Override
            public void afterTextChanged(Editable s) {
                validateText();
            }
        });

//        Button click listener, not used because xml controls it
//        buttonSayHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                sayHello();
//            }
//        });
    }

    //Create a function that displays a greeting.
    public void sayHello(View view) {
        String name = nameText.getText().toString().trim();

        if (!name.isEmpty()) {
            textGreeting.setText("Hello " + name);
        } else {
            textGreeting.setText("Enter your name here:");
        }
    }

    //Create validation of the elements and inputs.
    //Dynamically enable and disable the button settings for appropriate situations.
    private void validateText() {
        String name = nameText.getText().toString().trim();
        buttonSayHello.setEnabled(!name.isEmpty());
    }
}
