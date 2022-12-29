/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Entity.Hesap;
import Entity.IlacAdet;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Aybala
 */
public class CiroPanel {

    Hesap hesap;
    JFrame cirowindow = new JFrame();
    JPanel panel;
    JButton hesapla;
    JTable fiyattablo;
    JTextField textField1, textField2, textField3;
    JLabel label1, label2, label3;
    IlacPanel ilacpanel = new IlacPanel();
    IlacAdet adet;
    JScrollPane sp;
    JTable tablo;

    public CiroPanel() {
        create();
    }

    public void create() {

        cirowindow.setSize(900, 900);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(900, 900);
        hesapla = new JButton("HESAPLA");
        hesapla.setSize(100, 40);
        hesapla.setBounds(100, 100, 100, 40);
        panel.add(hesapla);
        panel.setBackground(Color.PINK);
        label1 = new JLabel("gelir");
        label1.setSize(100, 100);
        label1.setBounds(100, 140, 100, 40);
        panel.add(label1);

        label2 = new JLabel("gider");
        textField1 = new JTextField();
        textField1.setBounds(100, 180, 100, 40);
        label2.setSize(100, 100);
        label2.setBounds(100, 220, 100, 40);
        panel.add(label2);
        panel.add(textField1);
        textField2 = new JTextField();
        textField2.setBounds(100, 260, 100, 40);
        panel.add(textField2);

        label3 = new JLabel("ciro");
        label3.setBounds(100, 300, 100, 40);
        panel.add(label3);

        textField3 = new JTextField();
        textField3.setBounds(100, 340, 100, 40);
        panel.add(textField3);

        String data[][] = {{ilacpanel.getBarkod().getText(), ilacpanel.getIsim().getText(), "120", "1"},
        {"002", "Arveles", "120", "1"},
        {"003", "N-Cort", "50", "1"}};
        String column[] = {"ID", "ISIM", "FIYAT", "ADET"};
        tablo = new JTable(data, column);
        tablo.setSize(300, 300);
        tablo.setBounds(100, 250, 300, 300);
        sp = new JScrollPane(tablo);
        sp.setSize(300, 300);
        sp.setBounds(300, 300, 300, 300);
        panel.add(sp);
        cirowindow.add(panel);
    }

    public JFrame getCirowindow() {
        return cirowindow;
    }

    public void setCirowindow(JFrame cirowindow) {
        this.cirowindow = cirowindow;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getHesapla() {
        return hesapla;
    }

    public void setHesapla(JButton hesapla) {
        this.hesapla = hesapla;
    }

    public JTable getFiyattablo() {
        return fiyattablo;
    }

    public void setFiyattablo(JTable fiyattablo) {
        this.fiyattablo = fiyattablo;
    }

    public int getTextField1() {
        return Integer.parseInt(textField1.getText());
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public int getTextField2() {
        return Integer.parseInt(textField2.getText());
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public int getTextField3() {
        return Integer.parseInt(textField3.getText());

    }

    public void setTextField3(int solution) {
        textField3.setText(Integer.toString(solution));
    }

    public JLabel getLabel3() {
        return label3;
    }

    public void setLabel3(JLabel label3) {
        this.label3 = label3;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
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

    public JTable getTablo() {
        return tablo;
    }

    public void setTablo(JTable tablo) {
        this.tablo = tablo;
    }

}
