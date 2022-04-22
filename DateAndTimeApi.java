
/*Prior java 8 we had two DateAndTime packages
1)DateandTime Sql - deals with database dates
2)DateandTime Java - machine specific dates
for formatting date we needed to import java.text.* package
mutable classes
*/

import java.time.*; //only one package 'Time' insted of sql and java

public class DateAndTimeApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		LocalDate d1 = LocalDate.of(1997, Month.OCTOBER, 5);
		LocalDate d2 = LocalDate.of(1997, 10, 5);
		System.out.println(d.isBefore(d2));

		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		
		LocalTime t= LocalTime.now();
		LocalTime t1= LocalTime.of(7, 5, 45);
		LocalTime t2=LocalTime.MAX;
		
		for(String s: ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
		
		LocalTime t3=LocalTime.now(ZoneId.of("US/Pacific"));

		Instant i=Instant.now(); //GMT //Machine readable
		
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(i);
		
		LocalDateTime dt=LocalDateTime.now();
		
		System.out.println(dt);
		
		


	}

}
