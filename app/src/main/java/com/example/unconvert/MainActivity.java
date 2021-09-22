package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        // // This is setOnClickListener another method to run the app // //
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hi Click Listener Worked!", Toast.LENGTH_SHORT).show();
//
//                String userNum = editText.getText().toString();
//                int kg = Integer.parseInt(userNum); // int i = textView.setText(s);
//                double pound = kg * 2.205;
//                textView.setText(userNum + "kg = " + String.format("%.2f", pound) + "lbs"); // with round off
////                textView.setText(userNum + " kg " + " = " + pound + " £ " ); // without round off
//            }
//        });
    }

    // // This is onclick another method to run the app // //
    public void calculate(View view){
//        Toast.makeText(MainActivity.this, "This button is working", Toast.LENGTH_SHORT).show();

        String userNum = editText.getText().toString();
        double kg = Double.parseDouble(userNum);
        double pound = kg * 2.205;
        textView.setText(userNum + "kg = " + String.format("%.2f", pound) + "lbs");
    }
}