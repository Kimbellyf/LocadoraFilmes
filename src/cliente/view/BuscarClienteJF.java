/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.view;

/**
 *
 * @author Kimbelly
 */
public class BuscarClienteJF extends javax.swing.JFrame {

    /**
     * Creates new form BuscarClienteJF
     */
    public BuscarClienteJF() {
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

        jLabel1 = new javax.swing.JLabel();
        btnBuscarCpf = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buscarCPF = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEditPFisica = new javax.swing.JButton();
        buscaNomePFisica = new javax.swing.JTextField();
        buscaEndePFisica = new javax.swing.JTextField();
        btnApagarPFisica = new javax.swing.JButton();
        buscaCpfPFisica = new javax.swing.JFormattedTextField();
        buscaNascPFisica = new javax.swing.JFormattedTextField();
        buscaSexoMPFisica = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buscaSexoFPFisica = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnEditPFisica1 = new javax.swing.JButton();
        buscaNomePFisica1 = new javax.swing.JTextField();
        buscaEndePFisica1 = new javax.swing.JTextField();
        btnApagarPFisica1 = new javax.swing.JButton();
        buscaCpfPFisica1 = new javax.swing.JFormattedTextField();
        buscaNascPFisica1 = new javax.swing.JFormattedTextField();
        buscaSexoMPFisica1 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        buscaSexoFPFisica1 = new javax.swing.JRadioButton();
        btnBuscarCpf1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buscarCPF1 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        NomeTituloJLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnEditPFisica2 = new javax.swing.JButton();
        buscaNomePFisica2 = new javax.swing.JTextField();
        btnApagarPFisica2 = new javax.swing.JButton();
        buscaCpfPFisica2 = new javax.swing.JFormattedTextField();

        jLabel1.setFont(new java.awt.Font("Tunga", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Categorias para filmes");

        btnBuscarCpf.setText("Buscar");
        btnBuscarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCpfActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Cadastrar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Buscar CPF");

        try {
            buscarCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        buscarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCPFActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setText("Cadastrar Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Endereço:");

        btnEditPFisica.setText("Editar Cliente");
        btnEditPFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPFisicaActionPerformed(evt);
            }
        });

        btnApagarPFisica.setBackground(new java.awt.Color(255, 51, 51));
        btnApagarPFisica.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarPFisica.setText("Excluir Cliente");
        btnApagarPFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarPFisicaActionPerformed(evt);
            }
        });

        try {
            buscaCpfPFisica.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            buscaNascPFisica.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        buscaSexoMPFisica.setBackground(new java.awt.Color(204, 204, 255));
        buscaSexoMPFisica.setText("M");
        buscaSexoMPFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaSexoMPFisicaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Sexo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Data de Nascimento:");

        buscaSexoFPFisica.setBackground(new java.awt.Color(204, 204, 255));
        buscaSexoFPFisica.setText("F");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("CPF:");

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nome:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Data de Nascimento:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("CPF:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Endereço:");

        btnEditPFisica1.setText("Editar Cliente");
        btnEditPFisica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPFisica1ActionPerformed(evt);
            }
        });

        btnApagarPFisica1.setBackground(new java.awt.Color(255, 51, 51));
        btnApagarPFisica1.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarPFisica1.setText("Excluir Cliente");
        btnApagarPFisica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarPFisica1ActionPerformed(evt);
            }
        });

        try {
            buscaCpfPFisica1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            buscaNascPFisica1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        buscaSexoMPFisica1.setBackground(new java.awt.Color(204, 204, 255));
        buscaSexoMPFisica1.setText("M");
        buscaSexoMPFisica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaSexoMPFisica1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Sexo:");

        buscaSexoFPFisica1.setBackground(new java.awt.Color(204, 204, 255));
        buscaSexoFPFisica1.setText("F");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnApagarPFisica1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditPFisica1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buscaSexoMPFisica1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscaSexoFPFisica1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscaNomePFisica1)
                            .addComponent(buscaEndePFisica1)
                            .addComponent(jLabel8)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(buscaNascPFisica1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buscaCpfPFisica1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscaNomePFisica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaNascPFisica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaCpfPFisica1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(buscaEndePFisica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaSexoMPFisica1)
                    .addComponent(buscaSexoFPFisica1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditPFisica1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApagarPFisica1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscarCpf1.setText("Buscar");
        btnBuscarCpf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCpf1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Buscar CPF");

        try {
            buscarCPF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        buscarCPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCPF1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        NomeTituloJLabel.setFont(new java.awt.Font("Tunga", 0, 36)); // NOI18N
        NomeTituloJLabel.setForeground(new java.awt.Color(255, 255, 255));
        NomeTituloJLabel.setText("Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(NomeTituloJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NomeTituloJLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Nome:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("CPF:");

        btnEditPFisica2.setText("Editar Cliente");
        btnEditPFisica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPFisica2ActionPerformed(evt);
            }
        });

        btnApagarPFisica2.setBackground(new java.awt.Color(255, 51, 51));
        btnApagarPFisica2.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarPFisica2.setText("Excluir Cliente");
        btnApagarPFisica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarPFisica2ActionPerformed(evt);
            }
        });

        try {
            buscaCpfPFisica2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnApagarPFisica2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditPFisica2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buscaCpfPFisica2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(buscaNomePFisica2)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(27, 27, 27)
                .addComponent(buscaNomePFisica2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(buscaCpfPFisica2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnEditPFisica2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnApagarPFisica2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(buscarCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnBuscarCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3)))
                .addGap(91, 91, 91)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(buscarCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnBuscarCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCpfActionPerformed
        if (validarCpf()){
            cpf = buscarCPF.getText();
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            cliente = service.buscarPessoaFisica(cpf);

            if (cliente != null){
                buscaNomePFisica.setText(cliente.getNome());
                buscaNascPFisica.setText(formatarDataSaida(cliente.getPFisica().getDataNascimento()));
                buscaCpfPFisica.setText(formatarCpfEntrada(cliente.getPFisica().getCpf()));
                buscaEndePFisica.setText(cliente.getEndereco());
                setarSexoBusca(cliente.getPFisica());
                buscou = true;
                preencherTabela();
            }
            else{
                limparCamposPessoa();
            }
        }
    }//GEN-LAST:event_btnBuscarCpfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CadastroPFisica telaCadPFisica = new  CadastroPFisica();
        //        if (!frameCadPFisicaOpen){
            telaCadPFisica.setVisible(true);
            //            frameCadPFisicaOpen = true;
            //        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCPFActionPerformed

    }//GEN-LAST:event_buscarCPFActionPerformed

    private void btnBuscarCpf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCpf1ActionPerformed
        if (validarCpf()){
            cpf = buscarCPF.getText();
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            cliente = service.buscarPessoaFisica(cpf);

            if (cliente != null){
                buscaNomePFisica.setText(cliente.getNome());
                buscaNascPFisica.setText(formatarDataSaida(cliente.getPFisica().getDataNascimento()));
                buscaCpfPFisica.setText(formatarCpfEntrada(cliente.getPFisica().getCpf()));
                buscaEndePFisica.setText(cliente.getEndereco());
                setarSexoBusca(cliente.getPFisica());
                buscou = true;
                preencherTabela();
            }
            else{
                limparCamposPessoa();
            }
        }
    }//GEN-LAST:event_btnBuscarCpf1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CadastroPFisica telaCadPFisica = new  CadastroPFisica();
        //        if (!frameCadPFisicaOpen){
            telaCadPFisica.setVisible(true);
            //            frameCadPFisicaOpen = true;
            //        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buscarCPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCPF1ActionPerformed

    }//GEN-LAST:event_buscarCPF1ActionPerformed

    private void btnEditPFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPFisicaActionPerformed
        if (buscou){
            if (validarCampos()){
                cliente.setNome(buscaNomePFisica.getText());
                cliente.setEndereco(buscaEndePFisica.getText());

                //            PessoaFisica pessoa = new PessoaFisica();
                pessoa.setDataNascimento(formatarDataEntrada(buscaNascPFisica.getText()));
                pessoa.setCpf(formatarCpfEntrada(buscaCpfPFisica.getText()));
                pessoa.setSexo(sexo);
                try {
                    if (service.alterarClientePFisica(cliente, pessoa)){
                        JOptionPane.showMessageDialog(null, "Cliente Editado!");
                        buscou = false;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro ao realizar alteração.");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro inesperado" + ex);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Busque um cliente");
        }
    }//GEN-LAST:event_btnEditPFisicaActionPerformed

    private void btnApagarPFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarPFisicaActionPerformed
        if (!service.isEmpty(buscaNomePFisica.getText())){
            if (service.deletarClientePFisica(cliente)){
                cliente = null;
                JOptionPane.showMessageDialog(null, "Cliente excluído");
                limparCamposPessoa();
                preencherTabela();
            }
            else{
                JOptionPane.showMessageDialog(null, "O cliente não existe na base de dados");
            }
        }
    }//GEN-LAST:event_btnApagarPFisicaActionPerformed

    private void buscaSexoMPFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaSexoMPFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaSexoMPFisicaActionPerformed

    private void btnEditPFisica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPFisica1ActionPerformed
        if (buscou){
            if (validarCampos()){
                cliente.setNome(buscaNomePFisica.getText());
      
                //            PessoaFisica pessoa = new PessoaFisica()
                try {
                    if (service.alterarClientePFisica(cliente, pessoa)){
                        JOptionPane.showMessageDialog(null, "Cliente Editado!");
                        buscou = false;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro ao realizar alteração.");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro inesperado" + ex);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Busque um cliente");
        }
    }//GEN-LAST:event_btnEditPFisica1ActionPerformed

    private void btnApagarPFisica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarPFisica1ActionPerformed
        if (!service.isEmpty(buscaNomePFisica.getText())){
            if (service.deletarClientePFisica(cliente)){
                cliente = null;
                JOptionPane.showMessageDialog(null, "Cliente excluído");
                limparCamposPessoa();
                preencherTabela();
            }
            else{
                JOptionPane.showMessageDialog(null, "O cliente não existe na base de dados");
            }
        }
    }//GEN-LAST:event_btnApagarPFisica1ActionPerformed

    private void buscaSexoMPFisica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaSexoMPFisica1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaSexoMPFisica1ActionPerformed

    private void btnEditPFisica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPFisica2ActionPerformed
        if (buscou){
            if (validarCampos()){
                cliente.setNome(buscaNomePFisica.getText());
                cliente.setEndereco(buscaEndePFisica.getText());

                //            PessoaFisica pessoa = new PessoaFisica();
                pessoa.setDataNascimento(formatarDataEntrada(buscaNascPFisica.getText()));
                pessoa.setCpf(formatarCpfEntrada(buscaCpfPFisica.getText()));
                pessoa.setSexo(sexo);
                try {
                    if (service.alterarClientePFisica(cliente, pessoa)){
                        JOptionPane.showMessageDialog(null, "Cliente Editado!");
                        buscou = false;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Erro ao realizar alteração.");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro inesperado" + ex);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Busque um cliente");
        }
    }//GEN-LAST:event_btnEditPFisica2ActionPerformed

    private void btnApagarPFisica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarPFisica2ActionPerformed
        if (!service.isEmpty(buscaNomePFisica.getText())){
            if (service.deletarClientePFisica(cliente)){
                cliente = null;
                JOptionPane.showMessageDialog(null, "Cliente excluído");
                limparCamposPessoa();
                preencherTabela();
            }
            else{
                JOptionPane.showMessageDialog(null, "O cliente não existe na base de dados");
            }
        }
    }//GEN-LAST:event_btnApagarPFisica2ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarClienteJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarClienteJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarClienteJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarClienteJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarClienteJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeTituloJLabel;
    private javax.swing.JButton btnApagarPFisica;
    private javax.swing.JButton btnApagarPFisica1;
    private javax.swing.JButton btnApagarPFisica2;
    private javax.swing.JButton btnBuscarCpf;
    private javax.swing.JButton btnBuscarCpf1;
    private javax.swing.JButton btnEditPFisica;
    private javax.swing.JButton btnEditPFisica1;
    private javax.swing.JButton btnEditPFisica2;
    private javax.swing.JFormattedTextField buscaCpfPFisica;
    private javax.swing.JFormattedTextField buscaCpfPFisica1;
    private javax.swing.JFormattedTextField buscaCpfPFisica2;
    private javax.swing.JTextField buscaEndePFisica;
    private javax.swing.JTextField buscaEndePFisica1;
    private javax.swing.JFormattedTextField buscaNascPFisica;
    private javax.swing.JFormattedTextField buscaNascPFisica1;
    private javax.swing.JTextField buscaNomePFisica;
    private javax.swing.JTextField buscaNomePFisica1;
    private javax.swing.JTextField buscaNomePFisica2;
    private javax.swing.JRadioButton buscaSexoFPFisica;
    private javax.swing.JRadioButton buscaSexoFPFisica1;
    private javax.swing.JRadioButton buscaSexoMPFisica;
    private javax.swing.JRadioButton buscaSexoMPFisica1;
    private javax.swing.JFormattedTextField buscarCPF;
    private javax.swing.JFormattedTextField buscarCPF1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
