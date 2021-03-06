/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categoria.view;

/**
 *
 * @author Kimbelly
 */
public class ListarCategoriasJF extends javax.swing.JFrame {

    /**
     * Creates new form ListarCategoriasJF
     */
    public ListarCategoriasJF() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLocacoes = new javax.swing.JTable();
        btnExcluirLocacao = new javax.swing.JButton();
        btnAdicionarCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tunga", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Categorias para filmes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabelaLocacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID categoria", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaLocacoes);

        btnExcluirLocacao.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluirLocacao.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirLocacao.setText("Excluir");
        btnExcluirLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLocacaoActionPerformed(evt);
            }
        });

        btnAdicionarCategoria.setBackground(new java.awt.Color(255, 51, 51));
        btnAdicionarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarCategoria.setText("Adicionar");
        btnAdicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnExcluirLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAdicionarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirLocacao)
                    .addComponent(btnAdicionarCategoria))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLocacaoActionPerformed
        if (tabelaLocacoes.getSelectedRow() != -1){
            DefaultTableModel tabelinha = (DefaultTableModel) tabelaLocacoes.getModel();
            Locacao locacao = new Locacao();
            int i = tabelaLocacoes.getSelectedRow();
            locacao.setDataRetirada((String) tabelaLocacoes.getValueAt(i, 1));
            locacao.setDataDevolucao((String) tabelaLocacoes.getValueAt(i, 2));
            locacao.setCnhMotorista((Integer) tabelaLocacoes.getValueAt(i, 3));
            locacao.setPlacaVeiculo((String) tabelaLocacoes.getValueAt(i, 0));

            locacao.setDataRetirada(formatarDataEntrada(locacao.getDataRetirada()));
            locacao.setDataDevolucao(formatarDataEntrada(locacao.getDataDevolucao()));
            try {
                if (locService.removerLocacao(locacao.getDataRetirada(), locacao.getDataDevolucao(), locacao.getCnhMotorista(), locacao.getPlacaVeiculo())){
                    JOptionPane.showMessageDialog(null, "Locacao Excluída");
                    tabelinha.removeRow(tabelaLocacoes.getSelectedRow());
                }
            } catch (SQLException ex) {
                Logger.getLogger(ListaDeLocacoesJF.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnExcluirLocacaoActionPerformed

    private void btnAdicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(ListarCategoriasJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarCategoriasJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarCategoriasJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarCategoriasJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarCategoriasJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCategoria;
    private javax.swing.JButton btnExcluirLocacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaLocacoes;
    // End of variables declaration//GEN-END:variables
}
