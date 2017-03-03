package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    final static SimpleDateFormat dateFormat =
            new SimpleDateFormat("dd.MM.yyyy");

    public static Date toDate(String dateString)
            throws ParseException {
        return dateFormat.parse(dateString);
    }

    public static String toString(Date date) {
        return dateFormat.format(date);
    }
}
