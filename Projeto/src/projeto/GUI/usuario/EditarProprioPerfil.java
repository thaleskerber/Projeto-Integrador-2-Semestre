package projeto.GUI.usuario;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projeto.Main;
import projeto.model.Usuario;

public class EditarProprioPerfil extends javax.swing.JFrame {

    public EditarProprioPerfil() {
        initComponents();

        setTitle("Pro4Tech - Editar perfil");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoSenhaAtual = new javax.swing.JPasswordField();
        campoNovaSenha = new javax.swing.JPasswordField();
        campoNovaSenhaConfirmacao = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        botaoTrocarInfo = new javax.swing.JButton();
        botaoTrocarSenha = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Senha atual:");
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nova senha:");
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nova senha (confirmação):");
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Editar Perfil");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Login:");
        jLabel5.setPreferredSize(new java.awt.Dimension(40, 20));

        botaoTrocarInfo.setText("Confirmar");
        botaoTrocarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTrocarInfoActionPerformed(evt);
            }
        });

        botaoTrocarSenha.setText("Confirmar");
        botaoTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTrocarSenhaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email:");
        jLabel6.setPreferredSize(new java.awt.Dimension(40, 20));

        campoEmail.setPreferredSize(new java.awt.Dimension(6, 20));

        campoCancelar.setText("Cancelar");
        campoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoSenhaAtual)
                                        .addComponent(campoNovaSenha)
                                        .addComponent(campoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                                    .addComponent(campoNovaSenhaConfirmacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoTrocarInfo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(campoCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(botaoTrocarSenha)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoTrocarInfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNovaSenhaConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoTrocarSenha)
                    .addComponent(campoCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTrocarSenhaActionPerformed

        Usuario usuario = Main.getManager().getUsuarioLogado();
        String senhaAtual = new String(campoSenhaAtual.getPassword());
        String senhaNova = new String(campoNovaSenha.getPassword());
        String senhaNovaConfirmacao = new String(campoNovaSenhaConfirmacao.getPassword());

        if(senhaAtual.isEmpty() || senhaNova.isEmpty() || senhaNovaConfirmacao.isEmpty()){
            JOptionPane.showMessageDialog(null, "Faltam campos para preencher", "Atenção!", 2);
            return;
        }

        if(!usuario.getSenha().equals(senhaAtual)){
            JOptionPane.showMessageDialog(null, "Senha atual incorreta", "Atenção!", 2);
            return;
        }

        if(!senhaNova.equals(senhaNovaConfirmacao)){
            JOptionPane.showMessageDialog(null, "Confirmação de senha inválida", "Atenção!", 2);
            return;
        }

        if(senhaNova.length() < 8){
            JOptionPane.showMessageDialog(null, "A senha deve conter ao menos 8 caracteres", "Atenção!", 2);
            return;
        }

        usuario.setSenha(senhaNova);
        Main.getManager().editarUsuario(usuario);
        JOptionPane.showMessageDialog(null, "Senha alterada com sucesso");     
        dispose();
    }//GEN-LAST:event_botaoTrocarSenhaActionPerformed

    private void campoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_campoCancelarActionPerformed

    private void botaoTrocarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTrocarInfoActionPerformed

        Usuario usuario = Main.getManager().getUsuarioLogado();
        String login = usuario.getUserName();
        String email = usuario.getEmail();
        if(campoLogin.getText().isEmpty() && campoEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Faltam campos para preencher", "Atenção!", 2);
            return;
        }

        if(!campoLogin.getText().isEmpty()){
            if(Main.getManager().existeUsuario(campoLogin.getText())){
                JOptionPane.showMessageDialog(null, "Login já cadastrado", "Atenção!", 2);
                return;
            }
            login = campoLogin.getText();
        }

       if(!campoEmail.getText().isEmpty()){
            if(!campoEmail.getText().contains("@")){
                JOptionPane.showMessageDialog(null, "Formato de email incorreto", "Atenção!", 2);
                return;
            }
            email = campoEmail.getText();
        }

        usuario.setUserName(login);
        usuario.setEmail(email);
        Main.getManager().editarUsuario(usuario);
        JOptionPane.showMessageDialog(null, "Perfil atualizado com sucesso");     
        dispose();
    }//GEN-LAST:event_botaoTrocarInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoTrocarInfo;
    private javax.swing.JButton botaoTrocarSenha;
    private javax.swing.JButton campoCancelar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoNovaSenha;
    private javax.swing.JPasswordField campoNovaSenhaConfirmacao;
    private javax.swing.JPasswordField campoSenhaAtual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
