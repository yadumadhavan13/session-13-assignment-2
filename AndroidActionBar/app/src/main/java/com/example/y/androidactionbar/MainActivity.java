package com.example.y.androidactionbar;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity","Oncreate");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.ic);
        actionBar.setTitle("Android ActionBar");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater =  getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.itm_call:{
                Toast.makeText(this, "call option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","call option selected");
                return true;
            }
            case R.id.itm_contacts:{
                Toast.makeText(this, "contacts option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","contacts option selected");
                return true;
            }
            case R.id.itm_done:{
                Toast.makeText(this, "done option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","done option selected");
                return true;
            }
            case R.id.itm_settings:{
                Toast.makeText(this, "settings option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","settings option selected");
                return true;
            }
            case R.id.itm_status:{
                Toast.makeText(this, "status option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","status option selected");
                return true;
            }
            case R.id.itm_voice:{
                Toast.makeText(this, "voice option selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","voice option selected");
                return true;
            }
            default:return super.onOptionsItemSelected(item);
        }

    }
}
