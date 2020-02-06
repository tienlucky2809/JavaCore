package Core2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
        String str = "11-11-2020";
        try {
            Date date1 = simpleDateFormat.parse(str);
            System.out.println(simpleDateFormat.format(date1));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
