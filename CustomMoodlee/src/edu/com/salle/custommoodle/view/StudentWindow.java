/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.com.salle.custommoodle.view;

import edu.com.salle.custommoodle.businesslogic.StudentBLO;
import edu.com.salle.custommoodle.model.Student;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class StudentWindow extends javax.swing.JFrame {

    /**
     * Creates new form StudentWindow
     */
    private StudentBLO studentBLO = new StudentBLO();
    public StudentWindow() {
        initComponents();
        setLocationRelativeTo(null); //para que traiga todo en su lugar
        studentBLO.load();
                clearTable();
                refreshTable(studentBLO.findAll());
//        setLocationRelativetTo(null); //muestre centrada
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        bUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tStudents = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtId2 = new javax.swing.JTextField();
        btnSearchId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel2.setText("LastName");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 50, 20));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 60, -1));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 60, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 90, 20));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, -1));

        jLabel3.setText("Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 20, 20));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 70, 20));

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(bUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 90, 20));

        tStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "LastName"
            }
        ));
        jScrollPane1.setViewportView(tStudents);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 350, 120));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 20));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 20, 80, -1));

        btnExit.setText("salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 80, 20));

        txtId2.setText("Id");
        getContentPane().add(txtId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 20));

        btnSearchId.setText("SearchId");
        btnSearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIdActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String lastName = txtLastName.getText();
        Student student = new Student(name, lastName);
        studentBLO.save(student);
        txtName.setText("");
        txtLastName.setText(""); 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
//       String id = txtId.getText();
//       Student student = studentBLO.find(id); //para encontrar el find
//       if(student!=null){
//           txtName.setText(student.getName());
//           txtLastName.setText(student.getLastName());
//       }
String lastName = txtLastName.getText().trim(); //obteniendo el apellido de la caja de texto el last name y guardando en una variable
if(!lastName.isEmpty()){
List<Student> studentList = studentBLO.findByLastName(lastName); // en una lsita llamando al metodo finbylastname y va a rregreasar una lista
if(!studentList.isEmpty()){
refreshTable(studentList);
    }//GEN-LAST:event_btnSearchActionPerformed
} else{
    JOptionPane.showMessageDialog(null, "You nedd to fill the last name");
}
    }
    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        
    }//GEN-LAST:event_txtLastNameActionPerformed
   private void clearTable(){
       DefaultTableModel dtm = (DefaultTableModel) tStudents.getModel();
       while(dtm.getRowCount()>0){
           dtm.removeRow(0);
       }
   }
    
    private void refreshTable(List<Student> studentList)
    {
        clearTable();
//        List<Student> studentList = studentBLO.findAll(); // se obtiene lista en el metodo de negocio
        DefaultTableModel dtm = (DefaultTableModel) tStudents.getModel(); //tabala de negocio
        Object[] emptyRow = {""}; //renglon bacio a las propiedades
        for(int i = 0; i<studentList.size(); i++){ //recorrer la lista de los estudiantes
            dtm.addRow(emptyRow);// se agrega renglon vacio y se agrega a la tabla
            dtm.setValueAt(studentList.get(i).getId(), i, 0); // la i es la posicion    el tercero es la coluna
            dtm.setValueAt(studentList.get(i).getName(), i, 1);
            dtm.setValueAt(studentList.get(i).getLastName(), i, 2);
        }
    }
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
       refreshTable(studentBLO.findAll());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    studentBLO.commitChanges(); // al momento que se sale guarda los datos
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnSearchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIdActionPerformed
        String IdSearch1 = txtId2.getText().trim(); //obteniendo el apellido de la caja de texto el last name y guardando en una variable
if(!IdSearch1.isEmpty()){
List<Student> studentList = studentBLO.findById(IdSearch1); // en una lsita llamando al metodo finbylastname y va a rregreasar una lista
if(!studentList.isEmpty()){
refreshTable(studentList);
    }                                         
} else{
    JOptionPane.showMessageDialog(null, "You nedd to fill the id");
}
    
    }//GEN-LAST:event_btnSearchIdActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
       String id = txtId.getText();
       Student student = studentBLO.find(id); //para encontrar el find
       if(student!=null){
        String name = txtName.getText();
        String lastName = txtLastName.getText();
        student.setLastName(lastName);
        student.setName(name);
        studentBLO.update(student);
       }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
       Student student = studentBLO.find(id);
       if(student!=null){
           
        studentBLO.delete(student);
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tStudents;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
