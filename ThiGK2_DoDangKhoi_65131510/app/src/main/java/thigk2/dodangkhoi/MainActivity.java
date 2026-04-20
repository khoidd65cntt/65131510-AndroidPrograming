package thigk2.dodangkhoi;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang1Activity.class)));
        findViewById(R.id.btn2).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang2Activity.class)));
        findViewById(R.id.btn3).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang3Activity.class)));
        findViewById(R.id.btn4).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang4Activity.class)));
    }
}