package org.aerogear.plugin.intellij.mobile.ui.settings;

import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import org.aerogear.plugin.intellij.mobile.ui.configuretarget.OpenshiftGetTokenHandler;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;


public class SettingsPanel extends javax.swing.JPanel implements OpenshiftGetTokenHandler {
    private TextFieldWithBrowseButton sdkConfigValue = new TextFieldWithBrowseButton();


    public SettingsPanel() {
        initComponents();
    }

    public JPanel getSdkConfigPanel() {
        return sdkConfigPanel;
    }

    public JTextField getPlaceholderTextField() {
        return placeholderTextField;
    }

    public String getConfigPath() {
        return sdkConfigValue.getText();
    }

    public void setSdkConfigValue(TextFieldWithBrowseButton sdkConfigValue) {
        this.sdkConfigValue = sdkConfigValue;
    }

    public void setSdkConfigValue(String sdkConfigValue) {
        this.sdkConfigValue.setText(sdkConfigValue);
    }

    public TextFieldWithBrowseButton getSdkConfigValue() {
        return sdkConfigValue;
    }

    public String getUrlValue() {
        return urlValue.getText();
    }

    public void setUrlValue(String urlValue) {
        this.urlValue.setText(urlValue);
    }

    public String getLoginValue() {
        return loginValue.getText();
    }

    public JButton getGetTokenBtn() {
        return this.getTokenBtn;
    }

    public void setLoginValue(String loginValue) {
        this.loginValue.setText(loginValue);
    }

    public String getPasswordValue() {
        return passwordValue.getText();
    }

    public boolean getTlsEnabledValue() {
        return tlsEnabledValue.isSelected();
    }

    public void setTlsEnabledValue(boolean tlsEnabledValue) {
        this.tlsEnabledValue.setSelected(tlsEnabledValue);
    }

    public String getTokenValue() {
        return tokenValue.getText();
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue.setText(tokenValue);
    }

    public String getNamespaceValue() {
        return namespaceValue.getText();
    }

    public void setNamespaceValue(String namespaceValue) {
        this.namespaceValue.setText(namespaceValue);
    }
    public void setPasswordNote(String passwordNote) {
        this.passwordNote.setText(passwordNote);
    }

    public void setTokenNote(String tokenNote) {
        this.tokenNote.setText(tokenNote);
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
        projectSettings = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        headerSeparator = new javax.swing.JSeparator();
        sdkConfigPanel = new javax.swing.JPanel();
        sdkConfigLabel = new javax.swing.JLabel();
        placeholderTextField = new javax.swing.JTextField();
        targetConfigPanel = new javax.swing.JPanel();
        targetLabel = new javax.swing.JLabel();
        targetSeparator = new javax.swing.JSeparator();
        urlLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        tokenLabel = new javax.swing.JLabel();
        namespaceLabel = new javax.swing.JLabel();
        namespaceValue = new javax.swing.JTextField();
        tokenValue = new javax.swing.JTextField();
        passwordValue = new javax.swing.JTextField();
        loginValue = new javax.swing.JTextField();
        urlValue = new javax.swing.JTextField();
        getTokenBtn = new javax.swing.JButton();
        tlsLabel = new javax.swing.JLabel();
        tlsEnabledValue = new javax.swing.JCheckBox();
        notesPanel = new javax.swing.JPanel();
        passwordNote = new javax.swing.JTextArea();
        tokenNote = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(484, 600));

        headerLabel.setText("Project Settings");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerSeparator))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(headerLabel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        sdkConfigLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sdkConfigLabel.setText("SDK config path");

        placeholderTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placeholderTextField.setText("this will be replaced");

        javax.swing.GroupLayout sdkConfigPanelLayout = new javax.swing.GroupLayout(sdkConfigPanel);
        sdkConfigPanel.setLayout(sdkConfigPanelLayout);
        sdkConfigPanelLayout.setHorizontalGroup(
            sdkConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdkConfigPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(sdkConfigLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeholderTextField))
        );
        sdkConfigPanelLayout.setVerticalGroup(
            sdkConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdkConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(placeholderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(sdkConfigLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        targetLabel.setText("Openshift target");

        urlLabel.setText("URL");

        loginLabel.setText("Login");

        passwordLabel.setText("Password*");

        tokenLabel.setText("Token**");

        namespaceLabel.setText("Namespace");

        getTokenBtn.setText("Get Token");

        tlsLabel.setText("TLS enabled");

        tlsEnabledValue.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tlsEnabledValue.setMargin(new java.awt.Insets(1, 0, 0, 1));
        tlsEnabledValue.setPreferredSize(new java.awt.Dimension(22, 18));

        javax.swing.GroupLayout targetConfigPanelLayout = new javax.swing.GroupLayout(targetConfigPanel);
        targetConfigPanel.setLayout(targetConfigPanelLayout);
        targetConfigPanelLayout.setHorizontalGroup(
            targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(targetConfigPanelLayout.createSequentialGroup()
                .addGroup(targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(targetConfigPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namespaceLabel)
                            .addComponent(loginLabel)
                            .addComponent(urlLabel)
                            .addComponent(tokenLabel)
                            .addComponent(passwordLabel)
                            .addComponent(tlsLabel)))
                    .addGroup(targetConfigPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(targetLabel)))
                .addGap(25, 25, 25)
                .addGroup(targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(targetSeparator)
                    .addComponent(namespaceValue)
                    .addComponent(tokenValue)
                    .addComponent(loginValue)
                    .addComponent(urlValue)
                    .addGroup(targetConfigPanelLayout.createSequentialGroup()
                        .addComponent(passwordValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getTokenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(targetConfigPanelLayout.createSequentialGroup()
                        .addComponent(tlsEnabledValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        targetConfigPanelLayout.setVerticalGroup(
            targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(targetConfigPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(targetSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlLabel)
                    .addComponent(urlValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel)
                    .addComponent(loginValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tlsLabel)
                    .addComponent(tlsEnabledValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getTokenBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tokenLabel)
                    .addComponent(tokenValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(targetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namespaceLabel)
                    .addComponent(namespaceValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        passwordNote.setEditable(false);
        passwordNote.setBackground(new Color(0,0,0,0));
        passwordNote.setColumns(20);
        passwordNote.setLineWrap(true);
        passwordNote.setRows(2);
        passwordNote.setWrapStyleWord(true);
        passwordNote.setBorder(null);

        tokenNote.setEditable(false);
        tokenNote.setBackground(new Color(0,0,0,0));
        tokenNote.setColumns(20);
        tokenNote.setLineWrap(true);
        tokenNote.setRows(2);
        tokenNote.setBorder(null);

        javax.swing.GroupLayout notesPanelLayout = new javax.swing.GroupLayout(notesPanel);
        notesPanel.setLayout(notesPanelLayout);
        notesPanelLayout.setHorizontalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tokenNote)
                    .addComponent(passwordNote))
                .addContainerGap())
        );
        notesPanelLayout.setVerticalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tokenNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout projectSettingsLayout = new javax.swing.GroupLayout(projectSettings);
        projectSettings.setLayout(projectSettingsLayout);
        projectSettingsLayout.setHorizontalGroup(
            projectSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sdkConfigPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(targetConfigPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(projectSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        projectSettingsLayout.setVerticalGroup(
            projectSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectSettingsLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sdkConfigPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(targetConfigPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(projectSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(projectSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getTokenBtn;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JSeparator headerSeparator;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField loginValue;
    private javax.swing.JLabel namespaceLabel;
    private javax.swing.JTextField namespaceValue;
    private javax.swing.JPanel notesPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextArea passwordNote;
    private javax.swing.JTextField passwordValue;
    private javax.swing.JTextField placeholderTextField;
    private javax.swing.JPanel projectSettings;
    private javax.swing.JLabel sdkConfigLabel;
    private javax.swing.JPanel sdkConfigPanel;
    private javax.swing.JPanel targetConfigPanel;
    private javax.swing.JLabel targetLabel;
    private javax.swing.JSeparator targetSeparator;
    private javax.swing.JCheckBox tlsEnabledValue;
    private javax.swing.JLabel tlsLabel;
    private javax.swing.JLabel tokenLabel;
    private javax.swing.JTextArea tokenNote;
    private javax.swing.JTextField tokenValue;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField urlValue;
    // End of variables declaration//GEN-END:variables
}
