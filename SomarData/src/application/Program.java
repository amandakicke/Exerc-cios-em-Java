package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2022-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		int dayOfTheMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println(sdf.format(d));	
		System.out.println(dayOfTheMonth);
		System.out.println(minutes);
		
	}

}
