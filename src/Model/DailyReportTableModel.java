/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus
 */
public class DailyReportTableModel extends AbstractTableModel{
    
    String[] header ={"No","Delivery Man", "Total Deliveries Completed","Distance Travelled"};

    @Override
    public int getRowCount() {
       return 0;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
