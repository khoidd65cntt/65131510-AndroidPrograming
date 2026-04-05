package com.dodangkhoi.fragmentdong;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // --- CODE XỬ LÝ FRAGMENT ĐỘNG ---
        // if (savedInstanceState == null) giúp tránh việc fragment bị add đè lên nhau khi xoay ngang/dọc điện thoại
        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            // Nhét ContentFragment vào vùng chứa phía trên
            fragmentTransaction.add(R.id.content_frame, new ContentFragment());

            // Nhét FooterFragment vào vùng chứa phía dưới
            fragmentTransaction.add(R.id.footer_frame, new FooterFragment());

            // Thực thi lệnh
            fragmentTransaction.commit();
        }
    }
}