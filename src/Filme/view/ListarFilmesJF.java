/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filme.view;

/**
 *
 * @author Kimbelly
 */
public class ListarFilmesJF extends javax.swing.JFrame {

    /**
     * Creates new form ListarFilmesJF
     */
    public ListarFilmesJF() {
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

        btnExcluirLocacao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLocacoes = new javax.swing.JTable();
        btnExcluirLocacao1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaLocacoes1 = new javax.swing.JTable();
        btnExcluirLocacao2 = new javax.swing.JButton();

        btnExcluirLocacao.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluirLocacao.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirLocacao.setText("Excluir");
        btnExcluirLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLocacaoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tunga", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Locadora de filmes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(158, 158, 158))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Lista de locações:");

        tabelaLocacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa do veículo", "Data de retirada", "Data de Devolução", "CNH do Motorista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaLocacoes);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnExcluirLocacao1.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluirLocacao1.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirLocacao1.setText("Excluir");
        btnExcluirLocacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLocacao1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tunga", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Todos os filmes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabelaLocacoes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nome", "Categoria", "Quantidade (inc)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaLocacoes1);

        btnExcluirLocacao2.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluirLocacao2.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirLocacao2.setText("Editar");
        btnExcluirLocacao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLocacao2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnExcluirLocacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnExcluirLocacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirLocacao1)
                    .addComponent(btnExcluirLocacao2))
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void btnExcluirLocacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLocacao1ActionPerformed
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

    }//GEN-LAST:event_btnExcluirLocacao1ActionPerformed

    private void btnExcluirLocacao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLocacao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirLocacao2ActionPerformed

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
            java.util.logging.Logger.getLogger(ListarFilmesJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFilmesJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFilmesJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFilmesJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFilmesJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirLocacao;
    private javax.swing.JButton btnExcluirLocacao1;
    private javax.swing.JButton btnExcluirLocacao2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaLocacoes;
    private javax.swing.JTable tabelaLocacoes1;
    // End of variables declaration//GEN-END:variables
}