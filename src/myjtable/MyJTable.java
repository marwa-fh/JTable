/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjtable;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author user
 */
public class MyJTable {
     Object[][] data;
    public MyJTable(){
        
      createGUI();
    }
   void createGUI(){
       
       int i, id ;
       String  fname,lname;
        Scanner scan = new Scanner(System.in);
       JFrame f = new JFrame();
       f.setTitle("table");
       String[] headers ={"ID","fname","lname"};
        data = new Object[4][3];
       //MyTableModel model = new MyTableModel();
      
      // 
       
       
       
      
       for(i=0;i<4;i++){
           System.out.println("please enter your id"+(i+1));
           id =scan.nextInt();
               System.out.println("please enter first name "+(i+1));
               fname=scan.next();
                   System.out.println("please enter last name " +(i+1));
                   lname=scan.next();
                   
                  // model.addRow(new Object[]{id,fname,lname});
               data[i][0]=id;
               data[i][1]=fname;
               data[i][2]=lname;
       }
        MyModelExtendsAbstract model = new MyModelExtendsAbstract(data,headers);
       JTable t = new JTable(model);
       JScrollPane spane = new JScrollPane(t);
       
       f.add(spane);
       
       
       
       
       
       
       f.setTitle("TableModel");
       f.setSize(500,500);
       f.setVisible(true);
       f.setLocationRelativeTo(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
   }
    
    
    
    
    public static void main(String[] args) {
       new MyJTable();
    }

   

    
    
}
