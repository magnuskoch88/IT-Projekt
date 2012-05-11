/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateDish;

/**
 *
 * @author Andreas Roth
 */
public class NewProductDish extends javax.swing.JPanel {
	Object[][] table = null;
    /**
     * Creates new form NewProductDish
     */
    public NewProductDish(Object[][] x) {
        initComponents(x);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(Object[][] x) {
    	
    	table = x;
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableNewProduct = new javax.swing.JTable();

        jTableNewProduct.setAutoCreateRowSorter(true);
        jTableNewProduct.setModel(new javax.swing.table.DefaultTableModel(
            table,
            new String [] {
                "ID", "Name", "Ref Nr", "Price", "Type", "Unit", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNewProduct.setEditingColumn(0);
        jTableNewProduct.setEditingRow(0);
        jTableNewProduct.setRowHeight(20);
        jScrollPane3.setViewportView(jTableNewProduct);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableNewProduct;
    // End of variables declaration//GEN-END:variables
}