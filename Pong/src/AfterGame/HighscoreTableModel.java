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

    public HighscoreTableModel(LinkedList<Highscore> highscores) {
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return rowIndex + 1;
        }
        //if(columnIndex == 1) return ;
        return null;
    }

}
