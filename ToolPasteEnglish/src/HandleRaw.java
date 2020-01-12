/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yui
 */
public class HandleRaw {

    public static String getWord(String input,int quatity) {
        if (input.length() == 0) {
            return "";
        }
        String result = "";
        for (int i = 0; i < quatity; i++) {
            result += input + "\n";
        }
        return result + "\n";
    }

    public static String getValuesEvenMumber(String[] input) {
        String result = "";
        for (int i = 0; i < input.length; i++) {
            if (i % 2 != 0) {
                result += input[i] + "\n";
            }
        }
        return result;
    }
     public static String getValuesAlternateMumber(String[] input) {
        String result = "";
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                result += input[i] + "\n";
            }
        }
        return result;
    }


}
