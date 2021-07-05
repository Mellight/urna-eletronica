
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mellz
 */
public class ValidaTitulo extends javax.swing.JFrame {

    /**
     * Creates new form ValidaTitulo
     */
    public ValidaTitulo() {
        initComponents();
        jTtitulo.setDocument(new Doc2());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTtitulo = new javax.swing.JTextField();
        jBconsultar = new javax.swing.JButton();
        jBautoriza = new javax.swing.JButton();
        jBcancela = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLeleFoto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLestado = new javax.swing.JLabel();
        jLnumRg = new javax.swing.JLabel();
        jLeleNome = new javax.swing.JLabel();
        jLdataNasc = new javax.swing.JLabel();
        jLcidade = new javax.swing.JLabel();
        jLnumTitulo = new javax.swing.JLabel();
        jLzona = new javax.swing.JLabel();
        jLsecao = new javax.swing.JLabel();
        jTvotou = new javax.swing.JTextField();
        jBencerramento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELEIÇÃO 2021 ::: Verificar Tìtulo");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DIGITE O TÍTULO");

        jTtitulo.setBackground(new java.awt.Color(204, 204, 204));
        jTtitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTtitulo.setForeground(new java.awt.Color(51, 51, 51));
        jTtitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTtitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtituloActionPerformed(evt);
            }
        });

        jBconsultar.setBackground(new java.awt.Color(51, 51, 51));
        jBconsultar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBconsultar.setForeground(new java.awt.Color(204, 204, 204));
        jBconsultar.setText("Consultar");
        jBconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jTtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBconsultar)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBconsultar))
                .addGap(27, 27, 27))
        );

        jBautoriza.setBackground(new java.awt.Color(51, 51, 51));
        jBautoriza.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBautoriza.setForeground(new java.awt.Color(204, 204, 204));
        jBautoriza.setText("Autorizar");
        jBautoriza.setEnabled(false);
        jBautoriza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBautorizaActionPerformed(evt);
            }
        });

        jBcancela.setBackground(new java.awt.Color(51, 51, 51));
        jBcancela.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBcancela.setForeground(new java.awt.Color(204, 204, 204));
        jBcancela.setText("Cancelar");
        jBcancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DADOS DO ELEITOR");

        jLeleFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Título:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("RG:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Data Nascimento:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Zona:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Cidade:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Estado:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Seção:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Votou?:");

        jLestado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLestado.setForeground(new java.awt.Color(51, 51, 51));
        jLestado.setText("        ");

        jLnumRg.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLnumRg.setForeground(new java.awt.Color(51, 51, 51));
        jLnumRg.setText("        ");

        jLeleNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLeleNome.setForeground(new java.awt.Color(51, 51, 51));
        jLeleNome.setText("        ");

        jLdataNasc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLdataNasc.setForeground(new java.awt.Color(51, 51, 51));
        jLdataNasc.setText("        ");

        jLcidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLcidade.setForeground(new java.awt.Color(51, 51, 51));
        jLcidade.setText("        ");

        jLnumTitulo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLnumTitulo.setForeground(new java.awt.Color(51, 51, 51));
        jLnumTitulo.setText("        ");

        jLzona.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLzona.setForeground(new java.awt.Color(51, 51, 51));
        jLzona.setText("        ");

        jLsecao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLsecao.setForeground(new java.awt.Color(51, 51, 51));
        jLsecao.setText("        ");

        jTvotou.setEditable(false);
        jTvotou.setBackground(new java.awt.Color(204, 204, 204));
        jTvotou.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTvotou.setForeground(new java.awt.Color(51, 51, 51));
        jTvotou.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLeleNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLcidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLzona, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTvotou, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLsecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLestado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLdataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLeleFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLnumTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLnumRg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLeleFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLnumTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLnumRg))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLeleNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLdataNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLcidade)
                    .addComponent(jLabel11)
                    .addComponent(jLestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLzona)
                    .addComponent(jLabel12)
                    .addComponent(jLsecao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTvotou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jBencerramento.setBackground(new java.awt.Color(51, 51, 51));
        jBencerramento.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jBencerramento.setForeground(new java.awt.Color(204, 204, 204));
        jBencerramento.setText("Encerrar");
        jBencerramento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBencerramentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jBautoriza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBencerramento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBcancela))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBautoriza)
                    .addComponent(jBcancela)
                    .addComponent(jBencerramento))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void carregarDados(Eleitor e) {
        ImageIcon icone;
        icone = new ImageIcon(getClass().getResource("img/" + e.getFoto()));
        jLeleFoto.setIcon(icone);

        jLnumTitulo.setText(e.getTitulo());
        jLnumRg.setText(e.getRg());
        jLeleNome.setText(e.getNome());
        jLdataNasc.setText(e.getDataNasc());
        jLcidade.setText(e.getCidade());
        jLestado.setText(e.getEstado());
        jLzona.setText(e.getZona());
        jLsecao.setText(e.getSecao());
        jTvotou.setText(e.getVotou());
    }
    
    public void limparCampos(){
        jLeleFoto.setIcon(null);
        jTtitulo.setText("");
        jLnumTitulo.setText("");
        jLnumRg.setText("");
        jLeleNome.setText("");
        jLdataNasc.setText("");
        jLcidade.setText("");
        jLestado.setText("");
        jLzona.setText("");
        jLsecao.setText("");
        jTvotou.setText("");
    }

    private void autBotao(boolean autoriza) {
        jBautoriza.setEnabled(autoriza);
    }

    private void jBautorizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBautorizaActionPerformed
        EleitorDAO dao = new EleitorDAO();
        Eleitor ele = new Eleitor();

        String voto = jTvotou.getText();

        if (voto.equals("N")) {
            jTvotou.setText("");
            jTvotou.setText(jTvotou.getText() + "S");

            ele.setTitulo(jTtitulo.getText());
            ele.setVotou(jTvotou.getText());
            dao.editarEleitor(ele);

            UrnaE votacao = new UrnaE();
            votacao.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(null, "O voto deste eleitor já foi computado pelo sistema!", "ELEIÇÃO 2021 ::: Sistema", 0);
            limparCampos();
            autBotao(false);
        }
    }//GEN-LAST:event_jBautorizaActionPerformed

    private void jBcancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelaActionPerformed
        EleicaoInicio eleicao = new EleicaoInicio();
        eleicao.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBcancelaActionPerformed

    private void jTtituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtituloActionPerformed
    }//GEN-LAST:event_jTtituloActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        if (jTtitulo.getText().length() < 2) {
            jTtitulo.getText();
        }

        EleitorDAO dao = new EleitorDAO();
        Eleitor e = new Eleitor();

        if (!"".equals(jTtitulo.getText())) {
            e = dao.consultaEle(jTtitulo.getText());

            if (e != null) {
                carregarDados(e);
                autBotao(true);
            } else {
                JOptionPane.showMessageDialog(null, "Eleitor não encontrado! Tente novamente.", "ELEIÇÃO 2021 ::: Sistema", 0);
                jTtitulo.setText("");
                autBotao(false);
            }
        }
    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jBencerramentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBencerramentoActionPerformed
        EncerraEleicao encerra = new EncerraEleicao();
        encerra.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBencerramentoActionPerformed

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
            java.util.logging.Logger.getLogger(ValidaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidaTitulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValidaTitulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBautoriza;
    private javax.swing.JButton jBcancela;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBencerramento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcidade;
    private javax.swing.JLabel jLdataNasc;
    private javax.swing.JLabel jLeleFoto;
    private javax.swing.JLabel jLeleNome;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLnumRg;
    private javax.swing.JLabel jLnumTitulo;
    private javax.swing.JLabel jLsecao;
    private javax.swing.JLabel jLzona;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTtitulo;
    private javax.swing.JTextField jTvotou;
    // End of variables declaration//GEN-END:variables
}

class Doc2 extends PlainDocument {

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        int tam = (this.getLength() + str.length());
        if (tam <= 2) {
            super.insertString(offs, str.replaceAll("[aA-zZ]", ""), a);
        } else {
            super.insertString(offs, str.replaceAll("[aA0-zZ9]", ""), a);
        }

    }

}
