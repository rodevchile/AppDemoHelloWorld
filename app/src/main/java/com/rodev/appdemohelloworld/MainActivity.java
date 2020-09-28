package com.rodev.appdemohelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtname;
    TextView txtresult;
    ImageView img ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname = findViewById(R.id.txt1);
        txtresult = findViewById(R.id.txt_msg);
        img = findViewById(R.id.img);
        img.setVisibility(View.INVISIBLE);
        Log.d("INFO","load ok");
    }

    /**
     * Method hi ok
     * @param view
     */
    public void hi(View view) {
        if (txtname.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter your name :)", Toast.LENGTH_LONG).show();
        }else{
            img.setVisibility(View.VISIBLE);
            txtresult.setText("Hi "+ txtname.getText().toString()+"!!!");
            txtname.setText("");
            Log.d("Info", "function ok");
        }

    }
}