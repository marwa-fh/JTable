/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjtable;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author user
 */
public class Exoo {
JTextField f1,f2,f3,f4;
      JLabel l1,l2,l3,l4;
      JComboBox cb;
      JCheckBox cc;
      JButton b1,b2,b3;
      JFrame f;
      int posRow=-1;
  public Exoo(){
     JFrame f = new JFrame();
      JPanel p1 = createP1();
      f.add(p1);
       f.setSize(500,500);
       f.setVisible(true);
       f.setLocationRelativeTo(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
  }
  
  public JPanel createP1(){
      JPanel p = new JPanel();
      
      l1 = new JLabel("ID");
      l2 = new JLabel("FN");
      l3 = new JLabel("LN");
      l4 = new JLabel("AGE");
      
      
      f1 = new JTextField(20);
      f2 = new JTextField(20);
      f3 = new JTextField(20);
      f4 = new JTextField(20);
      
      cc =  new  JCheckBox("ScholarShip");
      
      
     
       JPanel p1= new JPanel();
       p1.setLayout(new GridLayout(5,2));
       p1.add(l1);
       p1.add(f1);
       p1.add(l2);
       p1.add(f2);
       p1.add(l3);
       p1.add(f3);
       p1.add(l4);
         p1.add(f4);
         p1.add(cc);
         
         
         
         JPanel p2 = new JPanel();
    
         b1 = new JButton("add");
         b2 = new JButton("modify");
         b3 = new JButton("remove");
         
         
         
         p2.add(b1);
         p2.add(b2);
         p2.add(b3);
         
       JPanel p3 = new JPanel();
      
       String [] headers = {"id", "name","lastname","age","scholarship"};
       
        //MyModelExtendsAbstract model = new MyModelExtendsAbstract(data,headers);
         MyTableModel model = new MyTableModel();
        
        model.setColumnIdentifiers(headers);
        JTable t = new JTable(model);
       JScrollPane spane = new JScrollPane(t);
        t.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
                  @Override
                  public void valueChanged(ListSelectionEvent lse) {
                      if(!t.getSelectionModel().isSelectionEmpty()){
                     f1.setText(""+ t.getValueAt(t.getSelectedRow(), 0));
                     f2.setText(""+ t.getValueAt(t.getSelectedRow(), 1));
                     f3.setText(""+ t.getValueAt(t.getSelectedRow(), 2));
                     f4.setText(""+ t.getValueAt(t.getSelectedRow(), 3));
                     if(t.getValueAt(t.getSelectedRow(), 4).equals(true))
                         cc.setSelected(true);
                     else
                         cc.setSelected(false);
                     posRow = t.getSelectedRow();
                  }
                  }
                  
              });
       
       b1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              
              
              boolean b;
              if(cc.isSelected())
                  b=true;
              else
                  b=false;
              Object [] entry = {f1.getText(),f2.getText(),f3.getText(),f4.getText(),b};
             
              model.addRow(entry);
              clear();
              
              
              
          }

          private void clear() {
              f1.setText("");
              f2.setText("");
              f3.setText("");
              f4.setText("");
              cc.setSelected(false);
          }
      });
       
       b2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              if(posRow!=-1){
              int j = posRow;
              t.setValueAt(f1.getText(), j, 0);
              t.setValueAt(f2.getText(), j, 1);
               t.setValueAt(f3.getText(), j, 2);
                t.setValueAt(f4.getText(), j, 3);
                  boolean b;
              if(cc.isSelected())
                  b=true;
              else
                  b=false;
                   t.setValueAt(b, 0, 4);
                   t.getSelectionModel().clearSelection();
                    posRow=-1;
              }
             
          }
      });
       
       b3.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
             model.removeRow(posRow);
             posRow=-1;
          }
      });
       
       
         
        p3.add(spane);
         p.add(p1);
         p.add(p2);
         p.add(p3);
         
      return p;
      
  }
    public static void main(String[] args) {
       new Exoo();
    }
    
}
