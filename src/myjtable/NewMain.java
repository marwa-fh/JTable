/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author user
 */
public class NewMain {
    
    
 public NewMain(){
     JFrame f = new JFrame();
     f.setTitle("Table");
     String[] headers ={"id","name","score","pASSed"};
     Object [][] data = {
         {1,"ali",90,new Boolean(true)},
          {1,"ahmad",90,new Boolean(false)},
           {2,"abeer",90,new Boolean(false)},
            {4,"sara",90,new Boolean(true)},
     };
     
       MyModelExtendsAbstract model = new MyModelExtendsAbstract(data,headers);
       JTable t = new JTable(model);
       JScrollPane spane = new JScrollPane(t);
       f.add(spane);
     f.setSize(500,500);
       f.setVisible(true);
       f.setLocationRelativeTo(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
 }   
    
    
    
  
    
    public static void main(String[] args) {
       new NewMain();
    }
    
}
