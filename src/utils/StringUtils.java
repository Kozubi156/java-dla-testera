package utils;

public class StringUtils {

    public static String getFormattedText(String text){
        if(text.length() > 10){
            return text.substring(0,10).concat("...");
        } else {
            return text;
        }
    }
}
