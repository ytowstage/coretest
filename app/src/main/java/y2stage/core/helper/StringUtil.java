/*------------------------------------------------------
 * 2015-04-10
 * @author lee jongmin <ljm9517@naver.com>
 * @version 1.0
 * 문자 관련
*------------------------------------------------------*/
package y2stage.core.helper;

public class StringUtil{

    public static boolean isEmpty(String str) {
        if(str == null || str.trim().length() ==0)
            return true;

        return false;
    }

    public static boolean isAnyEmpty(String str1, String str2) {
        if(isEmpty(str1) || isEmpty(str2))
            return true;

        return false;
    }

    public static boolean isAllEmpty(String str1, String str2) {
        if(isEmpty(str1) && isEmpty(str2))
            return true;

        return false;
    }
}
