/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author huong
 */
public class CheckDate {
     public static boolean checkDateFormat(String target) {
        String dateFormatRegex = "^\\d{2}/\\d{2}/\\d{4}$";
        Pattern pattern = Pattern.compile(dateFormatRegex);
        Matcher matcher = pattern.matcher(target.trim());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(target);
            return true && matcher.matches();
        } catch (ParseException e) {
            return false;
        }
    }
    
     public static boolean isFuture(String before, String after) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateAfter = LocalDate.parse(after, formatter);
        LocalDate dateBefore = LocalDate.parse(before, formatter);
        return dateBefore.isBefore(dateAfter);
    }
}
