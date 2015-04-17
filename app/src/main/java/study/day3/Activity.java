package study.day3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.example.ci.myapplication.R;

import y2stage.core.Common;


public class Activity extends ActionBarActivity {

    private  Common com=new Common();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day2_activity_table);
        //dat3_activity
    }

    public void buttonClick(View v){
        com.toast(getApplicationContext(), "시작");
    }


}
