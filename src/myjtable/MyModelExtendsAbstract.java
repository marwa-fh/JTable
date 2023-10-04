/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjtable;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class MyModelExtendsAbstract  extends AbstractTableModel{
     Object[][] lines;
     String[] headers;
    public MyModelExtendsAbstract(Object[][] lines, String[] headers){
        super();
         this.lines= lines;
         this.headers= headers;
        
    }
    
    
    
    @Override
    public int getRowCount() {
        return lines.length;
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return lines[row][column];
    }

   
    

    @Override
    public Class<?> getColumnClass(int columnIndex) {
       if(columnIndex==4){
           return Boolean.class;
       }
       else 
           return String.class;

    }

   
   
}
