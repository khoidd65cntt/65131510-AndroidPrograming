package com.example.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtA, edtB, edtKQ;
    Button btnCong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        btnCong = findViewById(R.id.btnCong);
        edtKQ = findViewById(R.id.edtKQ);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA = edtA.getText().toString();
                String strB = edtB.getText().toString();

                if(strA.isEmpty() || strB.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ a và b!", Toast.LENGTH_SHORT).show();
                    return;
                }

                double a = Double.parseDouble(strA);
                double b = Double.parseDouble(strB);

                double tong = a + b;

                edtKQ.setText(String.valueOf(tong));
            }
        });
    }
}