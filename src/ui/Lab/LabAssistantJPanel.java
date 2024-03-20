/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Lab;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.EmergencyOrg;
import business.Organization.LabOrg;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.LabTestWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aditi
 */
public class LabAssistantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantJPanel
     */
    JPanel workArea;
    Enterprise enterprise;
    EcoSystem system;
    Organization organization;
    Network network;
    UserAccount account;
    LabTestWorkRequest labWorkReq;
    EmergencyOrg emergencyOrg;

    public LabAssistantJPanel(JPanel workArea, EcoSystem ecoSystem, Network network, Enterprise enterprise, Organization organization, UserAccount account) {
        initComponents();
        this.workArea = workArea;
        this.enterprise = enterprise;
        this.system = ecoSystem;
        this.organization = organization;
        this.network = network;
        this.account = account;

        populateTable();
    }

    public void populateTable() {
        System.out.println("Check0");
        DefaultTableModel model = (DefaultTableModel) WorkRequestTable.getModel();
        model.setRowCount(0);
        System.out.println("Check0.1");
        for (Organization organization : system.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof LabOrg) {
                System.out.println("Check1");
                this.organization = organization;
            }
        }

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof LabTestWorkRequest) {

                LabTestWorkRequest epr = (LabTestWorkRequest) wr;
                Object[] row = new Object[model.getColumnCount()];
                row[0] = epr.getLabTestRequestId();
                row[1] = epr.getDoctor().getDocName();//epr.getSender().getEmployee().getName();
                row[2] = epr.getPatient().getPatientName();
                row[3] = epr.getPatient().getPatientId();
                row[4] = epr.getMessage();// epr.getRequestdate();
                row[5] = epr.getLabTestAdminFeedback();
                model.addRow(row);
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        WorkRequestTable = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLogout2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jEditorPane1);

        setLayout(null);

        WorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "LabTestRequestId", "Sender", "Patient Name", "Patient ID", "LabTest Message", "LabTestFeedback"
            }
        ));
        jScrollPane1.setViewportView(WorkRequestTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(450, 200, 830, 190);

        btnProcess.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(0, 0, 102));
        btnProcess.setText("Process Request");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess);
        btnProcess.setBounds(800, 430, 160, 27);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("LAB ADMIN WORK AREA");
        add(jLabel1);
        jLabel1.setBounds(710, 110, 349, 56);

        btnLogout2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnLogout2.setForeground(new java.awt.Color(0, 0, 102));
        btnLogout2.setText("Log Out");
        btnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout2ActionPerformed(evt);
            }
        });
        add(btnLogout2);
        btnLogout2.setBounds(22, 19, 112, 56);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Lab/final bg.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1890, 1100);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        int selectedRow = WorkRequestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String patientName = WorkRequestTable.getModel().getValueAt(selectedRow, 2).toString();
        for (WorkRequest wr : this.organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof LabTestWorkRequest) {

                System.out.println("Check2");
                LabTestWorkRequest epr = (LabTestWorkRequest) wr;
                if (epr.getPatient().getPatientName().equals(patientName)) {
                    FeedbackLabJPanel feedbackLabJPanel = new FeedbackLabJPanel(workArea, system, network, enterprise, this.organization, this.account, epr.getPatient());
                    workArea.add("feedbackLabJPanel", feedbackLabJPanel);
                    CardLayout layout = (CardLayout) workArea.getLayout();
                    layout.next(workArea);
                }
            }
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout2ActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        ((java.awt.CardLayout) workArea.getLayout()).previous(workArea);
    }//GEN-LAST:event_btnLogout2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable WorkRequestTable;
    private javax.swing.JButton btnLogout2;
    private javax.swing.JButton btnProcess;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}