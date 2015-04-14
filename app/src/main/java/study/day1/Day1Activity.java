package study.day1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.example.ci.myapplication.R;

import y2stage.core.Common;


public class Day1Activity extends ActionBarActivity {

    private  Common com=new Common();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1_activity);
    }

    public void buttonClick(View v){
        com.toast(this, "버튼을 눌렸네요~~");
        Intent itn= new Intent(getApplicationContext(),Day1ActivitySub.class);
        startActivity(itn);
    }

    public void buttonClick2(View v){
        com.toast(this, "버튼을 눌렸네요~~");
        Intent itn= new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.cinepox.com"));
        startActivity(itn);
    }

    public void buttonClick3(View v){
        com.toast(this, "버튼을 눌렸네요~~");
        Intent itn= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-5029-8080"));
        startActivity(itn);
    }

}
