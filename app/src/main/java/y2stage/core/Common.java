/*------------------------------------------------------
 * 2015-04-10
 * @author lee jongmin <ljm9517@naver.com>
 * @version 1.0
 * 공용 수정 테스트요
*------------------------------------------------------*/
package y2stage.core;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.Toast;
import android.util.Log;

import y2stage.core.helper.StringUtil;



public class Common {

    public final static String LOG_TAG="Y2STAGE";

    /*---------------------------------------------------------------
	 @brief  : 로그 커스텀 (차후 디버그 내용 서버로 전달)
	 @parameters : Context
	 			   msg :  메세지
	 @return : bool
	---------------------------------------------------------------*/
    public void log(String msg){
        this.log(msg,"d");
    }

    public void log(String msg, String i){
        switch (i){
            case "v":
                Log.i(LOG_TAG,msg);
                break;
            case "d":
                Log.i(LOG_TAG,msg);
                break;
            case "i":
                Log.i(LOG_TAG,msg);
                break;
            case "w":
                Log.i(LOG_TAG,msg);
                break;
            case "e":
                Log.i(LOG_TAG,msg);
                break;
        }
    }

    /*---------------------------------------------------------------
	 @brief  : 토스트 커스텀
	 @parameters : Context
	 			   msg :  메세지
	 			   msec : 밀리언
	 @return : bool
	---------------------------------------------------------------*/
    public void toast(Context c,String msg){
        this.toast(c,msg,300);
    }

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

