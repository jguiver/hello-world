package asteroidsMenu;

import java.util.Arrays;

public class Goofing {
	
	private static int[] scores = new int[6];
	private static int newScore = 0;

	public static void main(String[] args) {
		run();
		
		scores[0] = 90;
		scores[1] = 20;
		scores[2] = 50;
		scores[3] = 3;
		scores[4] = 15;
		scores[5] = -5;
		
		Arrays.sort(scores);
		
		highScores(900);
		
		for(int i: scores){
			System.out.println(i);
		}
		
	}
	
	public static String run(){
		return "Hello World";
	}
	
	public static void highScores(int newHighScore){
		for(int i = 0; i < scores.length; i++){
		while(scores[i] < newHighScore){
			scores[i] = newHighScore;
		}
		}
	}
	

}
