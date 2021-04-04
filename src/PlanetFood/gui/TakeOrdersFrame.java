/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.gui;

import PlanetFood.dao.CategoryDao;
import PlanetFood.dao.OrderDao;
import PlanetFood.dao.ProductsDao;
import PlanetFood.pojo.OrderDetails;
import PlanetFood.pojo.Orders;
import PlanetFood.pojo.Products;
import PlanetFood.pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rajat
 */
public class TakeOrdersFrame extends javax.swing.JFrame {

    /**
     * Creates new form TakeOrdersFrame
     */
    private HashMap<String,String> cat=new HashMap<>();
    private HashMap<String,Products> productsList=new HashMap<>();
    private ArrayList<OrderDetails> orderList=new ArrayList<>();
    private Products p;
    private String catId;
    private String prodId;
    private String catName;
    private double subTotal;
    private double actualTotal;
    private double grandTotal;
    private double discountAmount;
    private double gstAmount;
    private double discountPer;
    private String ordId;
    private DefaultTableModel model;

    public TakeOrdersFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        loadProductDetails();
        model=(DefaultTableModel)tabTakeOrder.getModel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comCat = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comProd = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProductPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabTakeOrder = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtOrdId = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGSTAmount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtGrandTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnPayBill = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(136, 152, 162));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel1.setText("Take Orders Panel");

        jPanel2.setBackground(new java.awt.Color(136, 152, 162));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose Product to Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 0, 18))); // NOI18N

        jLabel2.setText("Product Category");

        comCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCatActionPerformed(evt);
            }
        });

        jLabel3.setText("Product ID");

        comProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comProdActionPerformed(evt);
            }
        });

        jLabel4.setText("Product Name");

        txtProductName.setEditable(false);

        jLabel5.setText("Product Price");

        txtProductPrice.setEditable(false);

        jLabel6.setText("Quantity");

        txtQuantity.setText("                   ");

        btnAdd.setBackground(new java.awt.Color(102, 102, 102));
        btnAdd.setText("Add To Basket");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comCat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txtQuantity)
                            .addComponent(comProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tabTakeOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Products Price", "Quantity", "Amount"
            }
        ));
        jScrollPane2.setViewportView(tabTakeOrder);

        jPanel3.setBackground(new java.awt.Color(136, 152, 162));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basket Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 0, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel7.setText("Order ID");

        txtOrdId.setEditable(false);

        txtSubTotal.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel8.setText("Sub Total");

        txtDiscount.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel9.setText("Discount");

        txtGSTAmount.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel10.setText("GST Amount");

        txtGrandTotal.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel11.setText("Grand Total");

        btnPayBill.setBackground(new java.awt.Color(102, 102, 102));
        btnPayBill.setText("Pay Bill");
        btnPayBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtOrdId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGSTAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnPayBill)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOrdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtGSTAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPayBill)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setBackground(new java.awt.Color(102, 102, 102));
        btnCancel.setText("Cancel Order");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblLogout.setText("LogOut");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(212, 212, 212)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(402, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblLogout))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(450, Short.MAX_VALUE)
                    .addComponent(btnBack)
                    .addGap(21, 21, 21)))
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

    private void comCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCatActionPerformed
         try
        {
        String s=comCat.getSelectedItem().toString();
        String a=cat.get(s);
        productsList=ProductsDao.getProductsByCategory(a);
        comProd.removeAllItems();
        for(String prodId: productsList.keySet())
        {
            comProd.addItem(prodId);
        }
        
        
        
        
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in database while bringing products Details","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_comCatActionPerformed

    private void comProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comProdActionPerformed
         if(comProd.getSelectedItem()==null)
        {
            return;
        }
        
        String prodId=comProd.getSelectedItem().toString();
        Products p=productsList.get(prodId);
        txtProductName.setText(p.getProdName());
        String prodPrice=""+p.getProdPrice();
        txtProductPrice.setText(prodPrice);
    }//GEN-LAST:event_comProdActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
           clearAll();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CashierOptionsFrame cash=new CashierOptionsFrame();
        cash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String quantity = txtQuantity.getText();
        
        if(quantity==null)
        {
            JOptionPane.showMessageDialog(null, "Please enter the quantity", "Fill in Quantity", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        else
        {
            String price=txtProductPrice.getText();
            Object[] rows=new Object[5];
            rows[0]=comProd.getSelectedItem().toString();
            rows[1]=txtProductName.getText();
            rows[2]=price;
            rows[3]=quantity;
            double amount=Double.parseDouble(price)*Double.parseDouble(quantity);
            rows[4]=amount;
            model.addRow(rows);
            subTotal=subTotal+amount;
            System.out.println("subtotal before dis:"+subTotal);
            discountAmount=Math.round((discountPer*amount)/100);
            txtDiscount.setText(String.valueOf(discountAmount));
            System.out.println("discount :"+discountAmount);
            subTotal=Math.round(subTotal-discountAmount);
            txtSubTotal.setText(String.valueOf(subTotal));
            System.out.println("subtotal after dis:"+subTotal);
            gstAmount=Math.round(5*subTotal/100.0);
            txtGSTAmount.setText(String.valueOf(gstAmount));
            
            grandTotal=Math.round(subTotal+gstAmount);
            txtGrandTotal.setText(String.valueOf(grandTotal));
            OrderDetails obj=new OrderDetails();
            obj.setOrdid(ordId);
            obj.setProdid(prodId);
            obj.setQuantity(Double.parseDouble(quantity));
            obj.setCost(amount);
            orderList.add(obj);
            txtQuantity.setText("");


            

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPayBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayBillActionPerformed
        if(grandTotal==0)
        {
            JOptionPane.showMessageDialog(null, "Please Place some order","Empty Table",JOptionPane.ERROR_MESSAGE);
            return;
        }
        Orders obj=new Orders();
        obj.setOrdId(ordId);
        java.util.Date today=new java.util.Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
        obj.setOrdDate(sdf.format(today));
        obj.setGst(5.0);
        obj.setGstAmount(gstAmount);
        obj.setOrdAmount(subTotal);
        obj.setGrandTotal(grandTotal);
        obj.setDiscount(discountAmount);
        obj.setUserId(UserProfile.getUserId());
        String message="Your bill details\nBill Amount: Rs "+actualTotal;
        message+="\nDiscount:Rs "+discountAmount;
        message+="\nGST: Rs "+gstAmount;
        message+="\nAmount Payable:Rs "+grandTotal;
        
        JOptionPane.showMessageDialog(null, message);
        clearAll();
        try
        {
           boolean status=OrderDao.addOrder(obj, orderList);
           if(status)
           {
                JOptionPane.showMessageDialog(null, "Order placed successfully ","Success!",JOptionPane.INFORMATION_MESSAGE);
                CashierOptionsFrame cash=new CashierOptionsFrame();
        cash.setVisible(true);
        this.dispose();
                
           }
           else
              JOptionPane.showMessageDialog(null, "Order not placed!","Order Denied!",JOptionPane.ERROR_MESSAGE);
            
        }
        catch(Exception ex)
        {
              JOptionPane.showMessageDialog(null, "Error while adding order!","Exception!",JOptionPane.ERROR_MESSAGE); 
              ex.printStackTrace();
         } 

    }//GEN-LAST:event_btnPayBillActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame log=new LoginFrame();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblLogoutMouseExited

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
            java.util.logging.Logger.getLogger(TakeOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeOrdersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeOrdersFrame().setVisible(true);
            }
        });
    }
 public void loadProductDetails()
   {
        try
        {
            comCat.removeAllItems();
            cat=CategoryDao.getAllCategory();
            Set s=cat.keySet();
            Iterator it=s.iterator();
            while(it.hasNext())
            {
                comCat.addItem((String)it.next());

            }
            ordId=OrderDao.getNewId();
            txtOrdId.setText(ordId);
            do
            {
                String discountStr=JOptionPane.showInputDialog("How much discount is offered ?");
                 try
                    {
                        discountPer=Double.parseDouble(discountStr);
                        txtDiscount.setText(discountPer+"%");
                        break;
                    }
                    catch(Exception ex)
                    {
                       JOptionPane.showMessageDialog(null, "Please set numeric value for discount","Error!",JOptionPane.ERROR_MESSAGE);  

                    }

              
             }
            while(true);
        
        
        }
        catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error in Getting Categories", "Error!!", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
   }
 public void clearAll()
 {
     subTotal=0;
     discountAmount=0;
     gstAmount=0;
     grandTotal=0;
      txtQuantity.setText("");
       
        txtSubTotal.setText("");
        txtDiscount.setText("");
        txtGSTAmount.setText("");
        txtGrandTotal.setText("");
        model.setRowCount(0);
     
 }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnPayBill;
    private javax.swing.JComboBox<String> comCat;
    private javax.swing.JComboBox<String> comProd;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JTable tabTakeOrder;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtGSTAmount;
    private javax.swing.JTextField txtGrandTotal;
    private javax.swing.JTextField txtOrdId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSubTotal;
    // End of variables declaration//GEN-END:variables
}
