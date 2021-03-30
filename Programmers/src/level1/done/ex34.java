package level1.done;

import java.util.ArrayList;
import java.util.Arrays;

public class ex34 {

	public static void main(String[] args) {
		// 코딩테스트 연습 > 2019 카카오 개발 겨울 인턴십 > 크레인 인형뽑기 게임 

		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		solution1(board, moves);
	}
	
	public static int solution1(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        
        for(int h = 0; h < moves.length; h++) {
        	int idx = moves[h]-1;
	        for(int i = 0; i < board.length; i++) {
	        	if(board[i][idx] != 0) {
	        		System.out.print(board[i][idx] + " ");
	        		list.add(board[i][idx]);
	        		board[i][idx] = 0;
	        		break;
	        	}
	        }
        }
        System.out.println();
        while(true) {
        	for(int i = 0; i < list.size(); i++) {
        		if(list.get(i) == list.get(i+1)) {
        			System.out.println(list.get(i) + " == " + list.get(i+1));
        			list.remove(i);
        			list.remove(i+1);
        			answer++;
        		}else if(list.get(i) != list.get(i+1)) {
        			System.out.println(answer);
        			return answer;
        		}
        	}
        }
    }

	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        
        for(int i = 0; i < moves.length; i++) {
        	int movesIdx = moves[i];
        	
        	for(int j = 0; j < board.length; j++) {
        		
        		//if(board[j][i] == 0) continue;
        		
        		//list.add(board[j][i]);
        		System.out.println(board[j]);
        		//System.out.println(board[j][movesIdx]);
        		
        		/*
        		if(list.size() > 0) {
        			int temp = index - 2;
        			temp = temp < 0 ? 0 : temp;
        			
        			if(list.get(index - 1) == list.get(index)) {
        				list.remove(index - 1);
        				list.remove(index);
        				index = temp;
        				answer++;
        			}
        		}
        		index = index == 0 ? index : index + 1;
        		break;
        		*/        		        		
        	}
        }
        System.out.println(list.toString());
        //System.out.println(answer);
        
        return answer;
    }
}
