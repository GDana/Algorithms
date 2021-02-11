package programmers.level1.done;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ex01 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 해시 > 완주하지 못한 선수

		/**
		 * 1. HashMap으로 구현
		 * 2. 동일하지 않은 값은 반환 
		 */

		/**/
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		System.out.println(solution(participant, completion));
		
		
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solution(participant2, completion2));
		
		
		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "mislav", "ana"};
		
		System.out.println(solution(participant3, completion3));
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String player : participant) map.put(player, map.getOrDefault(player, 0) + 1);
		System.out.println(map.toString());
		for(String player : completion) map.put(player, map.get(player) -1);
		System.out.println(map.toString());
		
		for(String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer = key;
			}
		}
		
		return answer;
	}
	
	/*
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		for(int i=0; i<participant.length; i++) {
			map1.put(i, participant[i]);
		}
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		for(int i=0; i<completion.length; i++) {
			map2.put(i, completion[i]);
		}
		
		Iterator<Integer> keys = map1.keySet().iterator();
		for(Integer i : map1.keySet()){
			if(!map2.containsKey(map1.get(i))) {
				answer = map1.get(i);
				break;
			};
		}
	
		
		return answer;
	}
	 */
}
