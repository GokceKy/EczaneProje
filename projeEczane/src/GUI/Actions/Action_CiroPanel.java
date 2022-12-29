/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Actions;

import Entity.Hesap;
import GUI.CiroPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aybala
 */
public class Action_CiroPanel implements ActionListener {

    public CiroPanel ciropanel = new CiroPanel();
    private Hesap hesapla = new Hesap();

     public Action_CiroPanel( CiroPanel ciropanel ,Hesap hesapla) {
         this.ciropanel=ciropanel;
         this.hesapla=hesapla;
        ciropanel.getHesapla().addActionListener(this);
    }

    public Action_CiroPanel() {
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == ciropanel.getHesapla().getActionCommand()) {
            int first, second = 0;
            try {
                first = ciropanel.getTextField1();
                second = ciropanel.getTextField2();
                hesapla.top(first, second);

                ciropanel.setTextField3(hesapla.getVal());
                System.out.println(hesapla.getVal());

            } catch (NumberFormatException ex) {

            }
        }

    }

}
