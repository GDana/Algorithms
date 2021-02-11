package baekjoon.done;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class A1924 {
	public static void main(String[] args) {
		/* 2007��
		 * https://www.acmicpc.net/problem/1924
		 */
		Scanner sc = new Scanner(System.in);
		Calendar cal = new GregorianCalendar();
//		Calendar cal = Calendar.getInstance();
		String str; 
		int month, date;
		String[] arr = new String[2];
		
		str = sc.nextLine();
		for(int i = 0; i < arr.length; i++) {
			arr = str.split(" ");			
		}		
		month = Integer.parseInt(arr[0]);
		date = Integer.parseInt(arr[1]);		
		
		cal.set(Calendar.YEAR, 2007);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, date);
		
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println("SUN");
			break;
		case 2:
			System.out.println("MON");
			break;
		case 3:
			System.out.println("TUE");
			break;
		case 4:
			System.out.println("WED");
			break;
		case 5:
			System.out.println("THU");
			break;
		case 6:
			System.out.println("FRI");
			break;
		case 7:
			System.out.println("SAT");
			break;
		}
		
	}
}
