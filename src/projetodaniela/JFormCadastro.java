/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodaniela;
import java.util.*;
import static javax.swing.JOptionPane.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class JFormCadastro extends javax.swing.JFrame {

    // Construtor chamado quando queremos usar esse JForm para editar
    // um currículo já existente.
    public JFormCadastro(int indice) {
        initComponents();

        status = indice;

        // Receber dados do currículo já cadastrado e colocar-los
        // nos textfields.
        Curriculo c = JFormApp.curriculos.get(indice);

        nome.setText(c.getNome());
        endereco.setText(c.getEndereco());
        fone.setText(c.getFone());
        email.setText(c.getEmail());
        cpf.setText(c.getCpf());
        registroProfissional.setText(c.getRegistroProfissional());
        publicacoes.setText(c.getPublicacoes());

        tempTitulacoes = c.getTitulacoes();
        tempExperienciaDocente = c.getExperienciaDocente();
        tempExperienciaRelevante = c.getExperienciaRelevante();

        atualizarTabelas();
    }
    
    /**
     * Creates new form JFormCadastro
     */
    public JFormCadastro() {
        initComponents();
        status = 0;
        
        // Re-instanciar os ArrayLists para garantir que toda vez
        // que esta janela for aberta, eles estejam vazios.
        tempTitulacoes = new ArrayList<>();
        tempExperienciaDocente = new ArrayList<>();
        tempExperienciaRelevante = new ArrayList<>();
        
        atualizarTabelas();
    }
    
    // ArrayLists temporários que serão repassados ao currículo sendo
    // cadastrado. São static para poderem ser manuseados a partir de outros
    // JForms.
    public static ArrayList<Titulacao> tempTitulacoes;
    public static ArrayList<Experiencia> tempExperienciaDocente;
    public static ArrayList<Experiencia> tempExperienciaRelevante;
    
    // Esse mesmo JForm é usado para cadastrar novos currículos e alterar
    // currículos já existentes. Para saber qual estamos fazendo, usamos
    // uma variável de classe. -1 = novo currículo, qualquer outro valor =
    // índice do currículo que estamos editando.
    public static int status;
    
    // Popular os JTables com os conteúdos dos ArrayLists temporários.
    public void atualizarTabelas() {
        // Atualizar os JTables
        DefaultTableModel modelTitulacao = (DefaultTableModel)titulacao.getModel();
        modelTitulacao.setRowCount(0);
        
        for (Titulacao t : tempTitulacoes) {
            Object[] newRow = {t.toString()};
            modelTitulacao.addRow(newRow);
        }
        
        DefaultTableModel modelExperienciaDocente = (DefaultTableModel)experienciaDocente.getModel();
        modelExperienciaDocente.setRowCount(0);
        
        for (Experiencia e : tempExperienciaDocente) {
            Object[] newRow = {e.toString()};
            modelExperienciaDocente.addRow(newRow);
        }
        
        DefaultTableModel modelExperienciaRelevante = (DefaultTableModel)experienciaRelevante.getModel();
        modelExperienciaRelevante.setRowCount(0);
        
        for (Experiencia e : tempExperienciaRelevante) {
            Object[] newRow = {e.toString()};
            modelExperienciaRelevante.addRow(newRow);
        }
    }
    
    public static void adicionarTitulacao(Titulacao t) {
        tempTitulacoes.add(t);
    }
    
    public static void adicionarExperienciaDocente(Experiencia e) {
        tempExperienciaDocente.add(e);
    }
    
    public static void adicionarExperienciaRelevante(Experiencia e) {
        tempExperienciaRelevante.add(e);
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
        cabecalho1 = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        enderecoLabel = new javax.swing.JLabel();
        foneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        registroProfissionalLabel = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        fone = new javax.swing.JFormattedTextField();
        cpf = new javax.swing.JFormattedTextField();
        registroProfissional = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        titulacao = new javax.swing.JTable();
        removerTitulacao = new javax.swing.JButton();
        adicionarTitulacao = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        experienciaDocente = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        experienciaRelevante = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        publicacoes = new javax.swing.JTextPane();
        cabecalho3 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        adicionarExperienciaDocente = new javax.swing.JButton();
        removerExperienciaDocente = new javax.swing.JButton();
        adicionarExperienciaRelevante = new javax.swing.JButton();
        removerExperienciaRelevante = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        cabecalho1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cabecalho1.setText("Dados Pessoais");

        nomeLabel.setText("Nome:");

        enderecoLabel.setText("Endereço:");

        foneLabel.setText("Fone:");

        emailLabel.setText("E-mail:");

        cpfLabel.setText("CPF:");

        registroProfissionalLabel.setText("Registro Profissional:");

        fone.setFormatterFactory(JFormApp.mascaraTelefone());

        cpf.setFormatterFactory(JFormApp.mascaraCPF());

        titulacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Titulação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(titulacao);

        removerTitulacao.setText("Remover Item Selecionado");
        removerTitulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerTitulacaoActionPerformed(evt);
            }
        });

        adicionarTitulacao.setText("Adicionar Titulação");
        adicionarTitulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarTitulacaoActionPerformed(evt);
            }
        });

        experienciaDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Experiência Profissional Docente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(experienciaDocente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel)
                            .addComponent(enderecoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(nome)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cpfLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registroProfissionalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registroProfissional))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foneLabel)
                            .addComponent(emailLabel))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fone)
                            .addComponent(email)))))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabecalho1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adicionarTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removerTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cabecalho1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoLabel)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foneLabel)
                    .addComponent(fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(registroProfissionalLabel)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registroProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerTitulacao)
                    .addComponent(adicionarTitulacao))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        experienciaRelevante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Experiência Profissional Relevante"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(experienciaRelevante);

        jScrollPane5.setViewportView(publicacoes);

        cabecalho3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cabecalho3.setText("Publicações");

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        adicionarExperienciaDocente.setText("Adicionar Experiência");
        adicionarExperienciaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarExperienciaDocenteActionPerformed(evt);
            }
        });

        removerExperienciaDocente.setText("Remover Item Selecionado");
        removerExperienciaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerExperienciaDocenteActionPerformed(evt);
            }
        });

        adicionarExperienciaRelevante.setText("Adicionar Experiência");
        adicionarExperienciaRelevante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarExperienciaRelevanteActionPerformed(evt);
            }
        });

        removerExperienciaRelevante.setText("Remover Item Selecionado");
        removerExperienciaRelevante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerExperienciaRelevanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adicionarExperienciaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removerExperienciaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cabecalho3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adicionarExperienciaRelevante, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removerExperienciaRelevante, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarExperienciaDocente)
                    .addComponent(removerExperienciaDocente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarExperienciaRelevante)
                    .addComponent(removerExperienciaRelevante))
                .addGap(18, 18, 18)
                .addComponent(cabecalho3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvar)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // Checar se todos os campos estão preenchidos.
        if ("".equals(nome.getText()) ||
            "".equals(endereco.getText()) ||
            "".equals(email.getText()) ||
            "".equals(registroProfissional.getText()) ||
            "".equals(fone.getText()) ||
            "".equals(cpf.getText()) ) {
            showMessageDialog(null, "Todos os campos devem ser preenchidos.", "Erro", ERROR_MESSAGE);
        }
        else {
            // Instanciar um currículo
            Curriculo novoCurriculo = new Curriculo();
            novoCurriculo.setNome(nome.getText());
            novoCurriculo.setEndereco(endereco.getText());
            novoCurriculo.setEmail(email.getText());
            novoCurriculo.setRegistroProfissional(registroProfissional.getText());
            novoCurriculo.setFone(fone.getText());
            novoCurriculo.setCpf(cpf.getText());
            novoCurriculo.setPublicacoes(publicacoes.getText());
            novoCurriculo.setTitulacoes(tempTitulacoes);
            novoCurriculo.setExperienciaDocente(tempExperienciaDocente);
            novoCurriculo.setExperienciaRelevante(tempExperienciaRelevante);

            // Cadastrar no ArrayList, dependendo do caso
            if (status == -1) {
                // Novo currículo
                JFormApp.curriculos.add(novoCurriculo);
                showMessageDialog(null, "Cadastro realizado com sucesso.", "Sucesso", 1);
            }
            else {
                // Editando currículo já existente
                JFormApp.curriculos.remove(status);
                JFormApp.curriculos.add(status, novoCurriculo);
                showMessageDialog(null, "Cadastro realizado com sucesso.", "Sucesso", 1);
            }
            

            // Fechar janela
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void removerTitulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerTitulacaoActionPerformed
        if (titulacao.getSelectedRow() != -1) {
            tempTitulacoes.remove(titulacao.getSelectedRow());
        }
        
        atualizarTabelas();
    }//GEN-LAST:event_removerTitulacaoActionPerformed

    private void removerExperienciaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerExperienciaDocenteActionPerformed
        if (experienciaDocente.getSelectedRow() != -1) {
            tempExperienciaDocente.remove(experienciaDocente.getSelectedRow());
        }
        
        atualizarTabelas();
    }//GEN-LAST:event_removerExperienciaDocenteActionPerformed

    private void removerExperienciaRelevanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerExperienciaRelevanteActionPerformed
        if (experienciaRelevante.getSelectedRow() != -1) {
            tempExperienciaRelevante.remove(experienciaRelevante.getSelectedRow());
        }
        
        atualizarTabelas();
    }//GEN-LAST:event_removerExperienciaRelevanteActionPerformed

    private void adicionarTitulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarTitulacaoActionPerformed
        JFormTitulacao janelaTitulacao = new JFormTitulacao();
        pack();
        janelaTitulacao.setVisible(true);
    }//GEN-LAST:event_adicionarTitulacaoActionPerformed

    private void adicionarExperienciaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarExperienciaDocenteActionPerformed
        JFormExperiencia janelaExperiencia = new JFormExperiencia(0);
        pack();
        janelaExperiencia.setVisible(true);
    }//GEN-LAST:event_adicionarExperienciaDocenteActionPerformed

    private void adicionarExperienciaRelevanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarExperienciaRelevanteActionPerformed
        JFormExperiencia janelaExperiencia = new JFormExperiencia(1);
        pack();
        janelaExperiencia.setVisible(true);
    }//GEN-LAST:event_adicionarExperienciaRelevanteActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        atualizarTabelas();
    }//GEN-LAST:event_formWindowGainedFocus

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFormCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarExperienciaDocente;
    private javax.swing.JButton adicionarExperienciaRelevante;
    private javax.swing.JButton adicionarTitulacao;
    private javax.swing.JLabel cabecalho1;
    private javax.swing.JLabel cabecalho3;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField endereco;
    private javax.swing.JLabel enderecoLabel;
    private javax.swing.JTable experienciaDocente;
    private javax.swing.JTable experienciaRelevante;
    private javax.swing.JFormattedTextField fone;
    private javax.swing.JLabel foneLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextPane publicacoes;
    private javax.swing.JTextField registroProfissional;
    private javax.swing.JLabel registroProfissionalLabel;
    private javax.swing.JButton removerExperienciaDocente;
    private javax.swing.JButton removerExperienciaRelevante;
    private javax.swing.JButton removerTitulacao;
    private javax.swing.JButton salvar;
    private javax.swing.JTable titulacao;
    // End of variables declaration//GEN-END:variables
}
