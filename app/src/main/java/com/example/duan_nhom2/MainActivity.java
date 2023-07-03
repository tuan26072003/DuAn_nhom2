package com.example.duan_nhom2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.duan_nhom2.Ui.GioHang_Fragment;
import com.example.duan_nhom2.Ui.Home_Fragment;
import com.example.duan_nhom2.Ui.LichSu_Fragment;
import com.example.duan_nhom2.Ui.TaiKhoan_Fragment;
import com.example.duan_nhom2.Ui.Thongbao_Fragment;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationBarView view = findViewById(R.id.butomNavi);
        view.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                if (item.getItemId() == R.id.menu_1) {
                    fragment = new Home_Fragment();
                } else if (item.getItemId() == R.id.menu_2) {
                    fragment = new Thongbao_Fragment();
                } else if (item.getItemId() == R.id.menu_3) {
                    fragment = new GioHang_Fragment();
                } else if (item.getItemId() == R.id.menu_4) {
                    fragment = new LichSu_Fragment();
                } else if (item.getItemId() == R.id.menu_5) {
                    fragment = new TaiKhoan_Fragment();
                } else {
                    return false;
                }
                menu(fragment);
                return true;
            }


        });

        menu(new Home_Fragment());
    }
    public void menu(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.Frame_layout, fragment);
        fragmentTransaction.commit();
    }
}