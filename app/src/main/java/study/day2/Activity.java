package study.day2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.example.ci.myapplication.R;

import y2stage.core.Common;


public class Activity extends ActionBarActivity {

    private  Common com=new Common();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day2_activity);

        Button but2=(Button) findViewById(R.id.button5);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.toast(getApplicationContext(), "중지");
            }
        });
    }

    public void buttonClick(View v){
        com.toast(getApplicationContext(), "시작");
    }


}
