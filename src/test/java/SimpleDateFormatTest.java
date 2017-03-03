import org.junit.Assert;
import org.junit.Test;
import util.DateUtil;

import java.util.Date;

public class SimpleDateFormatTest extends Assert {

    /**
     * Конвертируем дату из строки в Date и
     * обратно
     */
    @Test
    public void testConvertStringToDateAndBack()
            throws Exception {
        String dateString = "03.03.2017";
        Date date = DateUtil.toDate(dateString);
        System.out.println("date = " + date);
        String dateStringBack = DateUtil.toString(date);
        assertEquals(dateString, dateStringBack);
    }
}
