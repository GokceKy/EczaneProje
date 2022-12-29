/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.*;

/**
 *
 * @author Aybala
 */
public class Login {

    JFrame window;
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    JTextField textField1, textField2;
    public Ana anaframe;
    JOptionPane pane1, pane2, pane3;

    public Login(Ana anaframe) {
        this.anaframe = anaframe;

    }

    public Login() {
        window = new JFrame();

        userLabel = new JLabel();
        userLabel.setBounds(50, 100, 10, 10);
        userLabel.setText("TC");

        textField1 = new JTextField(11);
        textField1.setBounds(50, 100, 15, 15);

        passLabel = new JLabel();
        passLabel.setText("Password");

        textField2 = new JPasswordField(15);
        b1 = new JButton("SUBMIT");

        newPanel = new JPanel();
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);

    }

    public JFrame getWindow() {
        window.setSize(1000, 1000);
        return window;
    }

    public void getoptionpane1() {
        JOptionPane.showMessageDialog(window, "Admin giriş yapti", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public void getoptionpane2() {
        JOptionPane.showMessageDialog(window, "Personel giriş yapti", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public void getoptionpane3() {
        JOptionPane.showMessageDialog(window, "Yanlış giriş", "Alert", JOptionPane.ERROR_MESSAGE);
    }

    public void setWindow(JFrame window) {

        this.window = window;
    }

    public JFrame setwindow(JPanel pan) {

        setNewPanel(pan);
        window.add(pan);
        setWindow(window);
        return window;
    }

    public JButton getB1() {
        return b1;
    }

    public void setB1(JButton b1) {
        this.b1 = b1;
    }

    public JPanel getNewPanel() {
        return newPanel;
    }

    public void setNewPanel(JPanel newPanel) {
        this.newPanel = newPanel;
    }

    public JLabel getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(JLabel userLabel) {
        this.userLabel = userLabel;
    }

    public JLabel getPassLabel() {
        return passLabel;
    }

    public void setPassLabel(JLabel passLabel) {
        this.passLabel = passLabel;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public void add(IlacPanel Panel) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
