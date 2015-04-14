package study.day1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.example.ci.myapplication.R;

import y2stage.core.Common;


public class Day1ActivitySub extends ActionBarActivity {

    private  Common com=new Common();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1_activity_sub);
    }

    public void buttonClick(View v){
        com.toast(this, "버튼을 눌렸네요~~");
        finish();
    }

}
