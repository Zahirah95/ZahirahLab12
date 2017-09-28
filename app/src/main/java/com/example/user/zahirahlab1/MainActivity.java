package com.example.user.zahirahlab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button displayButton;
    private Button resetButton;
    private EditText etName;
    private TextView tvMessage;

    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById (R.id.button);
        etName = (EditText) findViewById (R.id.editText);
        tvMessage = (TextView) findViewById (R.id.textView);
        resetButton = (Button) findViewById(R.id.button2);
    }

    public void displayText (View view){
        String text = etName.getText().toString();

        //display text obtain from getText
        tvMessage.setText("Welcome" + " " +text);

    }

    public void resetText (View view){
        etName.getText().clear();
        tvMessage.setText("HELLO WORLD");

        Toast toast = Toast.makeText(this, "Name has been clear!", Toast.LENGTH_SHORT);
        toast.show();
    }
}

