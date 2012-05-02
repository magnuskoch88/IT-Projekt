/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Searches;
import java.util.ArrayList;

import gui.*;
import Searches.*;


/**
 *
 * @author DELL
 */
public class Search_Gui extends javax.swing.JPanel {

	Search_Fun fillInit = new Search_Fun();
	Searcher searcher = new Searcher();
	Object [][] table = null;
	
	 public Search_Gui(Object [][] x) throws Exception {
	        initComponents(x);
	    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(Object [][] x) throws Exception {
    	
    	jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Stock = new javax.swing.JTable();

        jTable_Stock.setAutoCreateRowSorter(true);
        jTable_Stock.setBackground(new java.awt.Color(255, 204, 204));
		table = x;
		
		
        jTable_Stock.setModel(new javax.swing.table.DefaultTableModel(
            table,
            new String [] {
                "ID", "Name", "Ref Nr", "Price", "Type", "Unit", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Stock.setEditingColumn(0);
        jTable_Stock.setEditingRow(0);
        jTable_Stock.setRowHeight(20);
        jScrollPane1.setViewportView(jTable_Stock);
        jTable_Stock.getColumnModel().getColumn(0).setResizable(false);
        jTable_Stock.getColumnModel().getColumn(1).setResizable(false);
        jTable_Stock.getColumnModel().getColumn(2).setResizable(false);
        jTable_Stock.getColumnModel().getColumn(4).setResizable(false);
        jTable_Stock.getColumnModel().getColumn(5).setResizable(false);
        jTable_Stock.getColumnModel().getColumn(6).setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>
    // Variables declaration - do not modify
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Stock;
    // End of variables declaration
}