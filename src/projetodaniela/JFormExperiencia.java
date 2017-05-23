/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodaniela;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author aluno
 */
public class JFormExperiencia extends javax.swing.JFrame {

    // Esse mesmo JForm é reutilizado para adicionar experiência docente
    // tanto quanto relevante. Para diferenciar, usamos uma variável de classe:
    // 0 - doscente, 1 - relevante.
    public static int tipo;
    
    // Construtor
    public JFormExperiencia(int t) {
        initComponents();
        
        // Centralizar janela
        setLocationRelativeTo(null);
        
        // Repassar parametro para nossa variável de classe anterior
        tipo = t;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dataInicio = new javax.swing.JFormattedTextField();
        dataTermino = new javax.swing.JFormattedTextField();
        descricao = new javax.swing.JTextField();
        instituicao = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Experiência");

        jLabel1.setText("Data de Início: ");

        jLabel2.setText("Instituição:");

        jLabel3.setText("Cidade:");

        jLabel4.setText("Estado:");

        jLabel5.setText("Descrição:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Adicionar Experiência");

        jLabel7.setText("Data de Conclusão:");

        dataInicio.setFormatterFactory(JFormApp.mascaraData());

        dataTermino.setFormatterFactory(JFormApp.mascaraData());

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(cancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(salvar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dataTermino)
                                .addComponent(dataInicio)
                                .addComponent(cidade)
                                .addComponent(estado)
                                .addComponent(instituicao, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(instituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // Fechar janela
        setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // Certificar que todos os campos foram preenchidos
        if ("  /  /    ".equals(dataInicio.getText()) ||
            "  /  /    ".equals(dataTermino.getText()) ||
            "".equals(descricao.getText()) ||
            "".equals(instituicao.getText()) ||
            "".equals(cidade.getText()) ||
            "".equals(estado.getText()) ) {
            showMessageDialog(null, "Todos os campos devem ser preenchidos.", "Erro", ERROR_MESSAGE);
        }
        else {
            Experiencia e = new Experiencia();
            e.setDataInicio(dataInicio.getText());
            e.setDataTermino(dataTermino.getText());
            e.setDescricao(descricao.getText());
            e.setInstituicao(instituicao.getText());
            e.setCidade(cidade.getText());
            e.setEstado(estado.getText());
            
            switch (tipo) {
                case 0:
                    JFormCadastro.adicionarExperienciaDocente(e);
                    break;
                case 1:
                    JFormCadastro.adicionarExperienciaRelevante(e);
                    break;
                default:
                    // wtf
                    System.exit(-1);
            }
            
            // Fechar janela
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_salvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField dataInicio;
    private javax.swing.JFormattedTextField dataTermino;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField instituicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
