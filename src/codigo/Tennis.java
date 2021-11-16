
package codigo;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Tennis {
	private NumberToLetterConverter codigo;
	private int totalScorePlayerOne = 0;
	private int totalScorePlayerTwo = 0;

	private int scorePlayerOne = 0;
	private int scorePlayerTwo = 0;


	public String addPoints(int a){

		if(a == 1){
			if (scorePlayerOne == 0){
				scorePlayerOne = 15;
			}
			else if(scorePlayerOne == 15){
				scorePlayerOne = 30;
			}
			else if(scorePlayerOne == 30){
				scorePlayerOne = 40;
			}
			else {
				scorePlayerOne = 0;
				scorePlayerTwo = 0;
				totalScorePlayerOne = totalScorePlayerOne + 1;
			}
		}
		if(a == 2){
			if (scorePlayerTwo == 0){
				scorePlayerTwo = 15;
			}
			else if(scorePlayerTwo == 15){
				scorePlayerTwo = 30;
			}
			else if(scorePlayerTwo == 30){
				scorePlayerTwo = 40;
			}
			else {
				scorePlayerOne = 0;
				scorePlayerTwo = 0;
				totalScorePlayerTwo = totalScorePlayerTwo + 1;
			}
		}
		
		String labelScorePlayerOne = "Player 1: " + scorePlayerOne + "  Set: " + totalScorePlayerOne + "      " + "Player 2: " + scorePlayerTwo + "  Set: " + totalScorePlayerTwo;

		return labelScorePlayerOne;
	}
	
}
