/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Checker {

    public static boolean check(String regex, String givenString, boolean caseSens) {
        Pattern pattern;
        
        if(caseSens){
            pattern = Pattern.compile(regex, Pattern.UNICODE_CASE);
        } else{
            pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        }
        
        Matcher matcher = pattern.matcher(givenString);
        
        return matcher.find();
    }
    
}
