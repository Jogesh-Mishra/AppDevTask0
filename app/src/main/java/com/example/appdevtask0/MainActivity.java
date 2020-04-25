package com.example.appdevtask0;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etId;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etId=findViewById(R.id.etId);
        btnSubmit=findViewById(R.id.btnSubmit);
        tvResult=findViewById(R.id.tvResult);

        tvResult.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSubmit.setBackgroundColor(getResources().getColor(R.color.green));

                String idNum= etId.getText().toString().trim();
                String data= idNum.substring(7);
                String res = null;

                if(data!=null) {
                    if (data.equals("258")) {
                        res= "Jogesh Mishra";
                    }
                    else if (data.equals("259")) {
                        res ="Abhisekh Toxin";
                    }
                    else if (data.equals("260")) {
                        res="Ricky";
                    }
                    else if (data.equals("261")) {
                        res= "Jagat";
                    }
                    else if (data.equals("262")) {
                        res = "Jyoti";
                    }
                    else {
                        res="NO DATA";
                    }
                    tvResult.setText(res);
                    tvResult.setVisibility(View.VISIBLE);
                }



            }
        });

    }
}
