package com.example.menumanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_main__item__copy) {
            Toast.makeText(this, "Copy", Toast.LENGTH_SHORT);


        } else if (item.getItemId() == R.id.menu_main__item__cut) {
            Toast.makeText(this, "Cut", Toast.LENGTH_SHORT);


        } else if (item.getItemId() == R.id.menu_main__item__paste) {
            Toast.makeText(this, "Paste", Toast.LENGTH_SHORT);


        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
