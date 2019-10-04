package Logic_Building;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Getday {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat simpledateformat = new SimpleDateFormat("E");
       // System.out.println(simpledateformat.format(now));
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        System.out.println(simpleDateformat.format(now));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	}

}
