/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjtable;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class MyTableModel extends DefaultTableModel {
    public MyTableModel(){
        super();
    }

   
    @Override
    public Class<?> getColumnClass(int columnIndex) {
       if(columnIndex==4)
           return Boolean.class;
       else
           return String.class;
    }
    
}
