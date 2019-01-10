/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfterGame;

/**
 *
 * @author chSch
 */
public class Highscore {

    public final String playerName;
    public final int score;

    public Highscore(String playerName, Integer score) {
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    int getScore() {
        return score;
    }
    
    @Override
    public String toString() {
        return String.format("%s/%s", getPlayerName(), getScore());
    }
}
