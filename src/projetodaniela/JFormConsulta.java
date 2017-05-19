/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodaniela;
import static javax.swing.JOptionPane.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class JFormConsulta extends javax.swing.JFrame {

    // Atualiza todos os dados do JFormConsulta
    public void atualizar(int indice) {
        // Pegar currículo no ArrayList e atualizar os campos
        Curriculo c = JFormApp.curriculos.get(indice);
        
        nome.setText("Nome: " + c.getNome());
        endereco.setText("Endereço: " + c.getEndereco());
        fone.setText("Fone: " + c.getFone());
        email.setText("E-mail: " + c.getEmail());
        cpf.setText("CPF: " + c.getCpf());
        registroProfissional.setText("Registro Profissional: " + c.getRegistroProfissional());
        publicacoes.setText(c.getPublicacoes());
        
        // Preencher os JTables de titulação, experiência docente & experiência relevante
        DefaultTableModel modelTitulacao = (DefaultTableModel)titulacao.getModel();
        modelTitulacao.setRowCount(0);
        
        for (Titulacao t : c.getTitulacoes()) {
            Object[] newRow = {t.toString()};
            modelTitulacao.addRow(newRow);
        }
        
        DefaultTableModel modelExperienciaDocente = (DefaultTableModel)experienciaDocente.getModel();
        modelExperienciaDocente.setRowCount(0);
        
        for (Experiencia e : c.getExperienciaDocente()) {
            Object[] newRow = {e.toString()};
            modelExperienciaDocente.addRow(newRow);
        }
        
        DefaultTableModel modelExperienciaRelevante = (DefaultTableModel)experienciaRelevante.getModel();
        modelExperienciaRelevante.setRowCount(0);
        
        for (Experiencia e : c.getExperienciaRelevante()) {
            Object[] newRow = {e.toString()};
            modelExperienciaRelevante.addRow(newRow);
        }
    }
    
    // Construtor extra para quando não precisamos receber o índice do usuário
    // (consulta está sendo realizada pelo JFormIndices)
    public JFormConsulta(int indice) {
        initComponents();
        atualizar(indice);
    }
    
    /**
     * Creates new form JFormConsulta
     */
    public JFormConsulta() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cabecalho1 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        fone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        registroProfissional = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        titulacao = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        experienciaDocente = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        experienciaRelevante = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        publicacoes = new javax.swing.JTextPane();
        cabecalho3 = new javax.swing.JLabel();

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

        cabecalho1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cabecalho1.setText("Dados Pessoais");

        nome.setText("Nome:");

        endereco.setText("Endereço:");

        fone.setText("Fone:");

        email.setText("E-mail:");

        cpf.setText("CPF:");

        registroProfissional.setText("Registro Profissional:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(endereco)
                            .addComponent(fone)
                            .addComponent(email))
                        .addContainerGap(321, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registroProfissional))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cabecalho1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cabecalho1)
                .addGap(18, 18, 18)
                .addComponent(nome)
                .addGap(18, 18, 18)
                .addComponent(endereco)
                .addGap(18, 18, 18)
                .addComponent(fone)
                .addGap(18, 18, 18)
                .addComponent(email)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(registroProfissional))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(experienciaRelevante);

        publicacoes.setEditable(false);
        jScrollPane5.setViewportView(publicacoes);

        cabecalho3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cabecalho3.setText("Publicações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cabecalho3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cabecalho3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JFormConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFormConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFormConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFormConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFormConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cabecalho1;
    private javax.swing.JLabel cabecalho3;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JTable experienciaDocente;
    private javax.swing.JTable experienciaRelevante;
    private javax.swing.JLabel fone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nome;
    private javax.swing.JTextPane publicacoes;
    private javax.swing.JLabel registroProfissional;
    private javax.swing.JTable titulacao;
    // End of variables declaration//GEN-END:variables
}
