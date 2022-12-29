/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Modal.Entity.DataAccess;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Aybala
 */
public class IlacPanel {

    JFrame window2;
    JPanel pan;
    JButton ekle;
    JButton sil;
    JButton listele;
    JButton Depo;
    JScrollPane sp;
    JTextField isim, barkod, id;
    JPanel panel2;
    JTable tablo;
    JLabel label1,label2;
    JOptionPane pane1, pane2,pane3,pane4;

    public IlacPanel() {
        pan = new JPanel();

        pan.setSize(10000, 1000);
        Depo = new JButton("DEPO");
        Depo.setBounds(100, 400, 100, 100);

        createWindow();
        window2.setLayout(null);
        createEkle();
        createIsim();
        createBarkod();

        sil = new JButton("İLAC SİL");
        sil.setBounds(100, 200, 150, 50);
        pan.add(sil);
        listele = new JButton("İLAC LİSTELE");
        listele.setBounds(100, 300, 150, 50);
        pan.add(listele);
        pan.setBackground(Color.PINK);
        JTextArea textArea = new JTextArea(250, 250);

        pan.add(Depo);
        label1=new JLabel("ilac ismi:");
        label1.setSize(100,100);
        label1.setBounds(300, 90, 150, 40);
        pan.add(label1);
        label2=new JLabel("barkodu i");
        label2.setSize(100,100);
        label2.setBounds(300, 220, 150, 40);
        pan.add(label2);

        window2.add(pan);

    }

    public void createWindow() {
        window2 = new JFrame();
        window2.setSize(10000, 1000);
        pan.setLayout(null);

        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void getpane1() {
        JOptionPane.showMessageDialog(window2, "Listeleme başarıyla yapıldı", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
     public void getpane4() {
        JOptionPane.showMessageDialog(window2, "ilaç ismi yanlış", "Alert", JOptionPane.ERROR_MESSAGE);
    }
      public void getpane3() {
        JOptionPane.showMessageDialog(window2, "barkod yanlış girildi", "Alert", JOptionPane.ERROR_MESSAGE);
    }

    public void createEkle() {
        ekle = new JButton("ILAC EKLE");
        ekle.setSize(50, 50);

        ekle.setBounds(100, 100, 150, 50);

        pan.add(ekle);
    }

    public void createIsim() {
        isim = new JTextField("parol");
        isim.setSize(200, 50);

        isim.setBounds(300, 100, 150, 40);

        pan.add(isim);
    }

    public void createBarkod() {
        barkod = new JTextField("1315");
        barkod.setSize(200, 60);

        barkod.setBounds(300, 150, 150, 40);
        id = new JTextField();
        id.setSize(200, 60);

        id.setBounds(300, 200, 150, 40);
        pan.add(id);

        pan.add(barkod);
    }

    public JFrame getWindow2() {
        return window2;
    }

    public void setWindow2(JFrame window2) {
        this.window2 = window2;
    }

    public JPanel getPan() {
        return pan;
    }

    public void setPan(JPanel pan) {
        this.pan = pan;
    }

    public JButton getEkle() {
        return ekle;
    }

    public void setEkle(JButton ekle) {
        this.ekle = ekle;
    }

    public JButton getSil() {
        return sil;
    }

    public void setSil(JButton sil) {
        this.sil = sil;
    }

    public JTextField getId() {
        return id;
    }

    public void setId(JTextField id) {
        this.id = id;
    }

    public JButton getListele() {
        return listele;
    }

    public JButton getDepo() {
        return Depo;
    }

    public void setDepo(JButton Depo) {
        this.Depo = Depo;
    }

    public void setListele(JButton listele) {
        this.listele = listele;
    }

    public JTextField getIsim() {
        return isim;
    }

    public void setIsim(JTextField isim) {
        this.isim = isim;
    }

    public JTextField getBarkod() {
        return barkod;
    }

    public void setBarkod(JTextField barkod) {
        this.barkod = barkod;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

}
