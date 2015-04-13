/*------------------------------------------------------
 * 2015-04-10
 * @author lee jongmin <ljm9517@naver.com>
 * @version 1.0
 * 공용
*------------------------------------------------------*/
package y2stage.core;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.Toast;

import y2stage.core.helper.StringUtil;


public class Common {

    /*---------------------------------------------------------------
	 @brief  : 토스트 커스텀
	 @parameters : Context
	 			   msg :  메세지
	 			   msec : 밀리언
	 @return : bool
	---------------------------------------------------------------*/
    public void toast(Context c,String msg,int msec){

        if(c == null || StringUtil.isEmpty(msg)) return;

        int duration = msec;
        if(duration < 2000)
            duration = 2000;

        final Toast t = Toast.makeText(c, msg, Toast.LENGTH_SHORT);
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long millisUntilFinished){
                t.show();
            }

            @Override
            public void onFinish() { }
        }.start();

        // Toast.makeText(c,msg, Toast.LENGTH_SHORT).show();
    }
}

