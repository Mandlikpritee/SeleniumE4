package DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class Dateformat {
@Test
public void main() {
	Date date=new Date();
	System.out.println(date);
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	String currentdate=sdf.format(date);
	System.out.println(currentdate);
	Calendar cal=sdf.getCalendar();
	cal.add(Calendar.DAY_OF_MONTH, 90);
	String afterdate=sdf.format(cal.getTime());
	System.out.println(afterdate);
	
	
}
}
