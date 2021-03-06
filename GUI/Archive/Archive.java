/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Archive;

import gui.MainMenu;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import Order.Search_Order;
import Searches.Searcher;
import dish.DeleteDishPop;
import dish.printDish;

/**
 * 
 * @author DELL
 */
public class Archive extends javax.swing.JPanel {

	Object[][] table = null;

	/**
	 * Creates new form Arkiv
	 */
	public Archive() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jSearchField = new javax.swing.JTextField();
		jButtonSearch = new javax.swing.JButton();
		jButtonShowAll = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		printArchive pa = new printArchive();
		table = pa.PrintArchive();

		jTable1.setModel(new javax.swing.table.DefaultTableModel(table,
				new String[] { "Order Date", "Product ID", "Amount", "Name",
						"Ref nr", "Type", "Unit" }));
		jScrollPane1.setViewportView(jTable1);

		jButtonSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButtonSearch.setText("Search Order ID");
		jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSearchActionPerformed(evt);
			}
		});
		
		jButtonShowAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jButtonShowAll.setText("Show All");
		jButtonShowAll.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonShowAllActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setText("Archive");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(251,
																		251,
																		251)
																.addComponent(
																		jSearchField,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		93,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButtonSearch)
																		.addComponent(
																				jButtonShowAll))
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		732,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		jLabel1)))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										274,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jSearchField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButtonSearch)
												.addComponent(jButtonShowAll))
								.addContainerGap()));
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {

		if (evt.getSource() == jButtonSearch) {

			String searchWord = jSearchField.getText();
			String query = "SELECT chichiu_Itp2.order_product.idarkiv,chichiu_Itp2.product.idvara,chichiu_Itp2.order_product.amount,chichiu_Itp2.product.name,chichiu_Itp2.product.ref_nr,chichiu_Itp2.product.type,chichiu_Itp2.product.unit FROM chichiu_Itp2.order_product JOIN chichiu_Itp2.product ON chichiu_Itp2.product.idVara = chichiu_Itp2.order_product.idvara where idarkiv ="
					+ searchWord + "";
			String query2 = "SELECT chichiu_Itp2.order_product.idarkiv,chichiu_Itp2.product.idvara,chichiu_Itp2.order_product.amount,chichiu_Itp2.product.name,chichiu_Itp2.product.ref_nr,chichiu_Itp2.product.type,chichiu_Itp2.product.unit FROM chichiu_Itp2.order_product JOIN chichiu_Itp2.product ON chichiu_Itp2.product.idVara = chichiu_Itp2.order_product.idvara where idarkiv ="
					+ searchWord + "";
			Statement stmt;
			Statement stmt2;

			try {

				stmt = MainMenu.con.createStatement();
				stmt2 = MainMenu.con.createStatement();

				ResultSet rs = stmt.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();

			//	System.out.println("");

				ResultSet rowcount = stmt2.executeQuery(query2);
				int rc = 0;

				while (rowcount.next()) {
					rc++;

				}

				int y = 0;
				int numberOfColumns = rsmd.getColumnCount();
				table = new Object[rc][numberOfColumns];

				while (rs.next()) {
					//System.out.println(rs.getObject(1));
					for (int j = 1; j <= numberOfColumns; j++) {
						Object columnValue = rs.getObject(j);
						table[y][j - 1] = columnValue;
					}
					y++;
				}

				jTable1.setModel(new javax.swing.table.DefaultTableModel(table,
						new String[] { "Order ID", "Product ID", "Amount", "Name",
								"Ref nr", "Type", "Unit" }));
				
				stmt.close();

			} catch (SQLException ex) {
				System.err.print("SQLException: ");
				System.err.println(ex.getMessage());
			}

		}
	}
	
	private void jButtonShowAllActionPerformed(java.awt.event.ActionEvent evt) {
		printArchive pa = new printArchive();
		table = pa.PrintArchive();

		jTable1.setModel(new javax.swing.table.DefaultTableModel(table,
				new String[] { "Order ID", "Product ID", "Amount", "Name",
						"Ref nr", "Type", "Unit" }));
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonSearch;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jSearchField;
	private javax.swing.JButton jButtonShowAll;
	// End of variables declaration//GEN-END:variables
}
