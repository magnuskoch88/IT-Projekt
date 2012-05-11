/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import gui.MainMenu;

import java.awt.*;
import java.sql.SQLException;
import java.util.*;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import Order.Order_gui;
import Order.Search_Order;
import Searches.Searcher;

/**
 *
 * @author DELL
 */
public class Delivery extends javax.swing.JPanel {

	/**
	 * Creates new form Delivery
	 */
	public Delivery(Object[][] x) {

		initComponents(x);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents(Object[][] x) {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable_DeliveryList = new javax.swing.JTable();
		jScrollPane5 = new javax.swing.JScrollPane();
		jTableSearch = new javax.swing.JTable();
		jButton_Ok = new javax.swing.JButton();
		jButton_New_product = new javax.swing.JButton();
		jLabel_Delivery = new javax.swing.JLabel();
		jButtonSearch = new javax.swing.JButton();
		jTextFieldSearch = new javax.swing.JTextField();

		jTable_DeliveryList.setAutoCreateRowSorter(true);
		jTable_DeliveryList.setModel(new javax.swing.table.DefaultTableModel(
				deliveredTable,
				new String [] {
						"ID", "Name", "Ref Nr", "Price", "Type", "Unit", "Amount", "Confirmed"
				} ) {
            Class[] types = new Class [] {
                    java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, true, true
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
		jTable_DeliveryList.getModel().addTableModelListener(new TableModelListener() {

			public void tableChanged(TableModelEvent e) {
				int row = e.getFirstRow();
				int column = e.getColumn();
				TableModel model = (TableModel)e.getSource();
				deliveredTable[row][column] = model.getValueAt(row, column);
				temp = deliveredTable[row][column];
				String str = temp.toString(); 
				d = Double.valueOf(str).doubleValue();
				deliveredTable[row][column] = d;


			}
		});

		jTable_DeliveryList.setColumnSelectionAllowed(true);
		jTable_DeliveryList.setEditingColumn(0);
		jTable_DeliveryList.setEditingRow(0);
		jTable_DeliveryList.setRowHeight(20);
		jTable_DeliveryList.setSelectionBackground(new java.awt.Color(235, 235, 235));
		jScrollPane1.setViewportView(jTable_DeliveryList);
		jTable_DeliveryList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		newProductTable = x;
		
		jTableSearch.setAutoCreateRowSorter(true);
		jTableSearch.setModel(new javax.swing.table.DefaultTableModel(
				newProductTable,
				new String [] {
						"ID", "Name", "Ref Nr", "Price", "Type", "Unit", "Amount", "Confirmed"
				}) {
		            Class[] types = new Class [] {
		                    java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
		                };
		                boolean[] canEdit = new boolean [] {
		                    false, false, false, false, false, false, true, true
		                };

		                public Class getColumnClass(int columnIndex) {
		                    return types [columnIndex];
		                }

		                public boolean isCellEditable(int rowIndex, int columnIndex) {
		                    return canEdit [columnIndex];
		                }
				});
		jTableSearch.getModel().addTableModelListener(new TableModelListener() {

			public void tableChanged(TableModelEvent e) {
				int row = e.getFirstRow();
				int column = e.getColumn();
				TableModel model = (TableModel)e.getSource();
				newProductTable[row][column] = model.getValueAt(row, column);
				temp = newProductTable[row][column];
				String str = temp.toString(); 
				dNew = Double.valueOf(str).doubleValue();
				newProductTable[row][column] = dNew;


			}
		});
		jTableSearch.setColumnSelectionAllowed(true);
		jTableSearch.setEditingColumn(0);
		jTableSearch.setEditingRow(0);
		jTableSearch.setRowHeight(20);
		jScrollPane5.setViewportView(jTableSearch);
		jTableSearch.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

		jButton_Ok.setText("Ok");
		jButton_Ok.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton_OkActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButtonSearch.setText("Search");
		jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSearchActionPerformed(evt);
			}
		});

		jButton_New_product.setText("Ok");
		jButton_New_product.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton_New_productActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		jLabel_Delivery.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel_Delivery.setText("Delivery");

		 jButtonSearch.setText("Search");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jButton_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel_Delivery, javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jButton_New_product, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addComponent(jLabel_Delivery)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(5, 5, 5)
	                .addComponent(jButton_Ok)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jButtonSearch)
	                    .addComponent(jButton_New_product)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(1, 1, 1)
	                        .addComponent(jTextFieldSearch)))
	                .addContainerGap())
	        );
	    }


	private void jButton_OkActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                           

		if(evt.getSource() == jButton_Ok)
		{
			addID.clear();
			addAmount.clear();
			{	
				for(int i = 0; i< deliveredTable.length; i++)
				{	
					
					Object id = deliveredTable[i][0];
					addID.add(id);
					double amount = (Double) deliveredTable[i][6];
					addAmount.add(amount);
					Delivered delivered = new Delivered();
					delivered.addAmount(addID, addAmount);
					
				}
			}
		}
	}                                          

	private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {                                                    
		if (evt.getSource() == jButtonSearch )
		{

			String searchWord = jTextFieldSearch.getText();
			Search_Order search_fun2 = new Search_Order();
			Searcher searcher2 = new Searcher();
			try {

				search_fun2.select();
			} catch (Exception e) {

				e.printStackTrace();
			}

			ArrayList <String> temp2 = searcher2.searchThrough(search_fun2.groceryList, searchWord);
			Object [][] guiTable2 = null;
			try 
			{
				guiTable2 = search_fun2.combine(temp2);
				for (int i = 0; i < temp2.size(); i++)
				{
					double setToZero = 0.0;
					guiTable2[i][6] = setToZero;
				}
				Delivery s = new Delivery(guiTable2);
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
    }                                                   
	private void jButton_New_productActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                                    
		if(evt.getSource() == jButton_New_product)
		{
			addIDNew.clear();
			addAmountNew.clear();
			{	
				for(int i = 0; i< newProductTable.length; i++)
				{	
					
					Object id = newProductTable[i][0];
					addIDNew.add(id);
					double amountNew = (Double) newProductTable[i][6];
					addAmountNew.add(amountNew);
					Delivered deliveredNew = new Delivered();
					deliveredNew.addAmount(addIDNew, addAmountNew);
					
				}
			}
		}
	}                          
	// Variables declaration - do not modify
	private javax.swing.JButton jButton_New_product;
	private javax.swing.JButton jButton_Ok;
	private javax.swing.JLabel jLabel_Delivery;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JTable jTableSearch;
	private javax.swing.JTable jTable_DeliveryList;
	private Object [][] deliveredTable =  {{12, "strawberry marmelade", 8, 10, "Dry", "Liter", 0.0},
			                                {5, "toblerone", 7, 20, "Dry", "Kg", 0.0}};
	private Object [][] newProductTable = null;
	public ArrayList<Object> addID = new ArrayList<Object>();
	public ArrayList<Object> addAmount = new ArrayList<Object>();
	public ArrayList<Object> addIDNew = new ArrayList<Object>();
	public ArrayList<Object> addAmountNew = new ArrayList<Object>();
	Object temp;
	double d;
	double dNew;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JTextField jTextFieldSearch;

	// End of variables declaration
}
