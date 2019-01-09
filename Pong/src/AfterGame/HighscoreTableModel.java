/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfterGame;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Chauntalle Schüle, Dominik Gryska, Ivan 
 */
public class HighscoreTableModel extends AbstractTableModel {

    private String[] columns = {"Player", "Score"};
    private LinkedList<Highscore> highscores;

    public HighscoreTableModel() {
//        this.highscores = highscores;
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
        if(columnIndex == 0) {
            return highscores.get(rowIndex).getPlayerName();
        }
        return highscores.get(rowIndex).getScore();
        
    }

}
