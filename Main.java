// STUDENT NAME: Daniel Cook
// DATE: February 4, 2025
//CS111 SECTION: 3033

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION + INITIALIZATION SECTION *****/
		int monthToday, dayToday, yearToday; 
		int monthBday, dayBday, yearBday;
		int diffInDays, ageInYears;
		int jdnToday, jdnBday;
		monthToday = 2; dayToday = 4; yearToday = 2025;
		monthBday = 10; dayBday = 15; yearBday = 1993;
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
		//CALCULATE JDN TODAY//
		int a1 = (14 - monthToday) / 12;
		int m1 = monthToday + (12 * a1) - 3;
		int y1 = yearToday + 4800 - a1;
		jdnToday = dayToday + ((153 * m1 + 2) / 5 + (365 * y1) + (y1 / 4) - (y1 / 100) + (y1 / 400) - 32045);
		//CALCULATE JDNBDAY//
		int a2 = (14 - monthBday) / 12;
		int m2 = monthBday + (12 * a2) - 3;
		int y2 = yearBday + 4800 - a2;
		jdnBday = dayBday + ((153 * m2 + 2) / 5 + (365 * y2) + (y2 / 4) - (y2 / 100) + (y2 / 400) - 32045);
		//CALCULATE AGE IN YEARS//
		diffInDays = jdnToday - jdnBday;
		ageInYears = diffInDays / 365;
		
		/***** OUTPUT SECTION *****/
		System.out.println ("Julian day number for today's date, " + monthToday + "/" + 
							dayToday + "/" + yearToday + ", is " + jdnToday + "\n");
		System.out.println ("Julian day number for birthday, " + monthBday + "/" + 
							dayBday + "/" + yearBday + ", is " + jdnBday + "\n");
		System.out.println ("The difference in days is " + diffInDays + ", which makes you approximately " 
							+ ageInYears + " years old!");
  }
}