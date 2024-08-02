package genericlibOrUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaLibrary 
{
	/**
	 * this method is to create random number
	 * @param bound
	 * @return
	 */
	public int generateRandomNumber(int bound)
	{
		Random r=new Random();
		int num=r.nextInt(bound);
		return num;
	}
	
	/**
	 * This is a generic method to handle calendar
	 * @param formatType
	 * @return
	 */
	public String calendarHandling(String formatType)
	{
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(formatType);
		String date=sdf.format(d);
		return date;
	}
	
}
