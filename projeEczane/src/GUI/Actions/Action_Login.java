/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Actions;

import GUI.Ana;
import GUI.IlacPanel;
import GUI.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aybala
 */
public class Action_Login implements ActionListener {

    public Login log;
    public IlacPanel Panel;
    public Ana ana;

    public Action_Login(Login log, IlacPanel Panel, Ana ana) {
        this.log = log;
        this.Panel = Panel;
        this.ana = ana;
        ana.getLogin().getB1().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String TcValue = ana.getLogin().getTextField1().getText();
        String passValue = ana.getLogin().getTextField2().getText();

        if (TcValue.equals("12345678") && passValue.equals("123")) {

            System.out.println("giriş başarılı");

            Panel.getWindow2().setVisible(true);
            log.getoptionpane1();

            //ana.setPanelana(Panel.getPan());
            //ana.getPanel.;
            //   log.getWindow().remove(log.getNewPanel());
            // log.getNewPanel().removeAll();
            //    log.setwindow(Panel.getPan());
            //   log.getWindow().setVisible(true);
            // log.setNewPanel(Panel.getPan());
            // log.getWindow().setVisible(true);
            //  JLabel wel_label = new JLabel("Welcome: "+TcValue);  
            // page.getContentPane().add(wel_label);  
        } else if (TcValue.equals("123") && passValue.equals("123")) {
            log.getoptionpane2();
            Panel.getWindow2().setVisible(true);
        } else {
            log.getoptionpane3();
            System.out.println("Yanlıs sifre girisi veya tc");
        }
    }
}
