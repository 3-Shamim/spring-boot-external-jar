package com.learningStuff.coreUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Email: mdshamim723@gmail.com
 * Date: ২২/৩/২২
 * Time: ৪:০৭ PM
 * To change this template use File | Settings | File and Code Templates.
 */

public class StringUtils {

    public static boolean isEmpty(String value) {
        return value == null || value.length() == 0;
    }

    public static boolean isNotEmpty(String value) {
        return !isEmpty(value);
    }

}
