/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Patient;

import business.Stakeholders.Patient;
import business.Stakeholders.PatientDirectory;
import business.WorkQueue.EmergencyWorkRequest;
import javax.swing.JPanel;
import business.EcoSystem;
import business.Network.Network;
import business.Enterprise.Enterprise;
import business.JSONUtil.Store;
import business.Organization.EmergencyOrg;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.VitalSigns.VitalSigns;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apara
 */
public class PatientJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private EcoSystem ecoSystem;
    private UserAccount account;
    private Patient patient;
    PatientDirectory patientList;

    EmergencyWorkRequest emergencyRequest;
    Network network;
    Organization organization;
    Enterprise enterprise;

    /**
     * Creates new form PatientJPanel
     */
    public PatientJPanel(JPanel workArea, EcoSystem system, Network network, Enterprise enterprise, Organization organization, UserAccount account) {
        initComponents();
        this.workArea = workArea;
        this.ecoSystem = system;
        this.network = network;
        this.patientList = system.getPatientDirectory();
        this.organization = organization;
        this.account = account;
        populatePatientTable();
    }

    private void populatePatientTable() {
        ArrayList<Patient> patientList = ecoSystem.getPatientDirectory().getPatientList();
        //System.out.println(patientList);

        for (Patient p : patientList) {
            //System.out.println(p.getUserName()+this.account.getUsername());
            if (p.getUserName().equals(this.account.getUsername())) {
                this.patient = p;
            }
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        ArrayList<VitalSigns> vitalSigns = this.patient.getVitalSignsHistory().getHistory();
        txtpatientId.setText(String.valueOf(this.patient.getPatientId()));
        txtpatientName.setText(this.patient.getPatientName());
        txtage.setText(String.valueOf(this.patient.getAge()));
        txtbloodGrp.setText(this.patient.getBloodGrp());

        for (VitalSigns v : vitalSigns) {
            Object[] row = new Object[4];
            //System.out.println(v.getRespiratoryRate());
            row[0] = v.getRespiratoryRate();
            row[1] = v.getBloodPressure();
            row[2] = v.getWeight();
            row[3] = v.getHeartRate();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRequest = new javax.swing.JButton();
        btnSOS = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtpatientId = new javax.swing.JTextField();
        txtpatientName = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtbloodGrp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 102));
        setForeground(new java.awt.Color(102, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Respiratory Rate", "Blood Pressure", "Weight", "Heart Rate"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age:");

        btnRequest.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(0, 0, 102));
        btnRequest.setText("Request Checkup appointment");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        btnSOS.setBackground(new java.awt.Color(255, 0, 0));
        btnSOS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSOS.setForeground(new java.awt.Color(255, 255, 255));
        btnSOS.setText("SOS");
        btnSOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSOSActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Group:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient ID:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Patient/VitalSigns_Logo+(1).png"))); // NOI18N

        btnLogout2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout2.setForeground(new java.awt.Color(0, 0, 102));
        btnLogout2.setText("Log Out");
        btnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpatientId)
                            .addComponent(txtpatientName)
                            .addComponent(txtage)
                            .addComponent(txtbloodGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(btnRequest)
                        .addGap(68, 68, 68)
                        .addComponent(btnSOS, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(604, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRequest, btnSOS});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtpatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtpatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtbloodGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(btnSOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(416, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRequest, btnSOS});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSOSActionPerformed
        // TODO add your handling code here:

        EmergencyWorkRequest request = new EmergencyWorkRequest();
        request.setSender(account);
        request.setStatus("Sent");
        request.setPatient(this.patient);

        Organization org = null;
        for (Organization organization : ecoSystem.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof EmergencyOrg) {
                org = organization;
                ecoSystem.getOrganizationDirectory().getOrganizationList().remove(org);
                org.getWorkQueue().addWorkRequest(request);
                //account.getWorkQueue().addWorkRequest(request);
                ecoSystem.getOrganizationDirectory().getOrganizationList().add(org);
                Store.save(ecoSystem);
                break;
            }
        }

        JOptionPane.showMessageDialog(this, "Hello, an Ambulance along with the doctor will be here with you soon! Your request has been sent!", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSOSActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Your Checkup request has been sent successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout2ActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        ((java.awt.CardLayout) workArea.getLayout()).previous(workArea);
    }//GEN-LAST:event_btnLogout2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout2;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnSOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtbloodGrp;
    private javax.swing.JTextField txtpatientId;
    private javax.swing.JTextField txtpatientName;
    // End of variables declaration//GEN-END:variables
}