package com.soshin.todoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TodosListFragment fragment = new TodosListFragment();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.container, fragment).commit();
    }
}