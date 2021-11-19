
package codigo;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Tennis {
	private boolean gameStatus = true;
	private int[] playersScores = {0,0};
	private int[] scores = {0,15,30,40};

	public String addPoints(int player){
		String labelStatus = "";
		if(!gameStatus){
			return "Game over";
		}
		if(playersScores[player]<40) {
			playersScores[player] = scores[Arrays.binarySearch(scores, playersScores[player]) + 1];
			if(playersScores[0] == playersScores[1] && playersScores[0] == 40){
				labelStatus = "deuce";
			}
		}else{
			playersScores[player] = playersScores[player] + 1;
			if(playersScores[0] == playersScores[1]){
				playersScores[0] = 40;
				playersScores[1] = 40;
				labelStatus = "deuce";
			}
			if(playersScores[0] == playersScores[1]+1){
				labelStatus = "Advantage PlayerOne";
			}
			else if(playersScores[1] == playersScores[0]+1) {
				labelStatus = "Advantage PlayerTwo";
			}
			else if((playersScores[0] == playersScores[1]+2) || (playersScores[0] == 41 && playersScores[0] > playersScores[1])){
				labelStatus = "PlayerOne Wins";
				gameStatus = false;
			}
			else if((playersScores[1] == playersScores[0]+2) || (playersScores[1] == 41 && playersScores[1] > playersScores[0])){
				labelStatus = "PlayerTwo Wins";
				gameStatus = false;
			}
		}

		String labelScorePlayerOne = "Player 1: " + playersScores[0] + " - " + "Player 2: " + playersScores[1] + " ("+labelStatus+")";
		return labelScorePlayerOne;
	}

}
