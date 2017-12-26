/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.HomePage;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus
 */
public class DailyReportTableModel extends AbstractTableModel{
    
    String[] header ={"No","Name", "Total Deliveries Completed","Distance Travelled"};
    
    String[][] fixedText = {{"1","Wee Kian Huat","5","20"},
        {"2","AHuat White Coffee","3","15"},
       };
    
    
    public DailyReportTableModel(){
    
        
}

    @Override
    public int getRowCount() {
       return fixedText.length;
    }
    
    

    @Override
    public int getColumnCount() {
        return header.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return header[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object obj = null;
        switch(columnIndex){
            case 0 :
                obj = fixedText[rowIndex][columnIndex];
                break;
            case 1 :
                obj = fixedText[rowIndex][columnIndex];
                break;
            case 2 :
                obj = fixedText[rowIndex][columnIndex];
                break;
            case 3 :
                obj = fixedText[rowIndex][columnIndex];
        }
        
        return obj;
    }
    
}
