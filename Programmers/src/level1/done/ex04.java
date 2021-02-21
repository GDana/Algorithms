package level1.done;

import java.util.Calendar;

public class ex04 {
	
	public static void main(String[] args) {
		// 코딩테스트 연습 > 연습문제 > 2016년 
		System.out.println(solution(1, 1));
	}

	public static String solution(int a, int b) {
        String answer = "";
        
        Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, a-1);
		cal.set(Calendar.DATE, b);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(day) {
		case 1: 
			answer = "SUN";
			break;
		case 2:
			answer = "MON";
			break;
		case 3:
			answer = "TUE";
			break;
		case 4:
			answer = "WED";
			break;
		case 5:
			answer = "THU";
			break;
		case 6:
			answer = "FRI";
			break;
		case 7:
			answer = "SAT";
			break;
		}
		
        return answer;
    }
}
