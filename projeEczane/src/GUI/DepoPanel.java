/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Entity.IlacAdet;
import Modal.Entity.DataAccess;
import java.awt.Color;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Aybala
 */
public class DepoPanel {

    JFrame depowindow;
    JPanel panel;
    JButton guncelle;
    JTable tablo;
    JTextField textField1, textField2;
    IlacPanel ilacpanel = new IlacPanel();
    IlacAdet adet;
    DataAccess data = new DataAccess();
    JScrollPane sp;
    JButton ciro;
    JButton listelee;

    public DepoPanel() {
        depowindow = new JFrame();
        depowindow.setSize(900, 900);
        depowindow.setLayout(null);
        panel = new JPanel();
        panel.setSize(900, 900);

        guncelle = new JButton("GUNCELLE");
        guncelle.setSize(100, 100);
        guncelle.setBounds(100, 100, 120, 70);
        panel.add(guncelle);

        ciro = new JButton("CIRO");
        ciro.setSize(100, 100);
        ciro.setBounds(100, 170, 120, 70);
        panel.add(ciro);

        listelee = new JButton("LISTELE");
        listelee.setSize(100, 100);
        listelee.setBounds(150, 160, 110, 70);
        panel.add(listelee);
        panel.setBackground(Color.PINK);

        String data[][] = {{ilacpanel.getBarkod().getText(), "Parol", "120", "1"},
        {"002", "Arveles", "120", "1"},
        {"003", "Nurofen", "120", "1"}};
        String column[] = {"ID", "ISIM", "FIYAT", "ADET"};
        tablo = new JTable(data, column);
        tablo.setSize(300, 300);
        tablo.setBounds(100, 200, 300, 300);
        sp = new JScrollPane(tablo);
        panel.add(sp);
        depowindow.add(panel);

    }

    public JFrame getDepowindow() {
        return depowindow;
    }

    public void setDepowindow(JFrame depowindow) {
        this.depowindow = depowindow;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getGuncelle() {
        return guncelle;
    }

    public void setGuncelle(JButton guncelle) {
        this.guncelle = guncelle;
    }

    public JTable getTablo() {
        return tablo;
    }

    public void setTablo(JTable tablo) {
        this.tablo = tablo;
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

    public IlacPanel getIlacpanel() {
        return ilacpanel;
    }

    public void setIlacpanel(IlacPanel ilacpanel) {
        this.ilacpanel = ilacpanel;
    }

    public IlacAdet getAdet() {
        return adet;
    }

    public void setAdet(IlacAdet adet) {
        this.adet = adet;
    }

    public JScrollPane getSp() {
        return sp;
    }

    public void setSp(JScrollPane sp) {
        this.sp = sp;
    }

    public JButton getCiro() {
        return ciro;
    }

    public void setCiro(JButton ciro) {
        this.ciro = ciro;
    }

    public JButton getListelee() {
        return listelee;
    }

    public void setListelee(JButton listelee) {
        this.listelee = listelee;
    }

}
