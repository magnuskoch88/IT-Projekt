/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import java.awt.event.MouseMotionListener;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import gui.MainMenu;
import Order.Order_gui;
import Order.printOrder;
import Searches.PrintColumns;

/**
 *
 * @author DELL
 */
public class Inventory extends javax.swing.JPanel {
	Object id = null;
	Object[][] table = null;
	static Object[][] table_Add = new Object [][] {
            {null, null,null , null, null, null, null}
    };
    public Inventory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Inventory_Stock = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_New_Product = new javax.swing.JTable();
        jButton_Inventory_New_product = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();

        PrintColumns P = new PrintColumns();
		table = P.Print();
		
        jTable_Inventory_Stock.setAutoCreateRowSorter(true);
        jTable_Inventory_Stock.setBackground(new java.awt.Color(255, 255, 255));
        jTable_Inventory_Stock.setModel(new javax.swing.table.DefaultTableModel(
            table,
            new String [] {
                    "ID", "Name", "Ref Nr", "Price", "Type", "Unit", "Amount", "Min Amount", "Select"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
                };
                boolean[] canEdit = new boolean [] {
                    false, true, true, true, true, true, true, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });

        jTable_Inventory_Stock.getModel().addTableModelListener(new TableModelListener() {

            public void tableChanged(TableModelEvent e) {
               int row = e.getFirstRow();
               int column = e.getColumn();
               TableModel model = (TableModel)e.getSource();
               Object columnName = model.getColumnName(column);
               table[row][column] = model.getValueAt(row, column);
               Object value = model.getValueAt(row, column);
               id = table[row][0];      
               if (column != 8){
               Inventory_Change c = new Inventory_Change(id,value,columnName);
               }
               }
          });
        jTable_Inventory_Stock.setEditingColumn(0);
        jTable_Inventory_Stock.setEditingRow(0);
        jTable_Inventory_Stock.setRowHeight(20);
        jScrollPane1.setViewportView(jTable_Inventory_Stock);

        jTable_New_Product.setAutoCreateRowSorter(true);
        jTable_New_Product.setBackground(new java.awt.Color(255, 255, 255));
        jTable_New_Product.setModel(new javax.swing.table.DefaultTableModel(
        		table_Add,
            new String [] {
        				"Name", "Ref Nr", "Price", "Type", "Unit", "Amount","Min Amount"
            }
        		
        ));
        jTable_New_Product.getModel().addTableModelListener(new TableModelListener() {

            public void tableChanged(TableModelEvent e) {
               //System.out.println(e);
               int row = e.getFirstRow();
               int column = e.getColumn();
               TableModel model = (TableModel)e.getSource();
               String columnName = model.getColumnName(column);
               table_Add[row][column] = model.getValueAt(row, column);

            }
          });
        jTable_New_Product.setValueAt("",0,0);
        jTable_New_Product.setEditingColumn(0);
        jTable_New_Product.setEditingRow(0);
        jTable_New_Product.setRowHeight(20);
        jTable_Inventory_Stock.enableInputMethods(true);
        jScrollPane3.setViewportView(jTable_New_Product);

        jButton_Inventory_New_product.setText("New product");
        jButton_Inventory_New_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Inventory_New_productActionPerformed(evt);
            }
        });

        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Inventory_New_product, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Inventory_New_product)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    	  
    private void jButton_Inventory_New_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Inventory_New_productActionPerformed
    	if (evt.getSource() == jButton_Inventory_New_product )
    	{
    		
    		Object[][] guiTable2 = null;
    		guiTable2 = table_Add;
    		table_Add = new Object [][] {
    	            {null, null,null , null, null, null, null}};
    		try {
    			
			Inventory_Add A = new Inventory_Add(guiTable2);
			} catch (Exception e) {

				e.printStackTrace();
			}
			try 
			{
				Inventory s = new Inventory();
				MainMenu.Panel.removeAll();
				MainMenu.Panel.add(s);
				MainMenu.Panel.setVisible(true);
				s.setVisible(true);
				MainMenu.Panel.invalidate();
				MainMenu.Panel.validate();
			} 
			catch (Exception e) 
			{ 
				e.printStackTrace();
			}
    	}
    }//GEN-LAST:event_jButton_Inventory_New_productActionPerformed
    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Inventory_OkActionPerformed
    	if (evt.getSource() == jButton_Delete )    		
    	{
    		if (id != null){   		
    			 java.awt.EventQueue.invokeLater(new Runnable() {
    				 
    				 public void run() {
    		                new DeletePop(id).setVisible(true);
    		            }
    		        });
    		}
    	}
    }
    private void jButton_Inventory_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Inventory_OkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Inventory_OkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Inventory_New_product;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Inventory_Stock;
    private javax.swing.JTable jTable_New_Product;
    // End of variables declaration//GEN-END:variables
}
