package com.example.ci.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import study.day1.Day1Activity;
import y2stage.core.Common;


public class MainActivity extends ActionBarActivity {

    private  Common com=new Common();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        com.toast(this,"안녕하세요 누구쇼쇼쇼!");
        com.log("안녕하세요 누구쇼쇼쇼");
    }

    public void buttonClick(View v){
        com.toast(this, "Day1 버튼을 눌렸네요~~");
        Intent itn= new Intent(getApplicationContext(),Day1Activity.class);
        startActivity(itn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
