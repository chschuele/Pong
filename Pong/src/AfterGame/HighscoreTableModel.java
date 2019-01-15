/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfterGame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Chauntalle Schüle, Dominik Gryska, Ivan
 */
public class HighscoreTableModel extends AbstractTableModel {

    private String[] columns = {"Player", "Score"};
    private ArrayList<Highscore> highscores;

    public HighscoreTableModel() {
        this.highscores = new ArrayList<>();
        try {
            String scores = HttpRequest.getRequest("http://dreamlo.com/lb/5c35f6e4b6397e0c2406823a/pipe");
            String[] scorelines = scores.split("\n");
            for (String scoreline : scorelines) {
                String[] data = scoreline.split("\\|");
                highscores.add(new Highscore(data[0], Integer.parseInt(data[1])));
            }
        } catch (IOException ex) {
            Logger.getLogger(HighscoreTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return highscores.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return highscores.get(rowIndex).getPlayerName();
        }
        return highscores.get(rowIndex).getScore();

    }

}
