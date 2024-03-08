package co.julianvalencia.string12to24;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class String12To24 {

     static String timeConversion(String s) throws ParseException {

        try {
            SimpleDateFormat formatDate = new SimpleDateFormat("hh:mm:ssa");
            SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
            Date d = formatDate.parse(s);
            return displayFormat.format(d);
       }
       catch (Exception e) {
        //The handling for the code
       }
        return null;
     }

    public static void main(String[] args) throws ParseException {
        String str="07:05:45PM";
        System.out.println(timeConversion(str));
    }
}
