/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiOfFaculty;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author test
 */
public class TimeTable extends javax.swing.JFrame {

    /**
     * Creates new form TimeTable
     */
    public TimeTable() {
        initComponents();
        fillTable();
    }

    
    void fillTable(){
        
                javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)jTable1.getModel();
        
        int count = dtm.getRowCount();
        
        while(count-- > 0){
            dtm.removeRow(0);
        }
        try{
        
            ResultSet rs = db.dbConnect.st.executeQuery("Select * from timetable where TimeTable = 'Monday'");
        
                rs.next();
                
                Vector v = new Vector();
                v.add(rs.getString("TimeTable"));
                v.add(rs.getString("Lecture1"));
                v.add(rs.getString("Lecture2"));
                v.add(rs.getString("Lecture3"));
                v.add(rs.getString("Lecture4"));
                v.add(rs.getString("Lecture5"));
                v.add(rs.getString("Lecture6"));
                v.add(rs.getString("Lecture7"));
                
                dtm.addRow(v);
            
                rs.close();
                
                rs = db.dbConnect.st.executeQuery("Select * from timetable where TimeTable = 'Tuesday'");
        
                rs.next();
                
                v = new Vector();
                v.add(rs.getString("TimeTable"));
                v.add(rs.getString("Lecture1"));
                v.add(rs.getString("Lecture2"));
                v.add(rs.getString("Lecture3"));
                v.add(rs.getString("Lecture4"));
                v.add(rs.getString("Lecture5"));
                v.add(rs.getString("Lecture6"));
                v.add(rs.getString("Lecture7"));
                
                dtm.addRow(v);
                
                rs.close();
                
                rs = db.dbConnect.st.executeQuery("Select * from timetable where TimeTable = 'Wednesday'");
        
                rs.next();
                
                v = new Vector();
                v.add(rs.getString("TimeTable"));
                v.add(rs.getString("Lecture1"));
                v.add(rs.getString("Lecture2"));
                v.add(rs.getString("Lecture3"));
                v.add(rs.getString("Lecture4"));
                v.add(rs.getString("Lecture5"));
                v.add(rs.getString("Lecture6"));
                v.add(rs.getString("Lecture7"));
                
                dtm.addRow(v);
                
                rs.close();
                
                rs = db.dbConnect.st.executeQuery("Select * from timetable where TimeTable = 'Thursday'");
        
                rs.next();
                
                v = new Vector();
                v.add(rs.getString("TimeTable"));
                v.add(rs.getString("Lecture1"));
                v.add(rs.getString("Lecture2"));
                v.add(rs.getString("Lecture3"));
                v.add(rs.getString("Lecture4"));
                v.add(rs.getString("Lecture5"));
                v.add(rs.getString("Lecture6"));
                v.add(rs.getString("Lecture7"));
                
                dtm.addRow(v);
                
                rs.close();
                
                rs = db.dbConnect.st.executeQuery("Select * from timetable where TimeTable = 'Friday'");
        
                rs.next();
                
                v = new Vector();
                v.add(rs.getString("TimeTable"));
                v.add(rs.getString("Lecture1"));
                v.add(rs.getString("Lecture2"));
                v.add(rs.getString("Lecture3"));
                v.add(rs.getString("Lecture4"));
                v.add(rs.getString("Lecture5"));
                v.add(rs.getString("Lecture6"));
                v.add(rs.getString("Lecture7"));
                
                dtm.addRow(v);
                
                rs.close();
                
                rs = db.dbConnect.st.executeQuery("Select * from timetable where TimeTable = 'Saturday'");
        
                rs.next();
                
                v = new Vector();
                v.add(rs.getString("TimeTable"));
                v.add(rs.getString("Lecture1"));
                v.add(rs.getString("Lecture2"));
                v.add(rs.getString("Lecture3"));
                v.add(rs.getString("Lecture4"));
                v.add(rs.getString("Lecture5"));
                v.add(rs.getString("Lecture6"));
                v.add(rs.getString("Lecture7"));
                
                dtm.addRow(v);
                
                rs.close();
                
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIME TABLE", "10:00 - 10:30  (Lecture 1)", "10:30 - 11:00 (Lecture 2)", "11:00 - 11:30 (Lecture 3)", "12:00 : 12:30 (Lecture 4)", "12:30 : 01:00 (Lecture 5)", "01:00 : 01:30 (Lecture 6)", "01:30 : 02:00 (Lecture 7)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIME TABLE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(545, 545, 545))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fillTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
