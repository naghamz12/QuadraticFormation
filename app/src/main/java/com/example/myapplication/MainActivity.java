package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etA, etB, etC;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectComponents();

    }

    private void connectComponents() {
        etA = findViewById(R.id.etA);
        etB = findViewById(R.id.etB);
        etC = findViewById(R.id.etC);
        btn = findViewById(R.id.btn);

    }

    public void calculate(View view) {

        String a = etA.getText().toString();
        String b = etA.getText().toString();
        String c = etA.getText().toString();

        if (!a.isEmpty() || !TextUtils.isDigitsOnly(a) || !b.isEmpty())
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

        Double aa, bb, cc, calculate = null, delta;
        {
            aa = Double.parseDouble(a);
            bb = Double.parseDouble(b);
            cc = Double.parseDouble(c);
            delta = Math.pow(bb, 2) - 4 * aa * cc;
            if (delta < 0) {
                Toast.makeText(this, "error" + calculate, Toast.LENGTH_SHORT).show();
                return;

            }
            if (delta == 0) {
                Double x = ((-bb) / 2 * aa);

                Toast.makeText(this, "your calculate is" + calculate, Toast.LENGTH_SHORT).show();
                return;
            }
            if (delta > 0) {
                Double x1 = ((-bb) + Math.sqrt(delta) / 2 * aa);
                Double x2 = ((-bb) - Math.sqrt(delta) / 2 * aa);
                Toast.makeText(this, "your calculate is" + calculate, Toast.LENGTH_SHORT).show();
                return;
            }


        }
    }
}