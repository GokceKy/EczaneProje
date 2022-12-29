/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aybala
 */
public class Ana {

    JFrame window = new JFrame();
    JPanel panelana = new JPanel();
    public Login login;
    public IlacPanel panel;

    public Ana(Login login, IlacPanel panel) {
        window.add(login.newPanel);
        this.login = login;
        this.panel = panel;
        window.setSize(700, 700);
        window.setVisible(true);
        window.setLayout(null);

    }

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame winodow) {
        this.window = winodow;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public IlacPanel getPanel() {
        return panel;
    }

    public void setPanel(IlacPanel panel) {
        this.panel = panel;

    }

    public JPanel getPanelana() {
        return panelana;
    }

    public void setPanelana(JPanel panelana) {
        this.panelana = panelana;
        window.add(panelana);
    }

}
