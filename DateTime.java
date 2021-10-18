	package sample.sample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {

	public static void main(String[] args) {

//		in Java8, LocalDate/LocalDateTime is coming from the following package ''time.Date/time.DateTime''
//		LocalDate only gets the ''Date'' whereas LocalDateTime gets you the ''Date along with time''
//		Using Periods we can calculate difference b/w years, months days and so many
		
		
/*														Date
						-------------------------------------------------------------------------------------------------
							LocalDate(it prints only Date Ex :2018-07-30)					LocalDateTime(it prints Date and Time Ex: 2018-07-30T14:46:39.119)
						---------------------------------------------						--------------------------------------
								  Date						   Time							(No Sub Packages in it)
								   |                     		|	
						  ------------------           ------------------                         getYear()                         		
								getYear()					getHour()							  getMonthValue()	    
								getMonthValue()				getMinute()							  getDayOfMonth()		 		
								getDayOfMonth()				getSecond()							  getHour()
															getNano()							  getMinute()
																								  getSecond()
																								  getNano()		
																								  
																								  
																								  
			The below Methods are available ONLY in localDate package. 
				plusYears(),minusYears()
				plusMonths(),minusMonths()
				plusDays(), minusDays()
			Why not in LocalDateTime .? as it fetches Time along with the date you cannot use plusYears/MinusYears... directly	
			
			                                                            Period
										------------------------------------------------------------------------------
																		Between
																		  |
																   -----------------
																        getYears()
																        getMonths()
																        getDays()						  
																								  
*/		
		
		
		
		
/*															Date
											------------------------------------
		LocalDate ((	getYear() getMonthValue(), getDayOfMonth()	))				LocalTime ((  getHour() getMinute() getSecond() getNano()    	
		
*/
		
		
		
		//
		//Local Date is from  'LocalDate' Package
		LocalDate date = LocalDate.now();
		date.plusDays(1);
		System.out.println(date);//2018-07-30
		int year = date.getYear();//2018
		int monthValue = date.getMonthValue();//7
		int dayOfMonth = date.getDayOfMonth();//30
		
		System.out.printf("%d-%d-%d",year,monthValue,dayOfMonth);//2018-07-30
		
		Month monthName = date.getMonth();//JULY
		DayOfWeek dayOfWeek = date.getDayOfWeek();//FRIDAY

		
		
		
/*		 						LocalDate
					------------------------------------
					getYear  	getMonthValue   	getDayOfMonth
					
*/
		
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int nano = time.getNano();
		
		System.out.printf("%d:%d:%d:%d",hour,minute,second,nano);//2018-7-3014:20:46:508000000
		
/*		 						LocalTime
					------------------------------------
					getHour  	getMinute   getSecond 	getNano
		
*/
	  	
		
		// LocalDateTime
		
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime localDateTimeNow = LocalDateTime.now();
		int year2 = localDateTimeNow.getYear();
		int monthValue2 = localDateTimeNow.getMonthValue();
		int dayOfMonth2 = localDateTimeNow.getDayOfMonth();
		int hour2 = localDateTimeNow.getHour();
		int minute2 = localDateTimeNow.getMinute();
		int second2 = localDateTimeNow.getSecond();
		int nano2 = localDateTimeNow.getNano();
		
		
		
		
		LocalDate now = LocalDate.now();
//		LocalDate.of(year, monthValue, dayOfMonth);
		LocalDate birthDate = LocalDate.of(1991, 4, 12);
		//Since we have passed lesserYear first so it has given you in ''-'' format
//		Period period = Period.between(now, birthDate);//you Passed age is : -27 Years -3 Months -18  Days
		Period period = Period.between(birthDate, now);//you Passed age is : 27 Years 3 Months 18  Days
		System.out.printf("you Passed age is : %d Years %d Months %d  Days", period.getYears(), period.getMonths(), period.getDays());
		
		
		LocalDate birthDate1 = LocalDate.of(1991, 4, 12);
		LocalDate birthDate2 = LocalDate.of(1993, 4, 21);
		Period period2 = Period.between(birthDate1, birthDate2);
		System.out.printf("Difference b/w your age is : %d Years  %d Months %d Days ", period2.getYears(), period2.getMonths(), period2.getDays() );
		
		

		LocalDate birthDate01 = LocalDate.of(1991+60, 4, 12);
		LocalDate deathDate = LocalDate.now();
		Period period02 = Period.between(deathDate, birthDate01);
		System.out.printf("Differenceb/w your age is : %d Years  %d Months %d Days ", period02.getYears(), period02.getMonths(), period02.getDays() );
		System.out.printf("\nTotal days we can live : %d ", period02.getYears()*365+period02.getMonths()*30+period02.getDays());
		
		

		Period periodOf = Period.of(1991, 12, 12);
		System.out.println(periodOf.plusDays(12));//P1991Y12M24D
		
		LocalDate dateLocal = LocalDate.of(1991, 12, 12);
		Period ofDays = Period.ofDays(2);
		LocalDate plus = dateLocal.plus(ofDays);
		System.out.println(plus);//1991-12-14
		
		
		//The below codes raises run time exception
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalDate parse = LocalDate.parse("2018-08-11T23:27:23", DateTimeFormatter.ISO_DATE);
										  //(Should not specify Date And Time)				
		
		
		

		//The below code executes perfectly fine
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, 6, 20);
		LocalDate date3 = LocalDate.parse("2014-06-2008", DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		
		//The  below code throws runTime Exception 
		LocalDate of = LocalDate.of(2011, 01, 32);
		of.plusDays(10);
		System.out.println(of);
		
		
		
		
		//Since we are comparing 2 different zones, it give result -2 hrs
		ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 2, 0, 0, 0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 10, 0, 0, 0, ZoneId.of("UTC-5"));
		long hrs = ChronoUnit.HOURS.between(depart, arrive); // line n1
		System.out.println("Travel time is" + hrs + "hours");

		//As we are comparing 2 same date zones, there is no change in result
		ZonedDateTime depart1 = ZonedDateTime.of(2015, 1, 15, 2, 0, 0, 0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive1 = ZonedDateTime.of(2015, 1, 15, 10, 0, 0, 0, ZoneId.of("UTC-7"));
		long hrs1 = ChronoUnit.HOURS.between(depart1, arrive1); // line n1
		System.out.println("Travel time is" + hrs + "hours");
		
		
		
		
		
	}

}