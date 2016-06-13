package io.nurudeenlawal.Tools;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class StringTools {
    public int stringInIntOut(String input){
        return Integer.parseInt(input);
    }
    public boolean checkString(String input){
        return input.matches("\\d+");
    }
    public String formatStringForProcessing(String input){
        return input.replaceAll("\\D","");
    }
}
