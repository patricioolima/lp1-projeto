/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodaniela;
import java.io.*;
import java.util.*;
import javax.swing.text.*;

/**
 *
 * @author aluno
 */
public class JFormApp extends javax.swing.JFrame {

    // ArrayList dos currículos
    public static ArrayList<Curriculo> curriculos = new ArrayList<>();
    
    // Gravar todos os dados em arquivo
    public static boolean gravarDados() {
        try {
            // Abrir o arquivo
            FileOutputStream fOutput = new FileOutputStream("curriculos.dat");
            
            // Abrir o stream de objetos
            ObjectOutputStream oOutput = new ObjectOutputStream(fOutput);
            
            // Escrever todos os currículos
            oOutput.writeObject(curriculos);
            
            // Fechar os streams
            oOutput.close();
            fOutput.close();  
        } catch (Exception e) {
            return false;
        }
        
        return true;
    }
    
    // Ler dados do arquivo
    public static boolean lerDados() {
        try {
            // Abrir o arquivo
            FileInputStream fInput = new FileInputStream("curriculos.dat");
            
            // Abrir o stream de objetos
            ObjectInputStream oInput = new ObjectInputStream(fInput);
            
            // Ler  todos os currículos
            curriculos = (ArrayList<Curriculo>)oInput.readObject();
            
            // Fechar os streams
            oInput.close();
            fInput.close();    
        } catch (Exception e) {
            return false;
        }
        
        return true;
    }
    
    // Máscaras para os JFOrmattedTextFields
    public static DefaultFormatterFactory mascaraData(){
        MaskFormatter mask = null;
        
        try {
            mask = new MaskFormatter("##/##/####");
        } catch(Exception pe) {}
        
        DefaultFormatterFactory factory = new DefaultFormatterFactory(mask, mask);
        return factory;
    }
    
    public static DefaultFormatterFactory mascaraAno(){
        MaskFormatter mask = null;
        
        try {
            mask = new MaskFormatter("####");
            mask.setValueContainsLiteralCharacters(false);
        } catch(Exception pe) {}
        
        DefaultFormatterFactory factory = new DefaultFormatterFactory(mask, mask);
        return factory;
    }
    
    public static DefaultFormatterFactory mascaraCPF(){
        MaskFormatter mask = null;
        
        try {
            mask = new MaskFormatter("###.###.###-##");
            mask.setValueContainsLiteralCharacters(false);
        } catch(Exception pe) {}
        
        DefaultFormatterFactory factory = new DefaultFormatterFactory(mask, mask);
        return factory;
    }
    
    public static DefaultFormatterFactory mascaraTelefone(){
        MaskFormatter mask = null;
        
        try {
            mask = new MaskFormatter("(##)#####-####");
            mask.setValueContainsLiteralCharacters(false);
        } catch(Exception pe) {}
        
        DefaultFormatterFactory factory = new DefaultFormatterFactory(mask, mask);
        return factory;
    }
    
    /**
     * Creates new form MainApp
     */
    public JFormApp() {
        initComponents();
        
        // Ao inicializar o programa, ler dados do arquivo
        lerDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        cadastrar = new javax.swing.JMenuItem();
        gerarIndice = new javax.swing.JMenuItem();
        consultar = new javax.swing.JMenuItem();
        alterar = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenu2.setText("File");

        cadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        cadastrar.setText("Cadastrar Novo Currículo");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        jMenu2.add(cadastrar);

        gerarIndice.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        gerarIndice.setText("Ver Todos Currículos");
        gerarIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarIndiceActionPerformed(evt);
            }
        });
        jMenu2.add(gerarIndice);

        consultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        consultar.setText("Consultar Currículo");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jMenu2.add(consultar);

        alterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        alterar.setText("Alterar Currículo");
        jMenu2.add(alterar);

        sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu2.add(sair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        JFormCadastro janelaCadastro = new JFormCadastro();
        pack();
        janelaCadastro.setVisible(true);
        
    }//GEN-LAST:event_cadastrarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        JFormConsulta janelaConsulta = new JFormConsulta();
        pack();
        janelaConsulta.setVisible(true);
    }//GEN-LAST:event_consultarActionPerformed

    private void gerarIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarIndiceActionPerformed
        JFormIndices janelaIndices = new JFormIndices();
        pack();
        janelaIndices.setVisible(true);
    }//GEN-LAST:event_gerarIndiceActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // Ao sair do programa, salvar todos os currículos em arquivo
        gravarDados();
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Ao sair do programa, salvar todos os currículos em arquivo
        gravarDados();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(JFormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFormApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alterar;
    private javax.swing.JMenuItem cadastrar;
    private javax.swing.JMenuItem consultar;
    private javax.swing.JMenuItem gerarIndice;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem sair;
    // End of variables declaration//GEN-END:variables
}
