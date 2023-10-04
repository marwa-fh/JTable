/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjtable;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Student_Record extends javax.swing.JFrame {

    /**
     * Creates new form Student_Record
     */
    public Student_Record() {
        initComponents();
       
        
    }
PreparedStatement pst ;
PreparedStatement pst2 ;
        Connection con;
        ResultSet rs1;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jStudentId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jI3304 = new javax.swing.JTextField();
        jI3305 = new javax.swing.JTextField();
        jI3350 = new javax.swing.JTextField();
        jI3302 = new javax.swing.JTextField();
        jI3301 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScore = new javax.swing.JTextField();
        jAverage = new javax.swing.JTextField();
        jRanking = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jTextField2 = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        jTextField3 = new javax.swing.JTextField();
        Ranking = new javax.swing.JButton();
        jTranscript = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Student id");

        jStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStudentIdActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Records");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("I3304");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("I3305");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("I3350");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("I3302");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("I3301");

        jI3304.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jI3304ActionPerformed(evt);
            }
        });
        jI3304.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jI3304KeyTyped(evt);
            }
        });

        jI3305.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jI3305ActionPerformed(evt);
            }
        });
        jI3305.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jI3305KeyTyped(evt);
            }
        });

        jI3350.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jI3350KeyTyped(evt);
            }
        });

        jI3302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jI3302ActionPerformed(evt);
            }
        });
        jI3302.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jI3302KeyTyped(evt);
            }
        });

        jI3301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jI3301ActionPerformed(evt);
            }
        });
        jI3301.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jI3301KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Total Score:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Average:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ranking:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "I3304", "I3305", "I3350", "I3302", "I3301", "TotalScore", "Average", "Ranking"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Nb of student in first class");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Nb of student in second class");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Nb of failed students");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        Ranking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ranking.setText("Ranking");
        Ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingActionPerformed(evt);
            }
        });

        jTranscript.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTranscript.setText("Transcript");
        jTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTranscriptActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Enter id:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jToggleButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton4.setText("Find");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton5.setText("Delete");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton6.setText("Total id");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jI3304)
                                    .addComponent(jI3305)
                                    .addComponent(jI3350)
                                    .addComponent(jI3302)
                                    .addComponent(jI3301, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(221, 221, 221)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel10))
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScore, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(84, 84, 84))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(628, 628, 628)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jToggleButton6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jToggleButton4)
                                    .addGap(15, 15, 15)
                                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Ranking, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(494, 494, 494)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButton4)
                                    .addComponent(jToggleButton5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(jI3304, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(jScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(jToggleButton6)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jI3305, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jI3350, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jI3302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jI3301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jTranscript)
                            .addComponent(Ranking))
                        .addContainerGap(267, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void table_Update2(){
        int c;
         Connection con= null;
         String url ="jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true;";
        
        try {
              
            
            
            
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
              con =DriverManager.getConnection(url);
              
            PreparedStatement pst = con.prepareStatement("select * from studentRecords");
               
              ResultSet rs = pst.executeQuery();
              
              ResultSetMetaData Rss = rs.getMetaData();
             
              c = Rss.getColumnCount();
              DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
              df.setRowCount(0);
                while(rs.next()){
                    Vector v2 = new Vector();
                    for(int b=1; b<=c;b++){
                        v2.add(rs.getString("idr"));
                        v2.add(rs.getString("I3304"));
                        v2.add(rs.getString("I3305"));
                        v2.add(rs.getString("I3350"));
                        v2.add(rs.getString("I3302"));
                        v2.add(rs.getString("I3301"));
                        v2.add(rs.getString("score"));
                        v2.add(rs.getString("average"));
                        v2.add(rs.getString("ranking"));
                    }
                    df.addRow(v2);
                }
                 
                  
                 
        }catch (SQLException | ClassNotFoundException ex) { 
                JOptionPane.showMessageDialog(null,"Impossible to connect " + ex.toString()); 
              } 
         finally { 
              if(con!=null)
          try {
              con.close();
               
                 } catch (SQLException e1) {
                } 
    }                                   
              
    }                                        

     
    

    
    
    
    
    
    
    
    
    
    
    
    private void jStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStudentIdActionPerformed

    private void jI3304ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jI3304ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jI3304ActionPerformed

    private void jI3305ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jI3305ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jI3305ActionPerformed

    private void jI3302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jI3302ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jI3302ActionPerformed

    private void jI3301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jI3301ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jI3301ActionPerformed
    private  JFrame  frame;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frame = new JFrame(" Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Clear textfield System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingActionPerformed
       Connection con= null;
         String url ="jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true;";
        try {
        double [] R = new double [8];
        R[0] = Double.parseDouble(jI3304.getText());
        R[1] = Double.parseDouble(jI3305.getText());
        R[2] = Double.parseDouble(jI3350.getText());
        R[3] = Double.parseDouble(jI3302.getText());
        R[4] = Double.parseDouble(jI3301.getText());
        R[5] = R[0] + R[1] + R[2] + R[3] + R[4];
        R[6] = (R[0] + R[1] + R[2] + R[3] + R[4])/5;
        String TotalScore = String.format("%.0f", R[5]);
        jScore.setText(TotalScore);
        String Average = String.format("%.0f", R[6]);
        jAverage.setText(Average);
        if( R[5]>= 400){
            jRanking.setText("1st");
        }
        else if( R[5]>= 300){
            jRanking.setText("2nd");
        }
        else if( R[5]>= 250){
            jRanking.setText("3rd");
        }
        else {
            jRanking.setText("Failed");
        }
        
        
         
        
              String idr =  jStudentId.getText();
              String I3304 = jI3304.getText();
              String I3305 = jI3305.getText();
              String I3350 = jI3350.getText();
              String I3302 = jI3302.getText();
              String I3301 = jI3301.getText();
              String score= jScore.getText();
               String average= jAverage.getText();
                String ranking= jRanking.getText();
              
            
            
            
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
              con =DriverManager.getConnection(url);
              
            PreparedStatement pst = con.prepareStatement("insert into studentRecords(idr,I3304,I3305,I3350,I3302,I3301,score,average,ranking)values(?,?,?,?,?,?,?,?,?)");
               pst.setString(1, idr);
               pst.setString(2, I3304);
                pst.setString(3, I3305);
                pst.setString(4, I3350);
                pst.setString(5, I3302);
                pst.setString(6,I3301);
                pst.setString(7, score);
               pst.setString(8, average);
                pst.setString(9, ranking);
                
                
                pst.executeUpdate();
                 JOptionPane.showMessageDialog(null, " Student Records done.....");
                 
                jStudentId.setText("");
                jI3304.setText("");
                jI3305.setText("");
                jI3350.setText("");
                jI3302.setText("");
                jI3301.setText("");
                jScore.setText("");
                jAverage.setText("");
                jRanking.setText("");
                 table_Update2();
                 
        }catch (SQLException | ClassNotFoundException ex) { 
                JOptionPane.showMessageDialog(null,"Impossible to connect " + ex.toString()); 
              } 
         finally { 
              if(con!=null)
          try {
              con.close();
               
                 } catch (SQLException e1) {
                } 
    }                                   
              


      /*  DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{
            jStudentId.getText(),
            jI3304.getText(),
            jI3305.getText(),
            jI3350.getText(),
            jI3302.getText(),
            jI3301.getText(),
            jScore.getText(),
            jAverage.getText(),
            jRanking.getText(),
        });*/
    }//GEN-LAST:event_RankingActionPerformed

    private void jTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTranscriptActionPerformed
      /*PreparedStatement pst = null;
        Connection con= null;
        
         String url ="jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true;";
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
          
        }
        try {
            con =DriverManager.getConnection(url);
        
             pst = con.prepareStatement("print dbo.getNbS1()");
             pst.executeUpdate();
              
             pst = con.prepareStatement("dbo.getNbS()");
            pst.executeUpdate();
            
            pst = con.prepareStatement("dbo.getNbSF()");
            pst.executeUpdate();
           
        } catch (SQLException ex) {
           
        }
                     
      String firstclass = pst.toString();
       String secondclass = pst.toString();
        
        String failedclass = pst.toString();*/
       
         jTextArea1.append(
                "Student Result Recording System\n"+
                        ".....................\n"
                        +"\nI3304\t\t " +  jI3304.getText()
                +"\nI3305\t\t" +  jI3305.getText()
                +"\nI3350\t\t " +  jI3350.getText()
                +"\nI3302\t\t " +  jI3304.getText()
                +"\nI3301\t\t " +  jI3304.getText()
                + ".....................\n"
                        +"\nTotalScore\t\t" + jScore.getText()
                +"\nAverage\t\t " + jAverage.getText()
                +"\nRanking\t\t " + jRanking.getText()
                /*+ "\nNb of student in first class is :\t\t" + firstclass
                + "\nNb of student in second class is :\t\t" + secondclass
                 + "\nNb of student in failed class is :\t\t" + failedclass*/
        );
         
         
    }//GEN-LAST:event_jTranscriptActionPerformed

    private void jI3304KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jI3304KeyTyped
       char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber)))
           {
        evt.consume();
    }
    }//GEN-LAST:event_jI3304KeyTyped

    private void jI3305KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jI3305KeyTyped
        char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber)))
           {
        evt.consume();
    }
    }//GEN-LAST:event_jI3305KeyTyped

    private void jI3350KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jI3350KeyTyped
        char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber)))
           {
        evt.consume();
    }
    }//GEN-LAST:event_jI3350KeyTyped

    private void jI3302KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jI3302KeyTyped
        char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber)))
           {
        evt.consume();
    }
    }//GEN-LAST:event_jI3302KeyTyped

    private void jI3301KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jI3301KeyTyped
        char iNumber = evt.getKeyChar();
       if(!(Character.isDigit(iNumber)))
           {
        evt.consume();
    }
    }//GEN-LAST:event_jI3301KeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       
         String url ="jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true;";
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
            con =DriverManager.getConnection(url);
        
             pst = con.prepareStatement("select Count(*) as count from studentRecords where ranking='1st'");
             ResultSet rs1 = pst.executeQuery(); 
            if(rs1.next()){
                int count = rs1.getInt("count");
                String str = "" +count;
              jTextField1.setText(str);
            }
            // pst = con.prepareStatement("dbo.getNbS()");
            //pst.executeUpdate();
            // String secondclass = pst.toString();
           // pst = con.prepareStatement("dbo.getNbSF()");
           // pst.executeUpdate();
           //String failedclass = pst.toString();
          
        }catch (SQLException | ClassNotFoundException ex) { 
                JOptionPane.showMessageDialog(null,"Impossible to connect " + ex.toString()); 
              } 
         finally { 
              if(con!=null)
          try {
              con.close();
               
                 } catch (SQLException e1) {
                } 
                 } 
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
      
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        String url ="jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true;";
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
            con =DriverManager.getConnection(url);
        
             pst = con.prepareStatement("select Count(*) as count from studentRecords where ranking='2nd'");
  
             ResultSet rs1 = pst.executeQuery(); 
            if(rs1.next()){
                int count = rs1.getInt("count");
                String str = "" +count;
              jTextField2.setText(str);
            }
            // pst = con.prepareStatement("dbo.getNbS()");
            //pst.executeUpdate();
            // String secondclass = pst.toString();
           // pst = con.prepareStatement("dbo.getNbSF()");
           // pst.executeUpdate();
           //String failedclass = pst.toString();
          
        }catch (SQLException | ClassNotFoundException ex) { 
                JOptionPane.showMessageDialog(null,"Impossible to connect " + ex.toString()); 
              } 
         finally { 
              if(con!=null)
          try {
              con.close();
               
                 } catch (SQLException e1) {
                } 
                 } 
                                               
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
       String url ="jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true;";
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
            con =DriverManager.getConnection(url);
        
             pst = con.prepareStatement("select Count(*) as count from studentRecords where ranking='Failed'");
             ResultSet rs1 = pst.executeQuery(); 
            if(rs1.next()){
                int count = rs1.getInt("count");
                String str = "" +count;
              jTextField3.setText(str);
            }
            // pst = con.prepareStatement("dbo.getNbS()");
            //pst.executeUpdate();
            // String secondclass = pst.toString();
           // pst = con.prepareStatement("dbo.getNbSF()");
           // pst.executeUpdate();
           //String failedclass = pst.toString();
          
        }catch (SQLException | ClassNotFoundException ex) { 
                JOptionPane.showMessageDialog(null,"Impossible to connect " + ex.toString()); 
              } 
         finally { 
              if(con!=null)
          try {
              con.close();
               
                 } catch (SQLException e1) {
                } 
                 } 
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
       String url ="jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true;";
        
        try {
             
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
              con =DriverManager.getConnection(url);
               
               String I3304 = "I3304";
              String I3305 = "I3305";
              String I3350 = "I3350";
              String I3302 = "I3302";
              String I3301 = "I3301";
              String score= "score";
               String average= "average";
                String ranking= "ranking";
            PreparedStatement pst = con.prepareStatement("select idr,  I3304, I3305, I3350, I3302,I3301,score,average,ranking from studentRecords where idr = ?");
            int id = Integer.parseInt(jTextField4.getText());
            pst.setInt(1, id);
               
              ResultSet rs4 = pst.executeQuery();
               if(rs4.next()){
                   jStudentId.setText(rs4.getString("idr"));
                   jI3304.setText(rs4.getString("I3304"));
                   jI3305.setText(rs4.getString("I3305"));
                   jI3350.setText(rs4.getString("I3350"));
                   jI3302.setText(rs4.getString("I3302"));
                   jI3301.setText(rs4.getString("I3301"));
                   jScore.setText(rs4.getString("score"));
                   jAverage.setText(rs4.getString("average"));
                   jRanking.setText(rs4.getString("ranking"));
                   
               }
        }
    catch (SQLException | ClassNotFoundException ex) { 
                JOptionPane.showMessageDialog(null,"Impossible to connect " + ex.toString()); 
              } 
         finally { 
              if(con!=null)
          try {
              con.close();
               
                 } catch (SQLException e1) {
                } 
                 } 
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
         String url ="jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true;";
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
            con =DriverManager.getConnection(url);
        
             pst = con.prepareStatement("delete  from studentRecords where idr = ?");
             int id = Integer.parseInt(jTextField4.getText());
             pst.setInt(1, id);
            
             ResultSet rs4 = pst.executeQuery();
            if(rs4.next()){
                   jTextField4.setText(rs4.getString("deleted"));}
           
          
        }catch (SQLException | ClassNotFoundException ex) { 
                JOptionPane.showMessageDialog(null,"deleted " ); 
              } 
         finally { 
              if(con!=null)
          try {
              con.close();
               
                 } catch (SQLException e1) {
                } 
        }
    
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
       String url ="jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true;";
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
            con =DriverManager.getConnection(url);
        
             pst = con.prepareStatement("select id  from registration ");
             
            
            
             ResultSet rs1 = pst.executeQuery();
            while(rs1.next()){
                jComboBox1.setEditable(true);
                  
                  jComboBox1.addItem(rs1.getString(1));
            }
           
          
        }catch (SQLException | ClassNotFoundException ex) { 
                JOptionPane.showMessageDialog(null,"deleted " ); 
              } 
         finally { 
              if(con!=null)
          try {
              con.close();
               
                 } catch (SQLException e1) {
                } 
                 } 
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ranking;
    private javax.swing.JTextField jAverage;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jI3301;
    private javax.swing.JTextField jI3302;
    private javax.swing.JTextField jI3304;
    private javax.swing.JTextField jI3305;
    private javax.swing.JTextField jI3350;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jRanking;
    private javax.swing.JTextField jScore;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jStudentId;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JButton jTranscript;
    // End of variables declaration//GEN-END:variables
}
