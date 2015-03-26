/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.pos_transaction;

import com.mac.af.resources.ApplicationResources;
import com.pos.resources.Resources;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * @author Udayanga
 */
public class GUIPos extends javax.swing.JPanel {

    /**
     * Creates new form GUIPos
     */
    public GUIPos() {
        initComponents();
        initOthers();
    }

    public void initOthers() {
        btnPdis.setIcon(Resources.getImageIcon(Resources.DISCOUNT, 40, 40));
        btnValDis.setIcon(Resources.getImageIcon(Resources.VAL_DIS, 32, 32));
        btnSalesRet.setIcon(Resources.getImageIcon(Resources.SALES_RET, 32, 32));
        btnFItemDis.setIcon(Resources.getImageIcon(Resources.ITEM_DISCOUNT, 32, 32));
        btnDiscount.setIcon(Resources.getImageIcon(Resources.DISCOUNT, 32, 32));
        btnOperator.setIcon(Resources.getImageIcon(Resources.OPERATOR, 32, 32));
        btnSuspend.setIcon(Resources.getImageIcon(Resources.SUSPEND, 32, 32));
        btnRecall.setIcon(Resources.getImageIcon(Resources.RECALL, 32, 32));
        btnItemReEnter.setIcon(Resources.getImageIcon(Resources.ITEM_RE_ENTER, 32, 32));
        btnBillCancel.setIcon(Resources.getImageIcon(Resources.BILL_CANCEL, 32, 32));
        btnCancelItem.setIcon(Resources.getImageIcon(Resources.CANCEL_ITEM, 32, 32));
        btnErrorCorrection.setIcon(Resources.getImageIcon(Resources.ERROR_CORRECTION, 32, 32));
        btnCustomerPayment.setIcon(Resources.getImageIcon(Resources.CUSTOMER_PAYMENT, 32, 32));
        btnFullCancel.setIcon(Resources.getImageIcon(Resources.FULL_CANCEL, 32, 32));
        btnPaidOut.setIcon(Resources.getImageIcon(Resources.PAID_OUT, 32, 32));
        btnCash.setIcon(Resources.getImageIcon(Resources.CASH, 32, 32));
        btnEnterKey.setIcon(Resources.getImageIcon(Resources.ENTER_KEY, 32, 32));
        btnDrowerOpen.setIcon(Resources.getImageIcon(Resources.DROWER_OPEN, 32, 32));

        btnBack.setIcon(ApplicationResources.getImageIcon(ApplicationResources.ACTION_DISCARD, 16, 16));

        ArrayList<JButton> buttons = new ArrayList<>();
        buttons.add(btnPdis);
        buttons.add(btnValDis);
        buttons.add(btnSalesRet);
        buttons.add(btnFItemDis);
        buttons.add(btnDiscount);
        buttons.add(btnOperator);
        buttons.add(btnSuspend);
        buttons.add(btnRecall);
        buttons.add(btnItemReEnter);
        buttons.add(btnBillCancel);
        buttons.add(btnCancelItem);
        buttons.add(btnErrorCorrection);
        buttons.add(btnCustomerPayment);
        buttons.add(btnFullCancel);
        buttons.add(btnPaidOut);
        buttons.add(btnCash);
        buttons.add(btnEnterKey);
        buttons.add(btnDrowerOpen);

        String text;
        String caption;
        for (JButton button : buttons) {
            button.setHorizontalTextPosition(SwingConstants.CENTER);
            button.setVerticalTextPosition(SwingConstants.BOTTOM);
            button.setHorizontalAlignment(SwingConstants.CENTER);
            button.setVerticalAlignment(SwingConstants.BOTTOM);
            button.setIconTextGap(10);

            text = button.getText();
            caption = "<HTML><B><FONT><CENTER>" + text.replace("_", "<BR/>") + "<CENTER></FONT></B></HTML>";

            button.setLayout(new BorderLayout());
            button.setText(caption);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblListStatus = new com.mac.af.component.derived.display.label.CDLabel();
        btnBack = new com.mac.af.component.derived.command.button.CCButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstItems = new com.mac.af.component.derived.input.list.CIList();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cDLabel4 = new com.mac.af.component.derived.display.label.CDLabel();
        cDLabel5 = new com.mac.af.component.derived.display.label.CDLabel();
        cDLabel6 = new com.mac.af.component.derived.display.label.CDLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        cDLabel7 = new com.mac.af.component.derived.display.label.CDLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        cCButton1 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton2 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton3 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton4 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton5 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton6 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton8 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton7 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton9 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton10 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton12 = new com.mac.af.component.derived.command.button.CCButton();
        cCButton11 = new com.mac.af.component.derived.command.button.CCButton();
        jPanel8 = new javax.swing.JPanel();
        cDLabel9 = new com.mac.af.component.derived.display.label.CDLabel();
        cDLabel11 = new com.mac.af.component.derived.display.label.CDLabel();
        txtDate = new com.mac.af.component.derived.input.textfield.CIDateField();
        txtBillNo = new com.mac.af.component.base.textfield.CIntegerField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnPdis = new com.mac.af.component.derived.command.button.CCButton();
        btnValDis = new com.mac.af.component.derived.command.button.CCButton();
        btnSalesRet = new com.mac.af.component.derived.command.button.CCButton();
        btnFItemDis = new com.mac.af.component.derived.command.button.CCButton();
        btnDiscount = new com.mac.af.component.derived.command.button.CCButton();
        btnOperator = new com.mac.af.component.derived.command.button.CCButton();
        btnSuspend = new com.mac.af.component.derived.command.button.CCButton();
        btnRecall = new com.mac.af.component.derived.command.button.CCButton();
        btnItemReEnter = new com.mac.af.component.derived.command.button.CCButton();
        btnBillCancel = new com.mac.af.component.derived.command.button.CCButton();
        btnCancelItem = new com.mac.af.component.derived.command.button.CCButton();
        btnErrorCorrection = new com.mac.af.component.derived.command.button.CCButton();
        btnCustomerPayment = new com.mac.af.component.derived.command.button.CCButton();
        btnFullCancel = new com.mac.af.component.derived.command.button.CCButton();
        btnPaidOut = new com.mac.af.component.derived.command.button.CCButton();
        btnCash = new com.mac.af.component.derived.command.button.CCButton();
        btnEnterKey = new com.mac.af.component.derived.command.button.CCButton();
        btnDrowerOpen = new com.mac.af.component.derived.command.button.CCButton();

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblListStatus.setText("INFORMATION");
        lblListStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnBack.setText("Back");
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jScrollPane1.setViewportView(lstItems);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cDLabel4.setText("Total Amount:");
        cDLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cDLabel5.setText("Discount:");
        cDLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cDLabel6.setText("Sales Return:");
        cDLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField1.setText("0.0");
        jFormattedTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField2.setText("0.0");
        jFormattedTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFormattedTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField3.setText("0.0");
        jFormattedTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cDLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextField1)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cDLabel7.setText("No of Pecs:");
        cDLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField4.setText("0");
        jFormattedTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cDLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField4)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setLayout(new java.awt.GridLayout(4, 3));

        cCButton1.setText("7");
        cCButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton1);

        cCButton2.setText("8");
        cCButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton2);

        cCButton3.setText("9");
        cCButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton3);

        cCButton4.setText("4");
        cCButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton4);

        cCButton5.setText("5");
        cCButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton5);

        cCButton6.setText("6");
        cCButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton6);

        cCButton8.setText("1");
        cCButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton8);

        cCButton7.setText("2");
        cCButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton7);

        cCButton9.setText("3");
        cCButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton9);

        cCButton10.setText("C");
        cCButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton10);

        cCButton12.setText("0");
        cCButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton12);

        cCButton11.setText(".");
        cCButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel6.add(cCButton11);

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cDLabel9.setText("Date:");
        cDLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cDLabel11.setText("Bill No:");
        cDLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cDLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(txtBillNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cDLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cDLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Item", "Price", "Qty.", "Dis.", ".Net Value"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridLayout(6, 3, 10, 10));

        btnPdis.setText("[F2]_%Dis.");
        btnPdis.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jPanel7.add(btnPdis);

        btnValDis.setText("[F3]_Val. Dis.");
        jPanel7.add(btnValDis);

        btnSalesRet.setText(" [F4]_Sales Ret.");
        btnSalesRet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalesRet.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(btnSalesRet);

        btnFItemDis.setText("[Ctrl+F2]_Item% Dis.");
        jPanel7.add(btnFItemDis);

        btnDiscount.setText("[Crtl+F3]_Item Dis.");
        jPanel7.add(btnDiscount);

        btnOperator.setText("[Home]_Operator");
        btnOperator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(btnOperator);

        btnSuspend.setText("[F8]_Suspend");
        jPanel7.add(btnSuspend);

        btnRecall.setText("[F9]_Recall");
        jPanel7.add(btnRecall);

        btnItemReEnter.setText("[F10]_Item Re-enter");
        jPanel7.add(btnItemReEnter);

        btnBillCancel.setText("[F11]_Bill Cancel");
        btnBillCancel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel7.add(btnBillCancel);

        btnCancelItem.setText("[F12]_Cancel Item");
        jPanel7.add(btnCancelItem);

        btnErrorCorrection.setText("[End]_Error Correction");
        jPanel7.add(btnErrorCorrection);

        btnCustomerPayment.setText("[Ctrl+P]_Customer Payment");
        jPanel7.add(btnCustomerPayment);

        btnFullCancel.setText("[Ctrl+Delete]_Full Cancel");
        jPanel7.add(btnFullCancel);

        btnPaidOut.setText("[Page Up]_Paid Out/Control");
        jPanel7.add(btnPaidOut);

        btnCash.setText("[+]_Cash");
        jPanel7.add(btnCash);

        btnEnterKey.setText("Enter Key");
        jPanel7.add(btnEnterKey);

        btnDrowerOpen.setText("[Page  Down]_[Drower Open]");
        jPanel7.add(btnDrowerOpen);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mac.af.component.derived.command.button.CCButton btnBack;
    private com.mac.af.component.derived.command.button.CCButton btnBillCancel;
    private com.mac.af.component.derived.command.button.CCButton btnCancelItem;
    private com.mac.af.component.derived.command.button.CCButton btnCash;
    private com.mac.af.component.derived.command.button.CCButton btnCustomerPayment;
    private com.mac.af.component.derived.command.button.CCButton btnDiscount;
    private com.mac.af.component.derived.command.button.CCButton btnDrowerOpen;
    private com.mac.af.component.derived.command.button.CCButton btnEnterKey;
    private com.mac.af.component.derived.command.button.CCButton btnErrorCorrection;
    private com.mac.af.component.derived.command.button.CCButton btnFItemDis;
    private com.mac.af.component.derived.command.button.CCButton btnFullCancel;
    private com.mac.af.component.derived.command.button.CCButton btnItemReEnter;
    private com.mac.af.component.derived.command.button.CCButton btnOperator;
    private com.mac.af.component.derived.command.button.CCButton btnPaidOut;
    private com.mac.af.component.derived.command.button.CCButton btnPdis;
    private com.mac.af.component.derived.command.button.CCButton btnRecall;
    private com.mac.af.component.derived.command.button.CCButton btnSalesRet;
    private com.mac.af.component.derived.command.button.CCButton btnSuspend;
    private com.mac.af.component.derived.command.button.CCButton btnValDis;
    private com.mac.af.component.derived.command.button.CCButton cCButton1;
    private com.mac.af.component.derived.command.button.CCButton cCButton10;
    private com.mac.af.component.derived.command.button.CCButton cCButton11;
    private com.mac.af.component.derived.command.button.CCButton cCButton12;
    private com.mac.af.component.derived.command.button.CCButton cCButton2;
    private com.mac.af.component.derived.command.button.CCButton cCButton3;
    private com.mac.af.component.derived.command.button.CCButton cCButton4;
    private com.mac.af.component.derived.command.button.CCButton cCButton5;
    private com.mac.af.component.derived.command.button.CCButton cCButton6;
    private com.mac.af.component.derived.command.button.CCButton cCButton7;
    private com.mac.af.component.derived.command.button.CCButton cCButton8;
    private com.mac.af.component.derived.command.button.CCButton cCButton9;
    private com.mac.af.component.derived.display.label.CDLabel cDLabel11;
    private com.mac.af.component.derived.display.label.CDLabel cDLabel4;
    private com.mac.af.component.derived.display.label.CDLabel cDLabel5;
    private com.mac.af.component.derived.display.label.CDLabel cDLabel6;
    private com.mac.af.component.derived.display.label.CDLabel cDLabel7;
    private com.mac.af.component.derived.display.label.CDLabel cDLabel9;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private com.mac.af.component.derived.display.label.CDLabel lblListStatus;
    private com.mac.af.component.derived.input.list.CIList lstItems;
    private com.mac.af.component.base.textfield.CIntegerField txtBillNo;
    private com.mac.af.component.derived.input.textfield.CIDateField txtDate;
    // End of variables declaration//GEN-END:variables
}
